package patterns.visitor;

import java.util.ArrayList;

public class Client {
    public static void main(String[] args) {
        // Basic demonstration of visitor pattern
        ArrayList<ItemElement> elements = new ArrayList<ItemElement>();
        
        ItemElement fruit = new Fruit();
        ItemElement meat = new Meat();

        elements.add(fruit);
        elements.add(meat);

        ItemElementVisitor tax = new TaxVisitor();

        for (ItemElement el: elements) {
            el.accept(tax);
        }
    }
}