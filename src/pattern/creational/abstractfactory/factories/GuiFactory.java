package pattern.creational.abstractfactory.factories;

import pattern.creational.abstractfactory.products.Button;
import pattern.creational.abstractfactory.products.Checkbox;

public interface GuiFactory {
    Button createButton();
    Checkbox createCheckbox();
}
