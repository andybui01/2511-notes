package patterns.factory;

public class ChocolateMilkshake extends Milkshake {

    @Override
    Item getIngredient() {
        return new Chocolate();
    }
    
}