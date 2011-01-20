// Web Worker
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
