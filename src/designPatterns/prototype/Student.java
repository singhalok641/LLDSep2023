package designPatterns.prototype;

public class Student implements Prototype{
    private int age;
    private String name;
    private double psp;
    private String batchName;
    private double averageBatchPsp;

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }


    public void setAverageBatchPsp(double averageBatchPsp) {
        this.averageBatchPsp = averageBatchPsp;
    }

    public Student(){

    }

    public Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.averageBatchPsp = student.averageBatchPsp;
        this.batchName = student.batchName;
    }

    @Override
    public Student clone() {
        return new Student(this);
    }
}
