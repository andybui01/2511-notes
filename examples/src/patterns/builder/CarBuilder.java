package patterns.builder;

public interface CarBuilder {
    void reset();
    void buildFrontWing();
    void buildRearWing();
    void buildDRS();
    void buildKERS();
    Car getResult();
}