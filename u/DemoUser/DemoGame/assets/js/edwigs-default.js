/**
 * file: edwigs-default.js
 * version: 0.1
 */
	
/**
 * Set the global namespace.
 */
if (!window.EDWIGS) {
	window.EDWIGS = {};
}
/**
 * Set the GUI namespace.
 */
if (!window.EDWIGS.GUI){
	window.EDWIGS.GUI = {};
}

 
// Contants
// values in pixels
EDWIGS.GUI.ANIMATE_WINDOW_OPEN_POS = 150;
EDWIGS.GUI.ANIMATE_WINDOW_CLOSE_POS = -300;

// -- show a pop up window
EDWIGS.GUI.showPopup = function(name){

	$('#edwigs-menu').fadeOut(100);

	$('#edwigs-modal').fadeIn(100, function(){
		
		var window = $('.edwigs-window.opened'); 
		if ( window.length > 0 ){
			
			
			// the window we want is hidden, so show it!
			if ( window.attr('id') != name ){
				
				// close the opened one ...
				window.animate({ top: EDWIGS.GUI.ANIMATE_WINDOW_CLOSE_POS }, function(){
					
					// ... tag it as closed ...
					$(this).removeClass('opened').addClass('closed');

					// ... then open the new one.
					$('#'+name).addClass('opened').removeClass('closed').animate({ top:EDWIGS.GUI.ANIMATE_WINDOW_OPEN_POS }, EDWIGS.GUI.ANIMATE_WINDOW_SPEED);
					
					
				});
				
			}
			
		}
		else {
			// ... open the new window
			$('#'+name).addClass('opened').removeClass('closed').animate({ top:EDWIGS.GUI.ANIMATE_WINDOW_OPEN_POS }, EDWIGS.GUI.ANIMATE_WINDOW_SPEED);
		}
	});	
};

// -- hide an opened pop up window
EDWIGS.GUI.hidePopup = function(){
	
	$('.edwigs-window.opened').animate({ top:EDWIGS.GUI.ANIMATE_WINDOW_CLOSE_POS }, function(){
		
		$(this).removeClass('opened').addClass('closed');
		$('#edwigs-menu').fadeIn(100);
		$('#edwigs-modal').hide(100);
	});
	
};



$(function(){
	
	/**
	 * Prevent default event for all anchor tags whose href attribute begins with a '#'.
	 */
	$('a[href^="#"]').live("click", function(e){ e.preventDefault(); });
	
	/**
	 * EASTER EGG :)
	 * Bind showing the about window
	 * @see EDWIGS.GUI.showPopup
	 */
	$('#edwigs-title h1').bind('click', function(){
		EDWIGS.GUI.showPopup('edwigs-about');
	});
	
	/**
	 * Bind "cancel" buttons.
	 * @see EDWIGS.GUI.hidePopup
	 */
	$('.cancel').bind('click', EDWIGS.GUI.hidePopup);
	
	
});