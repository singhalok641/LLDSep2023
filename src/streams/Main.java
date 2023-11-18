package streams;

import java.util.*;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        List<Integer> list = List.of(1, 2, 3, 4);

        Iterator<Integer> iterator = list.listIterator();

        System.out.println("=== printing using iterator ===");
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

//        for(Integer i: list){
//            System.out.println(i);
//        }

        DataAggregator dataAggregator = new DataAggregator();
        List<Integer> li = new ArrayList<>(dataAggregator.getItems());

        Stream<Integer> s1 = dataAggregator.getItems().stream();
//        s1.forEach(System.out::println);

        s1.forEach((elem)->{
            System.out.println(elem * 2);
                }
        );

        Set<Integer> set1 = new HashSet<>();
        set1.add(1);
        set1.add(2);
        set1.add(3);

        Stream<Integer> s2 = set1.stream();

//        Consumer<Integer> consumer = (elem)->{
//            System.out.println(elem * 2);
//        };

        System.out.println("===printing set elements===");
        s2.forEach((elem)->{
            System.out.println(elem * 2);
        });


//        class MyConsumer implements Consumer<Integer>{
//            @Override
//            public void accept(Integer integer) {
//                System.out.println(integer * 2);
//            }
//        }
//
//        MyConsumer consumer = new MyConsumer();
//        for(Integer i: list){
//            consumer.accept(i);
//        }

        // Question
        List<Integer> l10 = List.of(1,2,3,4,5,6);
        Set<Integer> set = new HashSet<>();

        // set.stream(l10); -> wrong

        Stream<Integer> stream = l10.stream();
//        stream.forEach((ele)->{
//            set.add(ele);
//        });
//
//        System.out.println(set);

        System.out.println("printing traditionally");
        for(Integer i: l10){
            if(i % 2 == 0){
                System.out.println(i * 2);
            }
        }

        System.out.println("printing using filter and for each");
        l10.stream()
                .filter(
                        // If your lambda function has just 1 line and the result
                        // of that line is what you want your lambda function
                        // to return, then there is no need to put a return
                        (elem) -> elem % 2 == 0
                )
                .forEach(
                        (elem) -> {
                            System.out.println(elem * 2);
                        }
                );


        // Ques: list of nos., multiply by 3, filter all < 10, then print them
        System.out.println("list of nos., multiply by 3, filter all < 10, then print them");
        l10.stream()
                .map(
                        (elem) -> elem * 3
                )
                .filter(
                        (elem)-> elem < 10 && elem >1
                )
                .forEach(
                        System.out::println
                );

        Stream<Integer> stream1 = l10.stream()
                .map(
                        (elem) -> elem * 3
                );
//                .filter(
//                        (elem)-> elem < 10 && elem >1
//                );
//


        List<Integer> listAns = new ArrayList<>();

        for (Integer integer : l10) {
            if (integer * 3 < 10) {
                listAns.add(integer);
            }
        }

        System.out.println(l10);

    }
}
