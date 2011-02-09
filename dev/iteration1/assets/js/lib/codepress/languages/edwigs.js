/*
 * CodePress regular expressions for edwigs syntax highlighting
 */

// edwigs
Language.syntax = [ 
	{ input : /\b([\d]+)\b/g, output : '<em>$1</em>' }, // numbers
	{ input : /\"(.*?)(\"|<br>|<\/P>)/g, output : '<s>"$1$2</s>' }, // strings double quote
	{ input : /\'(.*?)(\'|<br>|<\/P>)/g, output : '<s>\'$1$2</s>' }, // strings single quote
	{ input : /\b(Object|Character)\b/g, output : '<b>$1</b>' }, // reserved words
	{ input : /\b(is|has|at|in|if|then|endif|wait|endwait|type|rule|definition|means|command|sub|add)\b/g, output : '<u>$1</u>' }, // special words
	{ input : /([^:]|^)\/\/(.*?)(<br|<\/P)/g, output : '$1<i>//$2</i>$3' }, // comments //
	{ input : /\/\*(.*?)\*\//g, output : '<i>/*$1*/</i>' } // comments /* */
]

Language.snippets = [
	{ input : 'type', output : 'type $0 is Object ;\n\n' },
	{ input : 'hasat', output : '$0 has /*attribut*/ at /*value*/ ;\n\n' },
	{ input : 'is', output : '$0 is /*type*/;\n\n' },
	{ input : 'def', output : 'definition $0 means\n  // definition body here...\n\n' },
	{ input : 'rule', output : 'rule $0 is /*condition*/ then \n  // rule action here...\n\n' },
	{ input : 'wait', output : 'wait $0 sec then \n  // your actions here... \nendwait;\n\n' }
]

Language.complete = [
	{ input : '\'',output : '\'$0\'' },
	{ input : '"', output : '"$0"' },
	{ input : '(', output : '\($0\)' },
	{ input : '[', output : '\[$0\]' },
	{ input : '{', output : '{\n\t$0\n}' }
]

Language.shortcuts = []
