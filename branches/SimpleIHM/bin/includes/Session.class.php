<?php
/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file bin/includes/Session.class.php
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/bin/includes/Session.class.php
 * @projectDescription This PHP classe handles the session environment.
 */
class Session
{

	protected $users = array ();
	
	private $_users_file;

	// instance de la classe
	private static $instance;

	// Un constructeur privé ; empêche la création directe d'objet
	private function __construct()
	{
		session_start();

		$_SESSION['error'] = "";

		$this->_users_folder = APPPATH.DS.'u';
		$this->_users_file = $this->_users_folder.'/users.txt';

		$this->users = $this->_fileToArray($this->_users_file);

		//var_dump($this->users);
	}

	public static function getInstance()
	{
		if (! isset (self::$instance))
		{
			$c = __CLASS__ ;
			self::$instance = new $c;
		}

		return self::$instance;
	}

	// Empecher le clonage de l'instance
	public function __clone()
	{
		trigger_error('No clonning allowed!', E_USER_ERROR);
	}

	//
	public function login($login, $password)
	{
		if (in_array($login, array_keys($this->users)))
		{
			if (md5($password) == $this->users[$login])
			{
				$this->_set( array ('login'=>$login));
				//var_dump($this->get('login'));
				return true;
			}
		}

		return false;
	}

	public function logout()
	{
		$this->_unset( array ('login'));
	}

	//
	public function ok()
	{
		return $this->get('login');
	}

	//
	public function get($str)
	{
		return isset ($_SESSION[$str])?$_SESSION[$str]:false;
	}

	//
	public function _set($array)
	{
		foreach ($array as $k=>$v)
		{
			$_SESSION[$k] = $v;
		}
	}

	//
	public function _unset($array)
	{
		foreach ($array as $k)
		{
			unset ($_SESSION[$k]);
		}
	}

	//
	public function _fileToArray($filepath)
	{
		$f = file($filepath);
		if ( empty($f) ) exit("[ERROR] There are no registered users!");

		$d = array ();
		foreach ($f as $line_num=>$line)
		{
			if ($line != "")
			{
				$tmp_arr = explode(':', $line);
				/**
				 * [0] : login
				 * [1] : profile
				 * [2] : password
				 * [3] : extra
				 */
				$d[$tmp_arr[0]] = $tmp_arr[2];
			}
		}

		return $d;
	}

}

// On crée un singleton
$session = Session::getInstance();

?>
