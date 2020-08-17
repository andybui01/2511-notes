package patterns.state;

public class Demo {
    public static void main(String[] args) {
        Context context = new Context();

        // First green light
        context.advanceLight();
        // then yellow
        context.advanceLight();
        // then red
        context.advanceLight();
        // and back at green, etc.
        context.advanceLight();
    }
}