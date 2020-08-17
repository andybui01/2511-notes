package patterns.decorator;

// Concrete decorator
public class OneDarkDecorator extends EditorDecorator {

    public OneDarkDecorator(Editor editor) {
        super(editor);
    }

    @Override
    public void draw() {
        super.draw();
        drawOneDark();
    }

    public void drawOneDark() {
        // draw one dark theme
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + one dark theme";
    }
    
}