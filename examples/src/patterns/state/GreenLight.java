package patterns.state;

public class GreenLight implements Light {
    @Override
    public void printLight(Context context) {
        System.out.println("Green light: GO!");
        context.setLight(new YellowLight());
    }
}