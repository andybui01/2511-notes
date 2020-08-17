package patterns.builder;

public class Director {
    CarBuilder builder;

    public Director(CarBuilder builder) {
        this.builder = builder;
    }

    public void changeBuilder(CarBuilder builder) {
        this.builder = builder;
    }

    public void make() {
        // DIRECTOR INSTRUCTS BUILDER HOW TO BUILD!
        builder.reset();
        builder.buildFrontWing();
        builder.buildRearWing();
        builder.buildDRS();
        builder.buildKERS();
    }
}