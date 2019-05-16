package pattern.creational.factorymethod.creator;

import pattern.creational.factorymethod.product.*;

public abstract class AbstractDealer {
    public Motorcycle buildMotorcycle(MotorcycleType type) {
        Motorcycle motorcycle;
        switch (type) {
            case MotorcycleType.VIXION:
                motorcycle = new Vixion();
                break;
            case MotorcycleType.VARIO:
                motorcycle = new Vario();
                break;
            case MotorcycleType.SHOGUN:
                motorcycle = new Shogun();
                break;
            default:
                throw new IllegalArgumentException("No such motorcycle");
        }
        return motorcycle;
    }

    public abstract  Motorcycle orderMotorcycle(MotorcycleType type);
}
