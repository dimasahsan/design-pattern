package pattern.creational.factorymethod.creator;

import pattern.creational.factorymethod.product.Motorcycle;
import pattern.creational.factorymethod.product.Shogun;
import pattern.creational.factorymethod.product.Vario;
import pattern.creational.factorymethod.product.Vixion;

public abstract class AbstractDealer {
    public Motorcycle buildMotorcycle(String type) {
        Motorcycle motorcycle;
        switch (type) {
            case "Vixion":
                motorcycle = new Vixion();
                break;
            case "Vario":
                motorcycle = new Vario();
                break;
            case "Shogun":
                motorcycle = new Shogun();
                break;
            default:
                throw new IllegalArgumentException("No such motorcycle");
        }
        return motorcycle;
    }

    public abstract  Motorcycle orderMotorcycle(String type);
}
