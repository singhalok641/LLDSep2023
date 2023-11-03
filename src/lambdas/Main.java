package lambdas;

import collections.Student;
import collections.StudentComparatorByName;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // V1
        SomethingDoer somethingDoer = new SomethingDoer();
        Thread t = new Thread(somethingDoer);
        t.start();

        // V2
        Runnable runnable = ()->{
            System.out.println("V2 is doing something");
        };
        Thread t2 = new Thread(runnable);
        t2.start();

        // V3
        Thread t3 = new Thread(
                ()-> {
                    System.out.println("V2 is doing something");
                }
        );
        t3.start();

        // Another example
        List<Student> students = new ArrayList<>();

        students.addAll(List.of(
                new Student(1, "Alok", 26, 90),
                new Student(1, "Ankit", 20, 99),
                new Student(1, "Ankita", 23, 95),
                new Student(1, "Deepak", 30, 88)
        ));

        Comparator<Student> comparator = (o1, o2)->{
            if(o1.getName().equals(o2.getName())){
                return 0;
            }
            if(o1.getName().compareTo(o2.getName()) < 0){
                return -1;
            }
            return 1;
        };

        Collections.sort(students,
                (o1, o2)-> {
                    if (o1.getName().equals(o2.getName())) {
                        return 0;
                    }
                    if (o1.getName().compareTo(o2.getName()) < 0) {
                        return -1;
                    }
                    return 1;
                }
        );
        System.out.println(students);

        // Calculator
        MathematicalOperation addition = (o1, o2)->{
            return o1 + o2;
        };

        System.out.println(addition.operate(12, 13));

        MathematicalOperation subtraction = (o1, o2)->{
            return o1 - o2;
        };

        MathematicalOperation addtionOperation = new AddtionOperation();
        System.out.println(addtionOperation.operate(12 , 13));

    }
}
