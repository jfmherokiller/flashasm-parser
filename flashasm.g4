grammar flashasm;
fragment INTEGER: [0-9]+;
fragment SPACES: ' '*;
fragment ANYTHING: (.*?)'\n';
PROGRAM: 'program';
BODY: 'body';
CODE: 'code';
TRY: 'try';
SCRIPT: 'script';
MAXSTACK: 'maxstack ' INTEGER;
REFID: 'refid \"'.*?'\"';
RETURNVIOD: 'returnvoid';
LOCALCOUNT: 'localcount ' INTEGER;
INITSCOPEDEPTH: 'initscopedepth ' INTEGER;
MAXSCOPEDEPTH: 'maxscopedepth ' INTEGER;
GETLOCAL0: 'getlocal0';
PUSHSCOPE: 'pushscope';
POPSCOPE: 'popscope';
END : 'end';
MINORVERSION: 'minorversion ' INTEGER;
MAJORVERSION: 'majorversion ' INTEGER;
SINIT: 'sinit';
GETSCOPEOBJECT: 'getscopeobject' SPACES INTEGER;
GETLEX: 'getlex' ANYTHING;
NEWCLASS: 'newclass' SPACES '\"'(.*?)'\"';
INITPROPERTY:'initproperty' SPACES ANYTHING;
TRAIT:'trait' ANYTHING;
INCLUDE: '#include ''\"'(.*?)'\"';
VERSION: '#version ' INTEGER;
flashasm: program EOF;
program: VERSION PROGRAM MINORVERSION MAJORVERSION (INCLUDE)* (script)* (trait)* END;
script: SCRIPT SINIT REFID (body)* END;
body: BODY MAXSTACK LOCALCOUNT INITSCOPEDEPTH MAXSCOPEDEPTH (code)* END ;
code: CODE internalcode END;
internalcode: (GETLOCAL0 |POPSCOPE |PUSHSCOPE |GETSCOPEOBJECT |GETLEX |NEWCLASS|INITPROPERTY |RETURNVIOD |TRAIT)+;
trait: TRAIT INCLUDE END;

//WS : (.+) -> skip;

WS
   : (' ' | '\t' | '\n' | '\r') -> skip
   ;
LINE_COMMENT
   : ';' ~ ('\n' | '\r')* '\r'? '\n' -> skip
   ;