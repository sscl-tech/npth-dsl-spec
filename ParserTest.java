import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

public class ParserTest {
    public static void main(String[] args) throws Exception {
        String input = "MyCircle : create Circle"; // Replace with sample DSL input
        CharStream charStream = CharStreams.fromString(input);

        // Create the lexer and token stream
        DSLLexer lexer = new DSLLexer(charStream);
        CommonTokenStream tokens = new CommonTokenStream(lexer);

        // Create the parser
        DSLParser parser = new DSLParser(tokens);

        // Start parsing from the top rule (adjust 'startRule' to your grammar's entry point)
        ParseTree tree = parser.program(); // Replace 'startRule' with your grammar's start rule
        System.out.println(tree.toStringTree(parser)); // Print the parse tree
    }
}
