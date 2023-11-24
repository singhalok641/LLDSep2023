package designPatterns.factory;

public class Flutter {

    SupportedPlatforms platform;
    public Flutter(SupportedPlatforms platform) {
        this.platform = platform;
    }

    public void setTheme(){
        System.out.println("Setting Theme...");
    }

    public void setRefreshRate(){
        System.out.println("Setting refresh rate to 120Hz...");
    }

    public UIFactory getFactory(){
//        if(this.platform == SupportedPlatforms.IOS){
//            return new IosUIFactory();
//        }
//        else if(this.platform == SupportedPlatforms.ANDROID){
//            return new AndroidUIFactory();
//        }
//        return null;
        return UiFactoryFactory.getUiFactoryForPlatform(this.platform);
    }
}
