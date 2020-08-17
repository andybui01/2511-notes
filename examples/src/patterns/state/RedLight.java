package patterns.state;

public class RedLight implements Light {
    @Override
    public void printLight(Context context) {
        System.out.println("Red light: STOP!!!");
        context.setLight(new GreenLight());
    }
}