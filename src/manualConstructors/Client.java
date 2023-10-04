package manualConstructors;

public class Client {
    public static void main(String[] args) {
        Student st1 = new Student("Alok", "ABC");

        Student st2 = new Student(st1);

        System.out.println("DEBUG");

        st2.name = "Ankur";


    }
}
