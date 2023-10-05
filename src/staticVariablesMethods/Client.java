package staticVariablesMethods;

public class Client {
    public static void main(String[] args) {
//        System.out.println(Student.universityName);




        Student student = new Student();
        student.name = "Alok";
        student.address = "Dallas";
        student.age = 25;
//        student.universityName = "University of Texas at Arlington";

//        System.out.println(student.universityName);
        student.printStudentDetails();

    }
}
