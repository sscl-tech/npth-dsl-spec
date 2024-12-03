import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class DSLRunner {
    public static void main(String[] args) throws Exception {
        // Example input to your DSL
        String input = "MyRectangle: create Rectangle";

        // Create a CharStream from the input
        CharStream charStream = CharStreams.fromString(input);

        // Pass the input to the lexer
        DSLLexer lexer = new DSLLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Pass the tokens to the parser
        DSLParser parser = new DSLParser(tokens);

        // Parse the input and generate the parse tree
        ParseTree tree = parser.program();

        // Print the parse tree
        System.out.println(tree.toStringTree(parser));
    }
}

