package designPatterns.factory;

import designPatterns.factory.components.button.Button;

public class Client {
    public static void main(String[] args) {
        Flutter flutter = new Flutter(SupportedPlatforms.WEB);
        UIFactory uiFactory = flutter.getFactory();

        Button button = uiFactory.createButton();
        button.changeSize();

    }
}
