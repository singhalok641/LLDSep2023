package designPatterns.prototype;

import java.util.List;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
//        List<String> batches = getStudentBatches();

        Student aprBeginnerBatchPrototype = new Student();
        aprBeginnerBatchPrototype.setBatchName("Apr23 Beginner Batch");
        aprBeginnerBatchPrototype.setAverageBatchPsp(90);
        studentRegistry.register("Apr23BeginnerBatch", aprBeginnerBatchPrototype);


        IntelligentStudent intelligentStudent = new IntelligentStudent();
        intelligentStudent.setAverageBatchPsp(99);
        intelligentStudent.setBatchName("aprBatchIntelligentStudent");
        intelligentStudent.setIq(180);

        studentRegistry.register("aprBatchIntelligentStudent", intelligentStudent);


    }
    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student dhaval = studentRegistry.get("Apr23BeginnerBatch").clone();
        dhaval.setName("Dhaval");
        dhaval.setAge(26);
        dhaval.setPsp(98);

        Student chaitanya = studentRegistry.get("aprBatchIntelligentStudent").clone();

        chaitanya.setPsp(89);
        chaitanya.setAge(24);
        chaitanya.setName("Chaitanya");

        System.out.println("DEBUG");
    }
}
