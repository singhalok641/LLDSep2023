package overriding2;

public class Client {
    public static void main(String[] args) {
        A a = new A();
        a.doSomething(); // Hello

        a = new B();
        a.doSomething(); //Bye
    }
}
