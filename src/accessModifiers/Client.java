package accessModifiers;

public class Client {
    public static void main(String[] args) {
        Student student = new Student();
//        student.name = "Alok"; name is not accessible, since it is private

        student.batchId = 123;
        student.psp = 91.0;
        student.universityName = "Scaler School of Technology";
    }
}
