/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Common
 * @file assets/js/m3d_common.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_common.js
 * @projectDescription This file includes some convenient functions.
 */
(function(M3D) {

	/**
	 * Global constants
	 */
	M3D.REGEX_ALPHANUMERIC = /^[A-Za-z0-9_\-]+$/g;
	M3D.REGEX_NUMBER = /^[0-9]+$/g;

	/**
	 * Print a log text. This function taks an infinite number of parameters.
	 * @param {Mixed} An unlimited number of parameters
	 */
	M3D.Common.log = log = function() {
		if (console) {
			var script = "console.info('[3DWIGS]', arguments[0]";
			for(var i=1;i<arguments.length;i++) {
				script += ",arguments["+i+"]";
			}
			script += ")";

			// the eval function is very very bad!!
			// but hoppefully it must be disabled during prod cycle!!
			eval(script);
		} else {
			alert('console.log() was not found! Please disable the log feature.');
		}
	};
	/**
	 * A convenient function that prints out a select propety of a select box.
	 * @param {String} a The first value (from the select box)
	 * @param {String} b The second value (that should be selected)
	 * @return selected='true' or empty string
	 * @type {string}
	 */
	M3D.Common.printSelected = function(a, b) {
		return (a === b) ? "selected='true'" : "";
	};
	/**
	 * This function checks if a given type is a valid one.
	 * @param {String} t The type that must be checked
	 * @return True if t is a valid type, False if not
	 * @return {Boolean}
	 */
	M3D.Common.isValidType = function(t) {
		var i;
		var arr = ['string', 'number', 'boolean'];
		for (i in arr) {
			if (typeof(t) === arr[i]) {
				return true;
			}
		}
		return false;
	};
	/**
	 * Checks if a given value is empty
	 * @param {String} val The value that must be checked
	 * @return True if val is empty, False if not
	 * @type {Boolean}
	 */
	M3D.Common.isEmpty = function(val) {
		return typeof(val) === 'string' && val === '';
	};
	/**
	 * Checks if a given value matches an alphanumeric pattern.
	 * @param {String} val The value that must be checked
	 * @return True if val is an alphanumeric value, False if not
	 * @type {Boolean}
	 */
	M3D.Common.isAlphanumeric = function(val) {
		return M3D.REGEX_ALPHANUMERIC.test(val);
	};
	/**
	 * Checks if a given value matches a number pattern.
	 * @param {String} val The value that must be cheked
	 * @return True if val is a number, False if not
	 * @type {Boolean}
	 */
	M3D.Common.isNumber = function(val) {
		return M3D.REGEX_NUMBER.test(val);
	};
	/**
	 * Upper case the first letter of a given string.
	 * @param {String} value The value that must be a first letter upper cased
	 * @return The same value with the first letter upper cased
	 * @type {String}
	 */
	M3D.Common.ucfirst = function(value) {

		if (typeof(value) !== "string" || value === "") {
			return "";
		}
		var _first = value.substring(0,1).toUpperCase();
		return _first+value.substring(1);
	};
	/**
	 * Get the object's ID given its UID
	 * @param {String} The Object's UID
	 * @return The Object's ID uppercased
	 * @type {String}
	 */
	M3D.Common.getObjectId = function(uid) {
		return M3D.Common.ucfirst($('#select-model option[value="'+uid+'"]').text());
	};
	/**
	 * Minimal implementation of the sprintf function of PHP
	 * @param {Array} Unlimited String parameters where the 1st is the format.
	 * The format string is composed of zero or more directives
	 * @return The string produced according to the formatting string format
	 * @type {String}
	 */
	M3D.Common.sprintf = function () {
		var _str = arguments[0];
		for(var i=1; i<arguments.length; i++) {
			_str = _str.replace('%s', arguments[i])
		}
		return _str;
	}
	/**
	 * Extract the X, Y and Z properties from the game rule
	 * @param {String} str The game rule
	 * @return NULL if no properties were found. An object with x, y 
	 * and z properties otherwise
	 * @type {Object}
	 */
	M3D.Common.extractPropertiesFromRule = function(str){
		var _index = str.search(' at ');
		var _end = str.search(';');
		var _coo = [];
		if ( _index !== -1 ){
			_coo = $.trim(str.substring(_index+4, _end)).split(' '); // array of string
			return {
				x: _coo[0],
				y: _coo[1],
				z: _coo[2]
			};
		}
		
		return null;
	}
})(window.M3D);