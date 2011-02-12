/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_editor.js
 */
(function(M3D){
	
	// Init the editor
	M3D.Editor.init = function(){
		// TODO: get previous content
		var _c = ''; 
		if ( _c === '' ){
			_setContent('/* Game created on '+(new Date()).toGMTString()+' */\n\n');
		}
	}
	
	// get the current content
	M3D.Editor.getContent = function(){
		return edwigs.getCode();
	};
	
	// set the new content
	M3D.Editor.setContent = function(value){
		var _old = M3D.Editor.getContent();
		_old = _old === '' ? _old : _old+"\n";
		_setContent(_old+value);
	};	 
	
	// update the selected object's properties
	M3D.Editor.updateObjectAttributes = function(o){
		var NEWLINE = '\n';
		var content = M3D.Editor.getContent().split(NEWLINE);
		for(var i=0; i<content.length; i++){
			
			if ( (new RegExp(o.id+' has position')).test(content[i]) ){
				var p = o.position;
				content[i] = content[i].replace(/position at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'position at '+p.x+' '+p.y+' '+p.z);
			}
			else if ( (new RegExp(o.id+' has scale')).test(content[i]) ){
				var s = o.scale;
				content[i] = content[i].replace(/scale at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'scale at '+s.x+' '+s.y+' '+s.z);
			}
			else if ( (new RegExp(o.id+' has rotation')).test(content[i]) ){
				var r = o.rotation;
				content[i] = content[i].replace(/rotation at -?\d+.\d{2} -?\d+.\d{2} -?\d+.\d{2}/gi, 
												'rotation at '+r.x+' '+r.y+' '+r.z);
			}
		}
		_setContent( content.join(NEWLINE) );
		delete p, s, r, content;
	}
	// set the editor's content
	var _setContent = function(value){
		edwigs.edit( value, 'edwigs' );
	}
	
})(window.M3D);