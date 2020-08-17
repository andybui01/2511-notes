package patterns.state;

public class Context {

    Light light;
    
    public Context() {
        light = new GreenLight();
    }

    public void setLight(Light light) {
        this.light = light;
    }

    public Light getLight() {
        return light;
    }

    public void advanceLight() {
        light.printLight(this);
    }
}