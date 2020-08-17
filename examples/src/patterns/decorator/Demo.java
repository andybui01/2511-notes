package patterns.decorator;

public class Demo {
    public static void main(String[] args) {
        Editor editor = new SimpleEditor();
        editor = new OneDarkDecorator(editor);
        editor = new VimModeDecorator(editor);

        System.out.println(editor.getDesc());
    }
}