import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ANTLRFileStream myfile = new ANTLRFileStream("/Users/jfmmeyers/Desktop/flashasm-parser/1398966098.noone_main-0/1398966098.noone_main-0.main.asasm");
        flashasmLexer lexer = new flashasmLexer( myfile);
        TokenStream tokens = new CommonTokenStream( lexer );
        flashasmParser parser = new flashasmParser(tokens);
        ParseTree tree = parser.flashasm();
        ParseTreeWalker walker = new ParseTreeWalker();
	// write your code here
    }
}
