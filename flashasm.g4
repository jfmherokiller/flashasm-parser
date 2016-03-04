grammar flashasm;

//@parser::header {
//  import java.util.Map;
//  import java.util.HashMap;
//  import java.io.File;
//}
//
//@parser::members {
//  private Map<String, String> memory = new HashMap<String, String>();
//  private String Lastfile;
//
//  private void putInMemory(String key, String str) {
//    String value;
//    if(str.startsWith("\"")) {
//      value = str.substring(1, str.length() - 1);
//    }
//    else {
//      value = memory.get(str);
//    }
//    memory.put(key, value);
//  }
//    private static String getParentDirPath(String fileOrDirPath) {
//        boolean endsWithSlash = fileOrDirPath.endsWith(File.separator);
//        return fileOrDirPath.substring(0, fileOrDirPath.lastIndexOf(File.separatorChar,
//                endsWithSlash ? fileOrDirPath.length() - 2 : fileOrDirPath.length() - 1));
//    }
//	  private void insertTokens(String fileName) {
//	    try {
//            String tehfilename = fileName.replace("\"","");
//	        String myfile;
//            String path = getParentDirPath(_input.getSourceName());
//            File dir = new File(path);
//	        myfile = path.concat("/"+tehfilename);
//            if(!new File(myfile).exists())
//            {
//                myfile = path.concat("/"+Lastfile.concat("/"+tehfilename));
//            }
//	      	CommonTokenStream thatStream = new CommonTokenStream(new flashasmLexer(new ANTLRFileStream(myfile)));
//	      thatStream.fill();
//	      List extraTokens = thatStream.getTokens();
//	      extraTokens.remove(extraTokens.size() - 1); // remove EOF
//	      CommonTokenStream thisStream = (CommonTokenStream)this.getTokenStream();
//	      thisStream.getTokens().addAll(thisStream.index(), extraTokens);
//            Lastfile = thatStream.getText().substring(thatStream.getText().indexOf("refid"),thatStream.getText().indexOf(":")).replace(".","/").substring(6).replace("\"","");
//	    } catch(Exception e) {
//	      e.printStackTrace();
//	    }
//	  }
//}

