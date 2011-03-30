/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_webworker.js
 * @deprecated this file is not yet used! 
 */
self.addEventListener('message', function(e){

	var data = e.data;
	
	switch (data.cmd) {
	    
		case 'load':
	        self.postMessage('Model loaded: ' + data.extra.url);
	        break;
	        
	    default:
	        self.postMessage('Unknown command: ' + data.cmd);
	
	};
	
}, false);
