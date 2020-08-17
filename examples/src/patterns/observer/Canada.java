package patterns.observer;

public class Canada extends AllyObserver {
    public Canada(Norad norad) {
        this.norad = norad;
        norad.addAlly(this);
    }

    @Override
    public void notify(String country) {
        if (country.equals("north korea")) {
            System.out.println("Canada stands with USA and launches nukes at NK");
        }
    }
}