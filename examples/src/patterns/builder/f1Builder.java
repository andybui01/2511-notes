package patterns.builder;

public class f1Builder implements CarBuilder {

    Car f1;

    @Override
    public void reset() {
        f1 = new Car();
    }

    @Override
    public void buildFrontWing() {
        f1.setFrontWing("F1 spec Front Wing");
    }

    @Override
    public void buildRearWing() {
        f1.setRearWing("F1 spec Rear Wing");
    }

    @Override
    public void buildDRS() {
        f1.setDRS("F1 spec DRS");
    }

    @Override
    public void buildKERS() {
        f1.setKERS("F1 spec KERS");
    }

    @Override
    public Car getResult() {
        return f1;
    }

}