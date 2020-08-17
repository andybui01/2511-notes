package patterns.factory;

public class StrawberryMilkshake extends Milkshake {

    @Override
    Item getIngredient() {
        return new Strawberry();
    }
    
}