package patterns.visitor;

public class Meat implements ItemElement {

    @Override
    public void accept(ItemElementVisitor visitor) {
        visitor.visit(this);
    }
    
}