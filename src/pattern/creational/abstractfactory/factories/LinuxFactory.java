package pattern.creational.abstractfactory.factories;

import pattern.creational.abstractfactory.products.Button;
import pattern.creational.abstractfactory.products.Checkbox;
import pattern.creational.abstractfactory.products.LinuxButton;
import pattern.creational.abstractfactory.products.LinuxCheckbox;

public class LinuxFactory implements GuiFactory {
    @Override
    public Button createButton() {
        return new LinuxButton();
    }

    @Override
    public Checkbox createCheckbox() {
        return new LinuxCheckbox();
    }
}
