package pattern.creational.abstractfactory.factories;

import pattern.creational.abstractfactory.products.OsType;
import pattern.creational.abstractfactory.products.Button;
import pattern.creational.abstractfactory.products.Checkbox;

public abstract class GuiFactory {

    static GuiFactory getFactory(String type) {
        GuiFactory factory;
        switch (type) {
            case "Linux":
                factory = new LinuxFactory();
                break;
            case "Windows":
                factory = new WindowsFactory();
                break;
            default:
                throw new IllegalArgumentException("No such Factory");
        }
        return factory;
    }

    abstract Button createButton();

    abstract Checkbox createCheckbox();
}
