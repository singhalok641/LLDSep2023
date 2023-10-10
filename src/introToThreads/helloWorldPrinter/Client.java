package introToThreads.helloWorldPrinter;

public class Client {

    public static void main(String[] args) {

        System.out.println("Hello World. This is printer by: " + Thread.currentThread().getName() + " thread");

        HelloWorldPrinter hwp = new HelloWorldPrinter();
        Thread thread = new Thread(hwp);

        thread.start();

//        thread.run();

        System.out.println("This is written at the end" + Thread.currentThread().getName() + " thread");
    }
}
