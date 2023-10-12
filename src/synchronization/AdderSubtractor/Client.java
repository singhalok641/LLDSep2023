package synchronization.AdderSubtractor;

import java.sql.SQLOutput;

public class Client {
    public static void main(String[] args) throws InterruptedException {
        Count count = new Count();

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
