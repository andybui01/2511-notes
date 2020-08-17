package patterns.decorator;

// Concrete component
public class SimpleEditor implements Editor {
    @Override
    public void draw() {
        // draw the basic text editor
    }

    @Override
    public String getDesc() {
        return "simple editor";
    }
}