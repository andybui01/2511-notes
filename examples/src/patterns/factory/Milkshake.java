package patterns.factory;

public abstract class Milkshake {
    public Milkshake() {
        Item item = getIngredient();
        item.print();
    }

    // The factory method!
    abstract Item getIngredient();
}