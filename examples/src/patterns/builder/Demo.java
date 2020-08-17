package patterns.builder;

public class Demo {
    public static void main(String[] args) {
        CarBuilder builder = new teslaBuilder();
        Director director = new Director(builder);

        // Director is in charge of the order builder builds
        director.make();

        // but we grab result from builder themselves
        Car car = builder.getResult();
        System.out.println(car.getCar());
    }
}