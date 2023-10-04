package methodOverloading;

public class A {

    // doSomething()
    int doSomething(){
        System.out.println("Doing something without param");
        return 0;
    }


    // doSomething()
    String doSomething(String a){
        System.out.println("Doing something with returning String");
        return "";
    }


}
