import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.tree.*;

import java.util.List;

public class DSLToJSON {
    public static void main(String[] args) throws Exception {
        String dslCode = "MyRect: create Rectangle";

        // Parse the DSL code
        CharStream input = CharStreams.fromString(dslCode);
        DSLLexer lexer = new DSLLexer(input);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        DSLParser parser = new DSLParser(tokens);
        ParseTree tree = parser.program();

        // Build the AST and convert to JSON
        ASTToJSONVisitor visitor = new ASTToJSONVisitor();
        List<DSLStatement> ast = visitor.visit(tree);

        // Serialize to JSON
        Gson gson = new GsonBuilder().setPrettyPrinting().create();
        String jsonOutput = gson.toJson(ast);

        // Print the JSON
        System.out.println(jsonOutput);
    }
}

