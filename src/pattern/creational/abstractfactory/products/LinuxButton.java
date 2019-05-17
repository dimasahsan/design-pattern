package pattern.creational.abstractfactory.products;

public class LinuxButton implements Button {
    @Override
    public void paint() {
        System.out.println("You have created Linux Button");
    }
}
