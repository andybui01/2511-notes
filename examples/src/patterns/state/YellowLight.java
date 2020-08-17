package patterns.state;

public class YellowLight implements Light {
    @Override
    public void printLight(Context context) {
        System.out.println("Yellow light: hurry...");
        context.setLight(new RedLight());
    }
}