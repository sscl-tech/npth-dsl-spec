public class DSLVisitorImpl extends DSLBaseVisitor<Void> {
    @Override
    public Void visitStatement(DSLParser.StatementContext ctx) {
        String name = ctx.NAME().getText();
        String action = ctx.ACTION().getText();
        String shape = ctx.SHAPE().getText();

        System.out.printf("Name: %s, Action: %s, Shape: %s%n", name, action, shape);

        return null;
    }
}


