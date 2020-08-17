package patterns.observer;

public class Australia extends AllyObserver {
    public Australia(Norad norad) {
        this.norad = norad;
        norad.addAlly(this);
    }
    
    @Override
    public void notify(String country) {
        if (country.equals("china")) {
            System.out.println("Australia: Real shit?");
        }
    }
}