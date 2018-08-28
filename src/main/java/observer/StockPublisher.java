package observer;

import java.util.ArrayList;
import java.util.List;

public class StockPublisher implements Subject {

    private List<Observer> observerList;

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    public StockPublisher() {
        observerList = new ArrayList<Observer>();
    }

    @Override
    public void register(Observer observer) {
        System.out.println("Adding new observer");
        observerList.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        System.out.println("Removing observer");
        observerList.remove(observer);
    }

    @Override
    public void notifyObservers() {
        System.out.println("Notifying observers");

    }
}
