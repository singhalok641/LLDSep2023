package staticVariablesMethods;

public class Student {
    String name;
    String address;
    int age;
    static final String universityName = "University of Texas at Arlington";

    final int x = 10;


    Student() {
//        universityName = "University of Texas at Arlington";

    }

    public static void printStudentDetails() {
//        System.out.println("Name: " + name);
//        System.out.println("Address: " + address);
//        System.out.println("Age: " + age);
        System.out.println("University Name: " + universityName);


    }
}
