import pattern.creational.abstractfactory.factories.GuiFactory;
import pattern.creational.abstractfactory.products.OsType;
import pattern.creational.factorymethod.creator.DealerPurbalingga;
import pattern.creational.factorymethod.creator.DealerYogyakarta;
import pattern.creational.factorymethod.product.Motorcycle;
import pattern.creational.factorymethod.product.MotorcycleType;
import pattern.creational.prototype.cache.BundledShapeCache;
import pattern.creational.prototype.shape.Circle;
import pattern.creational.prototype.shape.Rectangle;
import pattern.creational.prototype.shape.Shape;

import java.util.ArrayList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        System.out.println("==============================================================");
        System.out.println("============= Factory Method (Creational Pattern)=============");
        System.out.println("==============================================================");

        DealerYogyakarta dealerYogyakarta = new DealerYogyakarta();
        DealerPurbalingga dealerPurbalingga = new DealerPurbalingga();

        Motorcycle motorcycleVixion = dealerYogyakarta.orderMotorcycle(MotorcycleType.VIXION);
        motorcycleVixion.prepare();
        motorcycleVixion.acceleration();
        motorcycleVixion.speed();
        motorcycleVixion.balance();

        Motorcycle motorcycleShogun = dealerYogyakarta.orderMotorcycle(MotorcycleType.SHOGUN);
        motorcycleShogun.prepare();
        motorcycleShogun.acceleration();
        motorcycleShogun.speed();
        motorcycleShogun.balance();

        Motorcycle motorcycleVario = dealerPurbalingga.orderMotorcycle(MotorcycleType.VARIO);
        motorcycleVario.prepare();
        motorcycleVario.acceleration();
        motorcycleVario.speed();
        motorcycleVario.balance();

        System.out.println("==============================================================");
        System.out.println("=================== End Of Factory Method ====================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();

        System.out.println("==============================================================");
        System.out.println("============ Abstract Factory (Creational Pattern)============");
        System.out.println("==============================================================");

        GuiFactory linuxFactory = GuiFactory.getFactory(OsType.LINUX);
        GuiFactory windowsFactory = GuiFactory.getFactory(OsType.WINDOWS);

        linuxFactory.createButton().paint();
        linuxFactory.createCheckbox().paint();
        windowsFactory.createButton().paint();
        windowsFactory.createCheckbox().paint();

        System.out.println("==============================================================");
        System.out.println("================== End Of Abstract Factory ===================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();

        System.out.println("==============================================================");
        System.out.println("=============== Prototype (Creational Pattern)===============");
        System.out.println("==============================================================");

        List<Shape> shapes = new ArrayList<>();
        List<Shape> shapesCopy = new ArrayList<>();

        Circle circle = new Circle();
        circle.x = 10;
        circle.y = 20;
        circle.radius = 15;
        circle.color = "red";
        shapes.add(circle);

        Circle anotherCircle = (Circle) circle.clone();
        shapes.add(anotherCircle);

        Rectangle rectangle = new Rectangle();
        rectangle.width = 10;
        rectangle.height = 20;
        circle.color = "blue";
        shapes.add(rectangle);

        for (Shape shape : shapes) {
            shapesCopy.add(shape.clone());
        }

        for (int i = 0; i < shapes.size(); i++) {
            if (shapes.get(i) != shapesCopy.get(i)) {
                System.out.println(i + ": Shapes are different objects (yay!)");
                if (shapes.get(i).equals(shapesCopy.get(i))) {
                    System.out.println(i + ": And they are identical (yay!)");
                } else {
                    System.out.println(i + ": But they are not identical (booo!)");
                }
            } else {
                System.out.println(i + ": Shape objects are the same (booo!)");
            }
        }

        System.out.println();
        System.out.println("==============================================================");
        System.out.println();

        BundledShapeCache cache = new BundledShapeCache();

        Shape shape1 = cache.get("Big green circle");
        Shape shape2 = cache.get("Medium blue rectangle");
        Shape shape3 = cache.get("Medium blue rectangle");

        if (shape1 != shape2 && !shape1.equals(shape2)) {
            System.out.println("Big green circle != Medium blue rectangle (yay!)");
        } else {
            System.out.println("Big green circle == Medium blue rectangle (booo!)");
        }

        if (shape2 != shape3) {
            System.out.println("Medium blue rectangles are two different objects (yay!)");
            if (shape2.equals(shape3)) {
                System.out.println("And they are identical (yay!)");
            } else {
                System.out.println("But they are not identical (booo!)");
            }
        } else {
            System.out.println("Rectangle objects are the same (booo!)");
        }

        System.out.println("==============================================================");
        System.out.println("===================== End Of Prototype ======================");
        System.out.println("==============================================================");
        System.out.println();
        System.out.println();
    }
}
