package designPatterns.builder;

import designPatterns.builder.exceptions.InvalidArgumentException;

public class Client {
    public static void main(String[] args) throws InvalidArgumentException {
        // V1
//        Builder builder = new Builder();
//        builder.setName("Alok");
//        builder.setAge(26);
//        builder.setGender(Gender.MALE);
//        builder.setPhoneNumber("+31687000");
//        builder.setPsp(99);
//
//        Student student = new Student(builder);

        // V2
//        Builder builder1 = Student.createBuilder();
//        builder1.setName("Alok");
//        builder1.setAge(26);
//        builder1.setGender(Gender.MALE);
//        builder1.setPhoneNumber("+31687000");
//        builder1.setPsp(99);

//        Student student1 = builder1.build();
        // Student student2 = new Student(builder1);

        // V3

        Student student = Student.createBuilder()
                .setAge(26)
                .setName("Alok")
                .setGender(Gender.MALE)
                .setPsp(88.99)
                .setUniversityName("Thapar University")
                .setPhoneNumber("1324242498")
                .build();
    }
}
