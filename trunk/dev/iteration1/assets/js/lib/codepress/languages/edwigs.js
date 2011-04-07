/*
 * CodePress regular expressions for edwigs syntax highlighting
 */

// edwigs
Language.syntax = [ 
	{ input : /\b([\d]+)\b/g, output : '<em>$1</em>' }, // numbers
	{ input : /\"(.*?)(\"|<br>|<\/P>)/g, output : '<s>"$1$2</s>' }, // strings double quote
	{ input : /\'(.*?)(\'|<br>|<\/P>)/g, output : '<s>\'$1$2</s>' }, // strings single quote
	{ input : /\b(Object|Character)\b/g, output : '<b>$1</b>' }, // reserved words

//mots non-répertoriés : ranking  gravity  name  world  generic  grid  ribbon  gridsize  position  orientation  size
//game ne fait plus partie des classes et est un mot réservé
	{ input : /\b(
		 accelerates|activate|add|ai|alive|all|and|angle|anticlockwise|assign|at
		|backward|becomes|between|brakes|by
		|clockwise|command|commands|contains
		|dead|defeat|definition|dies|disable|distance|down|duplicable|during
		|efface|effaced|else|endif|ends|endwait|enter|equip|escape|expels
		|finished|first|for|forward|frame|frames|free|from
		|game|generate|grasps|generated|gets
		|happens|has|held
		|if|in|ingests|invert|is
		|jumps
		|key|keyboard|killed|kills
		|last|lclick|left|list|loop
		|mclick|means|min|mouse|moves|moving|ms|mute|muted
		|next|nexturn|not|num
		|of|off|on|or|other
		|pause|paused|person|play|played|pressed|previous
		|random|rclick|released|remove|right|rule
		|s|save|scrollDown|scrollUp|solo|space|started|starts|stop|stopped|sub
		|then|third|to|touches|touching|turns|turnbased|type
		|up|until
		|victory
		|wait|waiting|with
		)\b/g, output : '<u>$1</u>' }, // special words (and they are fucking lot)
	{ input : /([^:]|^)\/\/(.*?)(<br|<\/P)/g, output : '$1<i>//$2</i>$3' }, // comments //
	{ input : /\/\*(.*?)\*\//g, output : '<i>/*$1*/</i>' } // comments /* */
]

Language.snippets = [
//   1. Partie Description du jeu
	{ input : 'game', output : 'game has $0 at    ;\n\n' },

//   2. Partie Déclaration de nouveaux types
	{ input : 'type', output : 'type $0 is    ;\n\n' }, // le nouveau type sera forcément de type Object
	{ input : 'typea', output : 'type $0 is    and     ;\n\n' },
	{ input : 'typeaa', output : 'type $0 is    and    and    ;\n\n' },

//   3. Partie Initialisations
	{ input : 'has', output : 'has $0 at    ;\n\n' },// ce has est différencié de l'autre car pour l'autre on appuie sur espace et pas tab
//	{ input : 'is', output : '$0 is /*type*/ ;\n\n' },//on a pas l'habitude de taper un mot qui arrivera après (is)
	{ input : 'isd', output : 'is $0 duplicable ;\n\n' },
	{ input : 'iso', output : 'is Object ;\n$0' },
	{ input : 'ist', output : 'is Team ;\n\n$0' },
	{ input : 'isp', output : 'is Player ;\n\n$0' },
	{ input : 'iscam', output : 'is Camera ;\n\n$0' },

//   4. Partie Définitions;
	{ input : 'def', output : 'definition $0 means\n  // definition body here...\n;\n\n' },
	{ input : 'if', output : 'if $0 then\n  // your actions here...\nendif\n' },
	{ input : 'if;', output : 'if $0 then\n  // your actions here...\nendif ;\n\n' },
	{ input : 'if,', output : 'if $0 then\n  // your actions here...\nendif ,\n' },
	{ input : 'ifelse', output : 'if $0 then\n  // your actions here...\nelse\n  // your actions here...\nendif\n' },
	{ input : 'ifelse;', output : 'if $0 then\n  // your actions here...\nelse\n  // your actions here...\nendif ;\n\n' },
	{ input : 'ifelse,', output : 'if $0 then\n  // your actions here...\nelse\n  // your actions here...\nendif ,\n' },
	{ input : 'wait', output : 'wait $0 s then \n  // your actions here...\nendwait\n' },
	{ input : 'wait;', output : 'wait $0 s then \n  // your actions here...\nendwait ;\n\n' },
	{ input : 'wait,', output : 'wait $0 s then \n  // your actions here...\nendwait ,\n' },

	{ input : 'acc', output : 'accelerates by $0 ;\n' },
	{ input : 'brk', output : 'brakes by $0 ;\n' },

	{ input : 'add', output : 'add $0 to    ;\n' },
	{ input : 'sub', output : 'sub $0 to    ;\n' },
	{ input : 'assign', output : 'assign $0 to    ;\n' },
	{ input : 'invert', output : 'invert $0 and    ;\n' },

	{ input : 'rand', output : 'random between $0 and    ' },
	{ input : 'dist', output : 'distance between $0 and    ' },
	{ input : 'angle', output : 'angle between $0 and    ' },

	{ input : 'during', output : 'during $0 s' },
	{ input : 'until', output : 'until $0 happens' },

	{ input : 'v', output : 'victory of $0' },
	{ input : 'd', output : 'defeat of $0' },

//   5. Partie Commandes
	{ input : 'cmd', output : 'command for $0 is\n  // your commands here...\n;\n\n' },

//   6. Partie Règles du jeu
	{ input : 'rule', output : 'rule $0 then \n  // rule action here...\n\n' },

//   7. Partie Intelligence Artificielle 
	{ input : 'ai', output : 'ai $0 is \n // your rules here... ;\n\n' },

//   8. mots uniques
	{ input : 'bw', output : 'backward $0' },
	{ input : 'fw', output : 'forward $0' },
	{ input : 'cw', output : 'clockwise $0' },
	{ input : 'acw', output : 'anticlockwise $0' },
	{ input : 'cmds', output : 'commands $0' },
	{ input : 'end', output : 'game ends ;\n\n$0' },

	{ input : 'gen', output : 'generate $0' },
	{ input : 'eff', output : 'efface $0' }
]

Language.complete = [
	{ input : '\'',output : '\'$0\'' },
	{ input : '"', output : '"$0"' },
	{ input : '(', output : '\($0\)' },
	{ input : '[', output : '\[$0\]' },
	{ input : '<', output : '\<$0\>' },
	{ input : '{', output : '{\n\t$0\n}' }
]

Language.shortcuts = []
