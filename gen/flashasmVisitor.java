// Generated from C:/Users/peter/Downloads/flashasm parser\flashasm.g4 by ANTLR 4.5.1
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link flashasmParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface flashasmVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link flashasmParser#flashasm}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFlashasm(flashasmParser.FlashasmContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#program}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProgram(flashasmParser.ProgramContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#script}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitScript(flashasmParser.ScriptContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBody(flashasmParser.BodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#code}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCode(flashasmParser.CodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#internalcode}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitInternalcode(flashasmParser.InternalcodeContext ctx);
	/**
	 * Visit a parse tree produced by {@link flashasmParser#trait}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrait(flashasmParser.TraitContext ctx);
}