package patterns.visitor;

public interface ItemElementVisitor {
    void visit(Fruit fruit);
    void visit(Meat meat);
}