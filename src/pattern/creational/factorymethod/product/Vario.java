package pattern.creational.factorymethod.product;

public class Vario implements Motorcycle{
    private String dealerName;

    @Override
    public void dealer(String dealerName) {
        this.dealerName = dealerName;
    }

    @Override
    public void prepare() {
        System.out.println("Preparing for Vario on " + dealerName);
    }

    @Override
    public void speed() {
        System.out.println("Speed is 125");
    }

    @Override
    public void acceleration() {
        System.out.println("Acceleration is 80");
    }

    @Override
    public void balance() {
        System.out.println("Balance is 90");
    }
}
