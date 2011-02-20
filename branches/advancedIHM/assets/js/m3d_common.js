/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 */

if (!window["M3D"]) {
    window["M3D"] = {};
}

if (!window["M3D"].Common) {
    window["M3D"].Common = {};
}

(function(M3D){

	// global constants
	M3D.REGEX_ALPHANUMERIC = /^[A-z0-9_\-]+$/g;
	M3D.REGEX_NUMBER = /^[0-9]+$/g;
	
    // -- print a log text
    M3D.Common.log = log = function(){
        if (console) {
            var script = "console.log('[M3D]', arguments[0]";
			for(var i=1;i<arguments.length;i++){ script += ",arguments["+i+"]"; }
			script += ")";
			eval(script);
		}
        else 
            alert('console.log() was not found! Please deactivate the debug mode!');
    }
    
    // -- print selected option for select input
    M3D.Common.printSelected = function(a, b){
        var ret = "";
        if (a == b) {
            ret = "selected='true'";
        }
        return ret;
    };
    
    
    // -- check if it's a valid type
    M3D.Common.isValidType = function(t){
        var i;
        var arr = ['string', 'number', 'boolean'];
        for (i in arr) {
            if (typeof(t) == arr[i]) 
                return true;
        };
        return false;
    };
	
	// -- validate form inputs
	M3D.Common.isEmpty = function(val){
		return val === '';
	}
	M3D.Common.isAlphanumeric = function(val){
		return M3D.REGEX_ALPHANUMERIC.test(val);
	}
	M3D.Common.isNumber = function(val){
		return M3D.REGEX_NUMBER.test(val);
	}
	
    
})(window["M3D"]);