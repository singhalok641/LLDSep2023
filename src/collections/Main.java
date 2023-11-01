package collections;

import java.util.*;

public class Main {

    private static List<Integer> getList(){
        return new Vector<>();
    }
    public static void main(String[] args) {

        // Vector
        // Runtime works on data type of the object
        // Compiler works on data type of the variable
        List<Integer> vectorList = getList();
        vectorList.add(23);

        // Why not use vector all the time?
        // Pro -> Thread Safe
        // Con -> Slow


        // Stack
        Stack<Integer> stack = new Stack<>();
        stack.add(12);
        stack.add(13);
        stack.add(14);

        stack.add(1, 24);

        stack.set(2, 23);

//        int a = stack.get(0);

        int a = stack.pop();

//        System.out.println(a);


        // LinkedHashSet
        Set<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(1); // 1
        linkedHashSet.add(21); // 1 <-> 21
        linkedHashSet.add(10); // 1 <-> 21 <-> 10
        linkedHashSet.remove(1); // 21 <-> 10
        linkedHashSet.add(50); // 1 <-> 21 <-> 10 <-> 50
        linkedHashSet.add(1); // 1 <-> 21 <-> 10 <-> 50 <-> 1
        linkedHashSet.remove(1);

        for(Integer i: linkedHashSet){
            System.out.println(i);
        }

        // EnumSet
        // PaymentStatus -> PENDING, FAILURE, SUCCESS,

        Payment payment = new Payment(3, PaymentStatus.IN_PROCESS);
        payment.status = PaymentStatus.SUCCESS;

//        Set<PaymentStatus> paymentStatusSet = new HashSet<>();
//
//        paymentStatusSet.add(PaymentStatus.PENDING);
//        paymentStatusSet.add(PaymentStatus.FAILURE);
//        paymentStatusSet.add(PaymentStatus.SUCCESS);
//        paymentStatusSet.add(PaymentStatus.AWAITING_BANK_APPROVAL);

        Set<PaymentStatus> paymentStatusSet = EnumSet.allOf(PaymentStatus.class);

        List<Payment> payments = new ArrayList<>();
        payments.add(new Payment(1, PaymentStatus.FAILURE));
        payments.add(new Payment(2, PaymentStatus.SUCCESS));

        /*
        FAILURE:
        p1, p2, p3
        SUCCESS:
        p10, p50
         */

        for(PaymentStatus paymentStatus: paymentStatusSet){
            System.out.println("==" + paymentStatus + "==");
            for(Payment payment1: payments){
                if(payment1.status == paymentStatus){
                    System.out.print(payment1.id + ", ");
                }
            }
            System.out.println();
        }

        // PriorityQueue

        Queue<Integer> priorityQueue = new PriorityQueue<>(Collections.reverseOrder());

        priorityQueue.add(10);
        priorityQueue.add(5);
        priorityQueue.add(11);

        while(!priorityQueue.isEmpty()){
            System.out.println(priorityQueue.poll());
        }

        List<Student> students = new ArrayList<>();

        students.addAll(List.of(
                        new Student(1, "Alok", 26, 90),
                        new Student(1, "Ankit", 20, 99),
                        new Student(1, "Ankita", 23, 95),
                        new Student(1, "Deepak", 30, 88)
        ));

        // To fix this:
        // 1. Provide a natural/inherit ordering to this Student class
        // 2. Custom Comparison function
        Collections.sort(students, new StudentComparatorByName());

    }
}
