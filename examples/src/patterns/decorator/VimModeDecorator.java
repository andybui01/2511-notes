package patterns.decorator;

// Concrete decorator
public class VimModeDecorator extends EditorDecorator {

    public VimModeDecorator(Editor editor) {
        super(editor);
    }

    @Override
    public void draw() {
        super.draw();
        drawVimMode();
    }

    public void drawVimMode() {
        // draw vim mode
    }

    @Override
    public String getDesc() {
        return super.getDesc() + " + vim mode";
    }
    
}