package patterns.decorator;

public class EditorDecorator implements Editor {

    private Editor editor;

    public EditorDecorator(Editor editor) {
        this.editor = editor;
    }

    @Override
    public void draw() {
        editor.draw();
    }

    @Override
    public String getDesc() {
        return editor.getDesc();
    }
}