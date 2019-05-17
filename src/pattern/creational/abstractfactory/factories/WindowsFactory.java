package pattern.creational.abstractfactory.factories;

import pattern.creational.abstractfactory.products.Button;
import pattern.creational.abstractfactory.products.Checkbox;
import pattern.creational.abstractfactory.products.WindowsButton;
import pattern.creational.abstractfactory.products.WindowsCheckbox;

public class WindowsFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new WindowsButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new WindowsCheckbox();
    }
}
