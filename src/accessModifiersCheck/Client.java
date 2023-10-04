package accessModifiersCheck;

import accessModifiers.Student;

public class Client {

    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Alok";
//        student.batchId = 123;
//        student.psp = 98; // this is a protected member. and this is not a child class
        student.universityName = "Scaler School of Technology";

        StudentChild sc = new StudentChild();
        sc.doSomething();
    }
}
