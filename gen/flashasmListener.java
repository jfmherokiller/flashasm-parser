// Generated from C:/Users/peter/Downloads/flashasm parser\flashasm.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link flashasmParser}.
 */
public interface flashasmListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link flashasmParser#flashasm}.
	 * @param ctx the parse tree
	 */
	void enterFlashasm(flashasmParser.FlashasmContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#flashasm}.
	 * @param ctx the parse tree
	 */
	void exitFlashasm(flashasmParser.FlashasmContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(flashasmParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(flashasmParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#script}.
	 * @param ctx the parse tree
	 */
	void enterScript(flashasmParser.ScriptContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#script}.
	 * @param ctx the parse tree
	 */
	void exitScript(flashasmParser.ScriptContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(flashasmParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(flashasmParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(flashasmParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(flashasmParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#internalcode}.
	 * @param ctx the parse tree
	 */
	void enterInternalcode(flashasmParser.InternalcodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#internalcode}.
	 * @param ctx the parse tree
	 */
	void exitInternalcode(flashasmParser.InternalcodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link flashasmParser#trait}.
	 * @param ctx the parse tree
	 */
	void enterTrait(flashasmParser.TraitContext ctx);
	/**
	 * Exit a parse tree produced by {@link flashasmParser#trait}.
	 * @param ctx the parse tree
	 */
	void exitTrait(flashasmParser.TraitContext ctx);
}