fragment INTEGER: [0-9]+;
fragment SPACES: ' '*;
fragment ANYTHING: (.*?)'\n';
fragment IDENTIFYER:[A-Za-z][A-Za-z0-9]*;
QUOTE: '"' (~('"' | '\\' | '\r' | '\n') | '\\' ('"' | '\\'))* '"';
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
GETLOCAL: 'getlocal'SPACES [0-9]*;
GETLOCAL0: 'getlocal0';
GETLOCAL1: 'getlocal1';
GETLOCAL2: 'getlocal2';
GETLOCAL3: 'getlocal3';
GETLOCAL4: 'getlocal4';
SETLOCAL:  'setlocal' SPACES [0-9]*;
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
GETPROPERTY:'getproperty' SPACES ANYTHING'\n';
FINDPROPERTY:'findproperty' SPACES ANYTHING;
CALLPROPERTY: 'callproperty' SPACES ANYTHING;
IMPLEMENTS:'implements' ANYTHING;
RETURNVALUE:'returnvalue';
MINORVERSION: 'minorversion ' INTEGER;
MAJORVERSION: 'majorversion ' INTEGER;
SINIT: 'sinit';
PARAM: 'param';
param: PARAM qnamefun;
GETSCOPEOBJECT: 'getscopeobject' SPACES INTEGER;
GETLEX: 'getlex';
qnamefun:QNAME '(' (PACKAGENAMESPACE| PRIVATENAMESPACE | NAMESPACE ) qnameparams;
qnameparams: ('(' (QUOTE| NULL) ')'','QUOTE')') | ('(' (QUOTE| NULL)','(QUOTE| NULL)')'','QUOTE')') ;
getlex:GETLEX qnamefun;
NEWCLASS: 'newclass';
newclass:NEWCLASS QUOTE;
INITPROPERTY:'initproperty';
initproperty: INITPROPERTY qnamefun;
TRAIT:'trait';
NULL:'null';
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
SUBTRACT:'subtract';
DUPLICATE:'dup';
INCREMENT:'increment';
MULTINAMEL:'MultinameL';
coerce: COERCE qnamefun;
SETPROPERTY:'setproperty' SPACES ANYTHING;
//setproperty:SETPROPERTY qnamefun;
CALLPROPVOID: 'callpropvoid' SPACES ANYTHING;
PACKAGENAMESPACE:'PackageNamespace';
NAMESPACE:'Namespace';
PRIVATENAMESPACE:'PrivateNamespace';
QNAME:'QName';
METHOD:'method';
LABEL:'label';
RETURNS:'returns' ANYTHING;
OPTIONAL:'optional' ANYTHING;
//include: INCLUDE FileName {insertTokens($FileName.text);};
VERSION: '#version ' INTEGER;
SLOTID:'slotid '[0-9];
JLABEL:IDENTIFYER':';
JUMP:'jump' SPACES IDENTIFYER;
CONVERT_D:'convert_d';
KILL: 'kill' SPACES INTEGER;
PUSHBYTE:'pushbyte' SPACES INTEGER;
PUSHNULL:'pushnull';
IFFALSE:'iffalse' SPACES IDENTIFYER;
CONSTRUCT:'construct' SPACES INTEGER;
CONST:'const';
TYPE: 'type';
VALUE:'value';
UTF8:'Utf8';
EQUALS:'equals';
NOT:'not';
IFTRUE:'iftrue' SPACES IDENTIFYER;
THROW:'throw';
CONVERT_B:'convert_b';
IFNE:'ifne' SPACES IDENTIFYER;
NEWARRAY:'newarray' SPACES INTEGER;
CONVERT_I:'convert_i';
INCLOCAL_I:'inclocal_i' SPACES INTEGER;
IFLT:'iflt' SPACES IDENTIFYER;
IFGT:'ifgt' SPACES IDENTIFYER;
IFNGT:'ifngt' SPACES IDENTIFYER;
ADD:'add';
MULTIPLY:'multiply';
DIVIDE:'divide';
LESSTHAN:'lessthan';
NEWOBJECT:'newobject' SPACES INTEGER;
SETSLOT:'setslot' SPACES INTEGER;
GETSLOT:'getslot' SPACES INTEGER;
LSHIFT:'lshift';
BITAND:'bitand';
RSHIFT:'rshift';
ISTYPELATE:'istypelate';
IFEQ:'ifeq' SPACES IDENTIFYER;
CONVERT_U:'convert_u';
PUSHINT:'pushint' SPACES INTEGER;
PUSHNAN:'pushnan';
PUSHSHORT:'pushshort' SPACES INTEGER;
GREATERTHAN:'greaterthan';
DECREMENT:'decrement';
GREATEREQUALS:'greaterequals';
IFNLE:'ifnle' SPACES IDENTIFYER;
PUSHUNDEFINED:'pushundefined';
//start here
flashasm: program EOF;
program: VERSION PROGRAM MINORVERSION MAJORVERSION (script)* END;
script: SCRIPT (sinit)* (trait)*  END;
body: BODY MAXSTACK LOCALCOUNT INITSCOPEDEPTH MAXSCOPEDEPTH (code)* END ;
code: CODE internalcode END;
flashasmclass: CLASS refid (instance)* (cinit)* (trait)* END;
flashasmmethod: METHOD refid (param)* (RETURNS) (FLAG)*? (OPTIONAL)*? (body)*? END;
iinit: IINIT refid (param)* (body)*  END;
cinit: CINIT refid (body)* END;
sinit: SINIT refid (body)* END;
instance: INSTANCE qnamefun (extendsf)*? (IMPLEMENTS)* (FLAG)* (PROTECTEDNS)* (iinit)* (trait)*? (flashasmmethod)* END;
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
|JLABEL
|CONSTRUCTSUPER
|CONSTRUCTPROP
|coerce
|pushstring
|SETPROPERTY
|CALLPROPVOID
|SUBTRACT
|DUPLICATE
|INCREMENT
|JUMP
|CONVERT_D
|KILL
|PUSHBYTE
|LABEL
|IFFALSE
|PUSHTRUE
|PUSHNULL
|EQUALS
|NOT
|IFTRUE
|THROW
|CONVERT_B
|IFNE
|NEWARRAY
|INCLOCAL_I
|IFLT
|CONSTRUCT
|CONVERT_I
|ADD
|NEWOBJECT
|GREATEREQUALS
|GREATERTHAN
|ISTYPELATE
|IFNGT
|IFNLE


)+;
trait: traitcl | traitm | traitsl | traitg | traitcon |traitset;
traitcl: TRAIT CLASS qnamefun (SLOTID)* (flashasmclass)*? (script)*? END;
traitcon: TRAIT CONST qnamefun  SLOTID TYPE qnamefun VALUE (traitconvalues)* END;
traitconvalues: ( (UTF8'('QUOTE')') | 'Null()' | 'False()');
traitm: TRAIT METHOD qnamefun (flashasmmethod)* END;
traitsl: TRAIT 'slot' qnamefun (SLOTID)? TYPE qnamefun (VALUE (traitconvalues)*)* END;
traitg: TRAIT 'getter' qnamefun (flashasmmethod) END;
traitset: TRAIT 'setter' qnamefun (flashasmmethod)* END;



WS
   : (' ' | '\t' | '\n' | '\r') -> skip
   ;
LINE_COMMENT
   : ';' ~ ('\n' | '\r')* '\r'? '\n' -> skip
   ;
FileName: '"' ~'"'* '"';