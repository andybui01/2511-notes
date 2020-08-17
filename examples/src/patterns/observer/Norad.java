package patterns.observer;

import java.util.ArrayList;
import java.util.Scanner;

public class Norad {
    ArrayList<AllyObserver> allies = new ArrayList<AllyObserver>();

    public void notifyAllies(String country) {
        for (AllyObserver ally: allies) {
            ally.notify(country);
        }
    }

    public void addAlly(AllyObserver ally) {
        allies.add(ally);
    }

    public void scanNuke() {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String country = scanner.nextLine();
            notifyAllies(country);
        }
        scanner.close();
    }
}