package exceptionHandling;

public class DivideRunner {
    public static void main(String[] args) {
        System.out.println(divide(10,2));
        System.out.println(divide(10, 0));
    }

    private static int divide(int dividend, int divisor){
        int a = 0;
        try {
            a = dividend / divisor;
        }
        catch (ArithmeticException e){
            System.out.println("Divide by zero exception has occured");
        }
        finally {
            System.out.println("GoodBye");
        }
        return a;
    }
}

/*
Final: You cannot change the value of the field(constant)
Finally: Resource Management, always gets executed
Finalize: It is a method on object class, this method is the last method to be
called before an object gets destroyed, it's used for object shutdown


throw: Raising an exception
throws: handling an exception

 */
