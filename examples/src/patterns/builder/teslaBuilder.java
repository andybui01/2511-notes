package patterns.builder;

public class teslaBuilder implements CarBuilder {

    Car tesla;

    @Override
    public void reset() {
        tesla = new Car();
    }

    @Override
    public void buildFrontWing() {
        tesla.setFrontWing("None");
    }

    @Override
    public void buildRearWing() {
        tesla.setRearWing("Tesla popup rear wing");
    }

    @Override
    public void buildDRS() {
        tesla.setDRS("None");
    }

    @Override
    public void buildKERS() {
        tesla.setKERS("Road car spec KERS");
    }

    @Override
    public Car getResult() {
        return tesla;
    }
    
}