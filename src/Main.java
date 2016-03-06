import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;
import java.io.IOException;

public class Main {

    public static void main(String[] args) throws IOException {
        ANTLRFileStream myfile = new ANTLRFileStream("C:\\Users\\peter\\Downloads\\noone\\output\\output.main.asasm");
        flashasmLexer lexer = new flashasmLexer( myfile);
        TokenStream tokens = new CommonTokenStream( lexer );
        flashasmParser parser = new flashasmParser(tokens);
        parser.setBuildParseTree(true);
        ParseTree tree = parser.flashasm();

	// write your code here
    }
}
