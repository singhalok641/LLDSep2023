package designPatterns.prototype;

public class IntelligentStudent extends Student{
    private int iq;

    public IntelligentStudent(){}

    public int getIq() {
        return iq;
    }

    public void setIq(int iq) {
        this.iq = iq;
    }

    public IntelligentStudent(IntelligentStudent student){
        super(student);
        this.iq = student.iq;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }
}
