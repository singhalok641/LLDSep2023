package constructorChaining;

public class C extends B{
    C(){
        System.out.println("Constructor of C");
    }

    C(String a){
        super("hello");
        System.out.println("Constructor of C with parameters value as: " + a);
    }
}
