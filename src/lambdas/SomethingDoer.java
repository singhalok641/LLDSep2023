package lambdas;

public class SomethingDoer implements Runnable{

    @Override
    public void run() {
        System.out.println("V1 is doing something");
    }
}
