import org.antlr.v4.runtime.*;

public class LexerTest {
    public static void main(String[] args) throws Exception {
        String input = "MyCircle : create Circle"; // Replace with sample DSL input
        CharStream charStream = CharStreams.fromString(input);

        // Create the lexer
        DSLLexer lexer = new DSLLexer(charStream);

        // Fetch tokens and print them
        for (Token token : lexer.getAllTokens()) {
            System.out.println("Token: " + token.getText() + ", Type: " + lexer.getVocabulary().getSymbolicName(token.getType()));
        }
    }
}

