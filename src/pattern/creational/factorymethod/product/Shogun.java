package pattern.creational.factorymethod.product;

public class Shogun implements Motorcycle {
    private String dealerName;

    @Override
    public void dealer(String dealerName) {
        this.dealerName = dealerName;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing for Shogun on " + dealerName);
    }

    @Override
    public void speed() {
        System.out.println("Speed is 125");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration is 70");
    }

    @Override
    public void balance() {
        System.out.println("Balance is 70");
    }
}
