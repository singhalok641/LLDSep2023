package adderSubtractorLambdas;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Lock lock = new ReentrantLock();

        // Lambda
        /*
        1. Creates an anonymous class-> adderLambdaAnonymous
        2. it will implement the interface Runnable in the Anonymous class
        3. It will pass all the variables being shared
        4. It will copy the code form the lambda body into the method of that interface
         */
        Runnable adderLambda = () -> {
            for(int i=1;i<=10000;i++){
                // All the variables of the same scope are already
                // present in the lambda
                synchronized (count) {
                    count.value += i;
                }
            }
        };

        Runnable subtractorLambda = () -> {
            for(int i=1;i<=10000;i++){
                // All the variables of the same scope are already
                // present in the lambda
                synchronized (count) {
                    count.value -= i;
                }
            }
        };

        Thread t1 = new Thread(adderLambda);
        Thread t2 = new Thread(subtractorLambda);

        t1.start();
        t2.start();

        // Waits for t1 and t2 to complete
        t1.join();
        t2.join();

        System.out.println("Both the threads have completed" +
                ". count: " + count.value);
    }
}
