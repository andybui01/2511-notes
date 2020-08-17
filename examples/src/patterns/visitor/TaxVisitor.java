package patterns.visitor;

public class TaxVisitor implements ItemElementVisitor {

    @Override
    public void visit(Fruit fruit) {
        System.out.println("Tax for fruits is 15%");
    }

    @Override
    public void visit(Meat meat) {
        System.out.println("Tax for meats is 15%");
    }
    
}