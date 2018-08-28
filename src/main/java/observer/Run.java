package observer;

public class Run {
    public static void main(String[] args) {

        // create 1 publisher
        StockPublisher stockPublisher = new StockPublisher();

        // register 3 observers
        Observer stockObserver1 = new StockObserver(stockPublisher);
        Observer stockObserver2 = new StockObserver(stockPublisher);
        Observer stockObserver3 = new StockObserver(stockPublisher);

        // updating publisher updates observers with new data
        stockPublisher.setIbmPrice(23.4);
        stockPublisher.setApplePrice(50.1);
        stockPublisher.setGooglePrice(100.3);
    }
}
