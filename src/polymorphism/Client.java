package polymorphism;

import java.util.Random;

public class Client {

    public static A getObject(){
        B b = new B();
        C c = new C();

        Random random = new Random(10);

        if(random.nextInt() % 2 == 0){
            return b;
        }

        return c;
    }

    public static void main(String[] args) {
        // A a = new B() or A a = new C();
        A a = getObject();



//        A.companyName

        C c = new C();
        c.companyName = "Google";

        // Animal a = getAnimal()
        // a.bark();

        // User u = getUser();
        // u.changePassword();

//        a.companyName = "Google";

        System.out.println(((C) a).companyName);
    }
}
