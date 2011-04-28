/**
 * @author CHEGHAM Wassim <wassim.chegham@gmail.com>
 * @file assets/js/m3d_config.js
 * @projectDescription This script loads a configuration data from an XML file.
 */
$(document).ready(function()
{
  $.ajax({
    type: "GET",
    url: "config.xml",
    dataType: "xml",
	beforeSend : function(){
		$('#loading-message').text('Loading the UI configuration...');
	},
    success: function (xmldata){
			  var _xml = $(xmldata);
			  
			  M3D.Config.version = _xml.find('version').text();
			  M3D.Config.uploader = _xml.find('name:contains("uploader")').parent().find('url').text();
			  M3D.Config.compiler = _xml.find('name:contains("compiler")').parent().find('url').text();


	},
	complete: function(){

		setTimeout(function(){
			$('#loading-message').text('UI configuration loaded!');
		}, 1000);
		$('#title').append(" - ver"+M3D.Config.version);

	}
  });
});