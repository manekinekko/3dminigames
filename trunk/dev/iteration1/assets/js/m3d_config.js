/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_config.js
 * @projectDescription This is a config file.
 */
$(document).ready(function()
{
  $.ajax({
    type: "GET",
    url: "config.xml",
    dataType: "xml",
	beforeSend : function(){},
    success: function (xmldata){
			  var _xml = $(xmldata);
			  
			  M3D.Config.version = _xml.find('version').text();
			  M3D.Config.uploader = _xml.find('uploader').attr('url');
			  M3D.Config.compiler = _xml.find('compiler').attr('url');

	},
	complete: function(){
		
		$('#title').append(" - ver"+M3D.Config.version);
		
	}
  });
});