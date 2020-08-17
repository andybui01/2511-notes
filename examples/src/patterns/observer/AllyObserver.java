package patterns.observer;

// Ally countries to the united states get updates from NORAD about nukes!
public abstract class AllyObserver {
    protected Norad norad; // NORAD watches for nukes and notifies allies!
    public abstract void notify(String country); // Notify the ally country, who may choose to retaliate
}