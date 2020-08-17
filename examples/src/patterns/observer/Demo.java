package patterns.observer;

public class Demo {
    public static void main(String[] args) {
        Norad norad = new Norad();
        new Australia(norad);
        new Canada(norad);

        norad.scanNuke();
    }
}