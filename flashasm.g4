grammar flashasm;

@parser::header {
  import java.util.Map;
  import java.util.HashMap;
  import java.io.File;
}

@parser::members {
  private Map<String, String> memory = new HashMap<String, String>();
  private String Lastfile;

  private void putInMemory(String key, String str) {
    String value;
    if(str.startsWith("\"")) {
      value = str.substring(1, str.length() - 1);
    }
    else {
      value = memory.get(str);
    }
    memory.put(key, value);
  }
    private static String getParentDirPath(String fileOrDirPath) {
        boolean endsWithSlash = fileOrDirPath.endsWith(File.separator);
        return fileOrDirPath.substring(0, fileOrDirPath.lastIndexOf(File.separatorChar,
                endsWithSlash ? fileOrDirPath.length() - 2 : fileOrDirPath.length() - 1));
    }
	  private void insertTokens(String fileName) {
	    try {
            String tehfilename = fileName.replace("\"","");
	        String myfile;
            String path = getParentDirPath(_input.getSourceName());
            File dir = new File(path);
	        myfile = path.concat("/"+tehfilename);
            if(!new File(myfile).exists())
            {
                myfile = path.concat("/"+Lastfile.concat("/"+tehfilename));
            }
	      	CommonTokenStream thatStream = new CommonTokenStream(new flashasmLexer(new ANTLRFileStream(myfile)));
	      thatStream.fill();
	      List extraTokens = thatStream.getTokens();
	      extraTokens.remove(extraTokens.size() - 1); // remove EOF
	      CommonTokenStream thisStream = (CommonTokenStream)this.getTokenStream();
	      thisStream.getTokens().addAll(thisStream.index(), extraTokens);
            Lastfile = thatStream.getText().substring(thatStream.getText().indexOf("refid"),thatStream.getText().indexOf(":")).replace(".","/").substring(6).replace("\"","");
	    } catch(Exception e) {
	      e.printStackTrace();
	    }
	  }
}

fragment INTEGER: [0-9]+;
fragment SPACES: ' '*;
fragment ANYTHING: (.*?)'\n';
QUOTE:'\"'(.*?)'\"';
PROGRAM: 'program';
BODY: 'body';
CODE: 'code';
TRY: 'try';
POP: 'pop';
SCRIPT: 'script';
MAXSTACK: 'maxstack ' INTEGER;
REFID: 'refid';
refid: REFID QUOTE;
RETURNVIOD: 'returnvoid';
LOCALCOUNT: 'localcount ' INTEGER;
INITSCOPEDEPTH: 'initscopedepth ' INTEGER;
MAXSCOPEDEPTH: 'maxscopedepth ' INTEGER;
GETLOCAL: 'getlocal'SPACES [0-9];
GETLOCAL0: 'getlocal0';
GETLOCAL1: 'getlocal1';
GETLOCAL2: 'getlocal2';
GETLOCAL3: 'getlocal3';
GETLOCAL4: 'getlocal4';
SETLOCAL:  'setlocal' SPACES [0-9];
SETLOCAL0: 'setlocal0';
SETLOCAL1: 'setlocal1';
SETLOCAL2: 'setlocal2';
SETLOCAL3: 'setlocal3';
SETLOCAL4: 'setlocal4';
CLASS: 'class';
PUSHSCOPE: 'pushscope';
POPSCOPE: 'popscope';
END : 'end';
IINIT: 'iinit';
CINIT: 'cinit';
PUSHFALSE:'pushfalse';
PUSHTRUE:'pushtrue';
GETPROPERTY:'getproperty' SPACES ANYTHING;
FINDPROPERTY:'findproperty' SPACES ANYTHING;
CALLPROPERTY: 'callproperty' SPACES ANYTHING;
RETURNVALUE:'returnvalue';
MINORVERSION: 'minorversion ' INTEGER;
MAJORVERSION: 'majorversion ' INTEGER;
SINIT: 'sinit';
GETSCOPEOBJECT: 'getscopeobject' SPACES INTEGER;
GETLEX: 'getlex';
qnamefun:QNAME PACKAGENAMESPACE QUOTE ')'','QUOTE')';
getlex:GETLEX qnamefun;
NEWCLASS: 'newclass';
newclass:NEWCLASS QUOTE;
INITPROPERTY:'initproperty';
initproperty: INITPROPERTY qnamefun;
TRAIT:'trait';
INCLUDE: '#include ';
INSTANCE:'instance';
EXTENDSF: 'extends';
extendsf: EXTENDSF qnamefun;
FLAG: 'flag ' ANYTHING;
PROTECTEDNS: 'protectedns ' ANYTHING;
FINDPROPSTRICT:'findpropstrict' SPACES ANYTHING;
CONSTRUCTSUPER: 'constructsuper' SPACES [0-9]+;
CONSTRUCTPROP: 'constructprop' SPACES ANYTHING;
PUSHSTRING: 'pushstring';
pushstring:PUSHSTRING QUOTE;
COERCE:'coerce';
coerce: COERCE qnamefun;
SETPROPERTY:'setproperty';
setproperty:SETPROPERTY qnamefun;
CALLPROPVOID: 'callpropvoid' SPACES ANYTHING;
PACKAGENAMESPACE:'PackageNamespace(';
QNAME:'QName(';
include: INCLUDE FileName {insertTokens($FileName.text);};
VERSION: '#version ' INTEGER;
SLOTID:'slotid '[0-9];
LABEL: 'L'[0-9]*':\n';
//start here
flashasm: program EOF;
program: VERSION PROGRAM MINORVERSION MAJORVERSION (script)* END;
script: SCRIPT (sinit)* (trait)*  END;
body: BODY MAXSTACK LOCALCOUNT INITSCOPEDEPTH MAXSCOPEDEPTH (code)* END ;
code: CODE internalcode END;
flashasmclass: CLASS refid (instance)* (cinit)* END;
iinit: IINIT refid (body)* END;
cinit: CINIT refid (body)* END;
sinit: SINIT refid (body)* END;
instance: INSTANCE qnamefun (extendsf) (FLAG)* PROTECTEDNS (iinit)* END;
internalcode: (
GETLOCAL
|GETLOCAL0
|GETLOCAL1
|GETLOCAL2
|GETLOCAL3
|GETLOCAL4
|SETLOCAL
|SETLOCAL0
|SETLOCAL1
|SETLOCAL2
|SETLOCAL3
|SETLOCAL4
|POP
|POPSCOPE
|PUSHSCOPE
|GETSCOPEOBJECT
|getlex
|newclass
|initproperty
|RETURNVIOD
|TRAIT
|FINDPROPSTRICT
|PUSHFALSE
|RETURNVALUE
|GETPROPERTY
|FINDPROPERTY
|CALLPROPERTY
|LABEL
|CONSTRUCTSUPER
|CONSTRUCTPROP
|coerce
|pushstring
|setproperty
|CALLPROPVOID
)+;

trait: TRAIT CLASS qnamefun SLOTID (flashasmclass)* END;



WS
   : (' ' | '\t' | '\n' | '\r') -> skip
   ;
LINE_COMMENT
   : ';' ~ ('\n' | '\r')* '\r'? '\n' -> skip
   ;
FileName: '"' ~'"'* '"';