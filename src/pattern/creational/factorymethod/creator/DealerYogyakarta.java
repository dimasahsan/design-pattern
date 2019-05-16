package pattern.creational.factorymethod.creator;

import pattern.creational.factorymethod.product.Motorcycle;
import pattern.creational.factorymethod.product.MotorcycleType;

public class DealerYogyakarta extends AbstractDealer {
    @Override
    public Motorcycle orderMotorcycle(MotorcycleType type) {
        Motorcycle motorcycle;
        motorcycle = buildMotorcycle(type);
        motorcycle.dealer(DealerYogyakarta.class.getSimpleName());
        return motorcycle;
    }
}
