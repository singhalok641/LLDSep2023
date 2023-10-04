package accessModifiers;

public class Student {
    private String name; //private
    int batchId; //default
    int age; //default
    protected double psp; //protected

    public String universityName; //public

    void changeBatch(int newBatchId){
        this.batchId = newBatchId;
    }
//
//    void giveMockInterview() {
//        System.out.println("Giving Mock Interview");
//    }
}
