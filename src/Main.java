import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ANTLRFileStream myfile = new ANTLRFileStream("/Users/jfmmeyers/Downloads/helloswf/Hello-0/out.txt");
        flashasmLexer lexer = new flashasmLexer( myfile);
        TokenStream tokens = new CommonTokenStream( lexer );
        flashasmParser parser = new flashasmParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.flashasm();

	// write your code here
    }
}
