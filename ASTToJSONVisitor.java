import java.util.ArrayList;
import java.util.List;

public class ASTToJSONVisitor extends DSLBaseVisitor<List<DSLStatement>> {
    private final List<DSLStatement> statements = new ArrayList<>();

    @Override
    public List<DSLStatement> visitStatement(DSLParser.StatementContext ctx) {
        String name = ctx.NAME().getText();
        String action = ctx.ACTION().getText();
        String shape = ctx.SHAPE().getText();

        DSLStatement statement = new DSLStatement(name, action, shape);
        statements.add(statement);
        return statements;
    }

    @Override
    public List<DSLStatement> visitProgram(DSLParser.ProgramContext ctx) {
        super.visitProgram(ctx); // Visit all children
        return statements;
    }
}
