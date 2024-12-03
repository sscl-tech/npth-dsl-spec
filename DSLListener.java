// Generated from DSL.g4 by ANTLR 4.13.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLParser}.
 */
public interface DSLListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(DSLParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(DSLParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statements}.
	 * @param ctx the parse tree
	 */
	void enterStatements(DSLParser.StatementsContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statements}.
	 * @param ctx the parse tree
	 */
	void exitStatements(DSLParser.StatementsContext ctx);
	/**
	 * Enter a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(DSLParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(DSLParser.StatementContext ctx);
}