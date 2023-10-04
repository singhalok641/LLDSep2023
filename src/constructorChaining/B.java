package constructorChaining;

public class B extends A{
    B(){
        System.out.println("Constructor of B");
    }

    B(String a){
        System.out.println("Constructor of B with params");
    }
}
