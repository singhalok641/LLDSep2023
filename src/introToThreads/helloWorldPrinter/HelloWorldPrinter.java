package introToThreads.helloWorldPrinter;

public class HelloWorldPrinter implements Runnable{
    @Override
    public void run() {
        System.out.println("Hello World. This is printer by: " + Thread.currentThread().getName() + " thread");

    }
}
