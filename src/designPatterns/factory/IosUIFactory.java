package designPatterns.factory;

import designPatterns.factory.components.button.Button;
import designPatterns.factory.components.button.IosButton;
import designPatterns.factory.components.dropdown.Dropdown;
import designPatterns.factory.components.dropdown.IosDropdown;
import designPatterns.factory.components.menu.IosMenu;
import designPatterns.factory.components.menu.Menu;

public class IosUIFactory implements UIFactory{
    @Override
    public IosButton createButton() {
        return new IosButton();
    }

    @Override
    public IosMenu createMenu() {
        return new IosMenu();
    }

    @Override
    public IosDropdown createDropdown() {
        return new IosDropdown();
    }
}
