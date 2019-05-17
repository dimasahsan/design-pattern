package pattern.creational.abstractfactory.factories;

import pattern.creational.abstractfactory.products.OsType;
import pattern.creational.abstractfactory.products.Button;
import pattern.creational.abstractfactory.products.Checkbox;

public abstract class GuiFactory {

    static GuiFactory getFactory(OsType type) {
        GuiFactory factory;
        switch (type) {
            case LINUX:
                factory = new LinuxFactory();
                break;
            case WINDOWS:
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
