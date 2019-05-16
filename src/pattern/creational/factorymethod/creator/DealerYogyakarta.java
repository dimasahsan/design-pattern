package pattern.creational.factorymethod.creator;

import pattern.creational.factorymethod.product.Motorcycle;

public class DealerYogyakarta extends AbstractDealer {
    @Override
    public Motorcycle orderMotorcycle(String type) {
        Motorcycle motorcycle;
        motorcycle = buildMotorcycle(type);
        motorcycle.dealer(DealerYogyakarta.class.getSimpleName());
        return motorcycle;
    }
}
