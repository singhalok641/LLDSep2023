package exceptionHandling;

import java.lang.Exception;

public class Main {
    public static void main(String[] args) {
        Doer doer = new Doer();
//        doer.doSomething();

        try {
            doer.findStudentByRollNo(20);
        }
        catch (ClassNotFoundException classNotFoundException){
            System.out.println("An exception has occured");
        }
    }
}
