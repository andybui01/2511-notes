package patterns.visitor;

public class Fruit implements ItemElement {

    @Override
    public void accept(ItemElementVisitor visitor) {
        visitor.visit(this);
    }
    
}