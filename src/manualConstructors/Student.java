package manualConstructors;

public class Student {
    String name;
    int age = 21;
    double psp;
    String universityName;
    boolean isPlaced;


    public Student(String stuName, String univName){
        System.out.println("Inside Constructor: " + name);
        name = stuName;
        universityName = univName;
    }

    public Student(){

    }

    public Student(Student oldStudent){
        name = oldStudent.name;
        universityName = oldStudent.universityName;
        psp = oldStudent.psp;
        isPlaced = oldStudent.isPlaced;
    }
}
