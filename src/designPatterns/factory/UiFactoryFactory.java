package designPatterns.factory;

public class UiFactoryFactory {
    public static UIFactory getUiFactoryForPlatform(SupportedPlatforms platform){
        return switch(platform){
            case IOS -> new IosUIFactory();
            case ANDROID -> new AndroidUIFactory();
            case WEB ->  new WebUiFactory();
        };
    }
}
