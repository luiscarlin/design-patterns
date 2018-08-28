package observer;

public class StockObserver implements Observer {

    private double ibmPrice;
    private double applePrice;
    private double googlePrice;

    private Subject stockPublisher;

    private int id;

    private static int observerIDTracker = 0;


    public StockObserver(Subject stockPublisher) {
        this.stockPublisher = stockPublisher;

        this.id = ++observerIDTracker;

        // register yourself (observer) to the publisher
        stockPublisher.register(this);
    }


    // This method will be called with updated values from the publisher
    @Override
    public void update(double ibmPrice, double applePrice, double googlePrice) {
      this.ibmPrice = ibmPrice;
      this.applePrice = applePrice;
      this.googlePrice = googlePrice;

      System.out.println("Observer #" + id + " got updated with values " + ibmPrice + " " + applePrice + " " + googlePrice);
    }
}
