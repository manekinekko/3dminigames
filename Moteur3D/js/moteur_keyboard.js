/**
 * Moteur3d de 3DWIGS: moteur_key.js
 * Fichier contenant permettant de savoir si une touche est activée ou pas.
 *
 * @author: Jérôme BOUZILLARD, Emeric KIEN, Thibault LE CORRONC, Philippe WEINZAEPFEL and Ludovic ZADITH
 * @version 1.02.28
 */

var KEY_DOWN = false;
var KEY_UP = false;
var KEY_LEFT = false;
var KEY_RIGHT = false;

var KEY_END	= false;
var KEY_BEGIN = false;

var KEY_BACK_TAB = false;
var KEY_TAB	= false;
var KEY_SH_TAB = false;
var KEY_ENTER = false;
var KEY_ESC	= false;
var KEY_SPACE = false;
var KEY_DEL	= false;

var KEY_A = false;
var KEY_B = false;
var KEY_C = false;
var KEY_D = false;
var KEY_E = false;
var KEY_F = false;
var KEY_G = false;
var KEY_H = false;
var KEY_I = false;
var KEY_J = false;
var KEY_K = false;
var KEY_L = false;
var KEY_M = false;
var KEY_N = false;
var KEY_O = false;
var KEY_P = false;
var KEY_Q = false;
var KEY_R = false;
var KEY_S = false;
var KEY_T = false;
var KEY_U = false;
var KEY_V = false;
var KEY_W = false;
var KEY_X = false;
var KEY_Y = false;
var KEY_Z = false;

var KEY_PF1	= false;
var KEY_PF2	= false;
var KEY_PF3	= false;
var KEY_PF4	= false;
var KEY_PF5	= false;
var KEY_PF6	= false;
var KEY_PF7	= false;
var KEY_PF8	= false;

(function(M3D){

	M3D.MOTEUR.checkKeyDown = function(event){
		var intKeyCode = event.keyCode;
		
		if(intKeyCode == 40) KEY_DOWN = true;
		if(intKeyCode == 38) KEY_UP = true;
		if(intKeyCode == 37) KEY_LEFT = true;
		if(intKeyCode == 39) KEY_RIGHT = true;
		
		if(intKeyCode == 35) KEY_END = true;
		if(intKeyCode == 36) KEY_BEGIN = true;
		
		if(intKeyCode == 8) KEY_BACK_TAB = true;
		if(intKeyCode == 9) KEY_TAB = true;
		if(intKeyCode == 16) KEY_SH_TAB = true;
		if(intKeyCode == 13) KEY_ENTER = true;
		if(intKeyCode == 27) KEY_ESC = true;
		if(intKeyCode == 32) KEY_SPACE = true;
		if(intKeyCode == 46) KEY_DEL = true;
		
		if(intKeyCode == 65) KEY_A = true;
		if(intKeyCode == 66) KEY_B = true;
		if(intKeyCode == 67) KEY_C = true;
		if(intKeyCode == 68) KEY_D = true;
		if(intKeyCode == 69) KEY_E = true;
		if(intKeyCode == 70) KEY_F = true;
		if(intKeyCode == 71) KEY_G = true;
		if(intKeyCode == 72) KEY_H = true;
		if(intKeyCode == 73) KEY_I = true;
		if(intKeyCode == 74) KEY_J = true;
		if(intKeyCode == 75) KEY_K = true;
		if(intKeyCode == 76) KEY_L = true;
		if(intKeyCode == 77) KEY_M = true;
		if(intKeyCode == 78) KEY_N = true;
		if(intKeyCode == 79) KEY_O = true;
		if(intKeyCode == 80) KEY_P = true;
		if(intKeyCode == 81) KEY_Q = true;
		if(intKeyCode == 82) KEY_R = true;
		if(intKeyCode == 83) KEY_S = true;
		if(intKeyCode == 84) KEY_T = true;
		if(intKeyCode == 85) KEY_U = true;
		if(intKeyCode == 86) KEY_V = true;
		if(intKeyCode == 87) KEY_W = true;
		if(intKeyCode == 88) KEY_X = true;
		if(intKeyCode == 89) KEY_Y = true;
		if(intKeyCode == 90) KEY_Z = true;
		
		if(intKeyCode == 112) KEY_PF1 = true;
		if(intKeyCode == 113) KEY_PF2 = true;
		if(intKeyCode == 114) KEY_PF3 = true;
		if(intKeyCode == 115) KEY_PF4 = true;
		if(intKeyCode == 116) KEY_PF5 = true;
		if(intKeyCode == 117) KEY_PF6 = true;
		if(intKeyCode == 118) KEY_PF7 = true;
		if(intKeyCode == 119) KEY_PF8 = true;
	}
				
	M3D.MOTEUR.checkKeyUp = function(event){
		var intKeyCode = event.keyCode;
		
		if(intKeyCode == 40) KEY_DOWN = false;
		if(intKeyCode == 38) KEY_UP = false;
		if(intKeyCode == 37) KEY_LEFT = false;
		if(intKeyCode == 39) KEY_RIGHT = false;
		
		if(intKeyCode == 35) KEY_END = false;
		if(intKeyCode == 36) KEY_BEGIN = false;
		
		if(intKeyCode == 8) KEY_BACK_TAB = false;
		if(intKeyCode == 9) KEY_TAB = false;
		if(intKeyCode == 16) KEY_SH_TAB = false;
		if(intKeyCode == 13) KEY_ENTER = false;
		if(intKeyCode == 27) KEY_ESC = false;
		if(intKeyCode == 32) KEY_SPACE = false;
		if(intKeyCode == 46) KEY_DEL = false;
		
		if(intKeyCode == 65) KEY_A = false;
		if(intKeyCode == 66) KEY_B = false;
		if(intKeyCode == 67) KEY_C = false;
		if(intKeyCode == 68) KEY_D = false;
		if(intKeyCode == 69) KEY_E = false;
		if(intKeyCode == 70) KEY_F = false;
		if(intKeyCode == 71) KEY_G = false;
		if(intKeyCode == 72) KEY_H = false;
		if(intKeyCode == 73) KEY_I = false;
		if(intKeyCode == 74) KEY_J = false;
		if(intKeyCode == 75) KEY_K = false;
		if(intKeyCode == 76) KEY_L = false;
		if(intKeyCode == 77) KEY_M = false;
		if(intKeyCode == 78) KEY_N = false;
		if(intKeyCode == 79) KEY_O = false;
		if(intKeyCode == 80) KEY_P = false;
		if(intKeyCode == 81) KEY_Q = false;
		if(intKeyCode == 82) KEY_R = false;
		if(intKeyCode == 83) KEY_S = false;
		if(intKeyCode == 84) KEY_T = false;
		if(intKeyCode == 85) KEY_U = false;
		if(intKeyCode == 86) KEY_V = false;
		if(intKeyCode == 87) KEY_W = false;
		if(intKeyCode == 88) KEY_X = false;
		if(intKeyCode == 89) KEY_Y = false;
		if(intKeyCode == 90) KEY_Z = false;
		
		if(intKeyCode == 112) KEY_PF1 = false;
		if(intKeyCode == 113) KEY_PF2 = false;
		if(intKeyCode == 114) KEY_PF3 = false;
		if(intKeyCode == 115) KEY_PF4 = false;
		if(intKeyCode == 116) KEY_PF5 = false;
		if(intKeyCode == 117) KEY_PF6 = false;
		if(intKeyCode == 118) KEY_PF7 = false;
		if(intKeyCode == 119) KEY_PF8 = false;
	}

})(window.M3D);