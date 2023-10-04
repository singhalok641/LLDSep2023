package assignment;

public class Client {
    public static void main(String[] args) {
        A a = new B(20, 22);

        B b = new B(20, 22);
        System.out.println(b.a);

        System.out.println("DEBUG");
    }
}
