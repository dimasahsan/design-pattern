package pattern.creational.factorymethod.creator;

import pattern.creational.factorymethod.product.Motorcycle;

public class DealerPurbalingga extends AbstractDealer {
    @Override
    public Motorcycle orderMotorcycle(String type) {
        Motorcycle motorcycle;
        motorcycle = buildMotorcycle(type);
        motorcycle.dealer(DealerPurbalingga.class.getSimpleName());
        return motorcycle;
    }
}
