package synchronization.AdderSubtractorMutex;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

        Lock lock = new ReentrantLock();

//        Adder adder = new Adder(count, lock);
//        Subtractor subtractor = new Subtractor(count, lock);

        Adder adder = new Adder(count);
        Subtractor subtractor = new Subtractor(count);

        Thread t1 = new Thread(adder);
        Thread t2 = new Thread(subtractor);

        t1.start();
        t2.start();

        // Waits for t1 and t2 to complete
        t1.join();
        t2.join();

        System.out.println("Both the threads have completed" +
                "count: " + count.value);
    }
}
