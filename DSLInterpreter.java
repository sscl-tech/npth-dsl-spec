import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DSLInterpreter {
    public static void main(String[] args) throws Exception {
        // Sample DSL code
        String dslCode = "MyRect: create Rectangle";

        // Create lexer, parser, and parse tree
        CharStream input = CharStreams.fromString(dslCode);
        DSLLexer lexer = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);
        ParseTree tree = parser.program();

        // Generate the AST using the custom visitor
        ASTBuilder visitor = new ASTBuilder();
        ASTNode ast = visitor.visit(tree);

        // Print the AST
        System.out.println(ast);
    }
}

