/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @namespace M3D.Upload
 * @file assets/js/m3d_upload.js
 * @url http://code.google.com/p/3dminigames/source/browse/trunk/IHM/assets/js/m3d_upload.js
 * @projectDescription Upload files to the server using HTML 5 Drag and drop the folders on your local computer
 */

/**
 * Ajax file upload 
 * @see assets/js/lib/fileploader.js
 */
M3D.Upload.AJAXUpload = function(){            
    var uploader = new qq.FileUploader({
        element: document.getElementById('upload-model'),
        action: M3D.Config.uploader,
		allowedExtensions: ["dae"],
		sizeLimit: 5 * 1024 * 1024, // 5M
		params: {'_':(new Date()).getTime()},
		onSubmit: function(id, fileName){
			M3D.GUI.showWaiting();
		},
		onProgress: function(id, fileName, loaded, total){
			$('#status').show().text('Uploading '+fileName+'... ('+loaded+'%)');
		},
		onComplete: function(id, fileName, responseJSON){
			
			if ( responseJSON.success ){
				var url = 'assets/dae/custom/'+fileName;
				document.getElementById('myModels').innerHTML += "<option value='"+url+"' selected='true'>"+fileName+"</option>";
				$('#status').show().text(fileName+' uploaded!');
				M3D.GUI.importModel({
					'name':fileName,
					'docUrl':url
				});
			}
			else {
				$('#status').show().text(fileName+' NOT uploaded!');
			}			
			M3D.GUI.hideWaiting();
			
			setTimeout(function(){
				$('#status').hide().text('');
			}, 2000);
		},
		onCancel: function(id, fileName){
			M3D.GUI.hideWaiting();
			$('#status').show().text(fileName+' canceled!');
			setTimeout(function(){
				$('#status').hide().text('');
			}, 2000);
		},
		showMessage: function(message){ alert(message); }
    });           
}