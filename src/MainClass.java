import pattern.creational.factorymethod.creator.DealerPurbalingga;
import pattern.creational.factorymethod.creator.DealerYogyakarta;
import pattern.creational.factorymethod.product.Motorcycle;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("============= Factory Method (Creational Pattern)=============");
        System.out.println("==============================================================");

        DealerYogyakarta dealerYogyakarta = new DealerYogyakarta();
        DealerPurbalingga dealerPurbalingga = new DealerPurbalingga();

        Motorcycle motorcycleVixion = dealerYogyakarta.orderMotorcycle("Vixion");
        motorcycleVixion.prepare();
        motorcycleVixion.acceleration();
        motorcycleVixion.speed();
        motorcycleVixion.balance();

        Motorcycle motorcycleShogun = dealerYogyakarta.orderMotorcycle("Shogun");
        motorcycleShogun.prepare();
        motorcycleShogun.acceleration();
        motorcycleShogun.speed();
        motorcycleShogun.balance();

        Motorcycle motorcycleVario = dealerPurbalingga.orderMotorcycle("Vario");
        motorcycleVario.prepare();
        motorcycleVario.acceleration();
        motorcycleVario.speed();
        motorcycleVario.balance();

        System.out.println("==============================================================");
        System.out.println("=================== End Of Factory Method ====================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();
    }
}
