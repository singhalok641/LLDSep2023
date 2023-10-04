package constructorChaining;

public class D extends C{

    D(){
        super("Hello");
        System.out.println("Constructor of D");
    }

    D(String a){
        super(a);
        System.out.println("Constructor of D");
    }

}
