package Generics;

import synchronization.AdderSubtractor.Adder;

import java.util.ArrayList;
import java.util.List;

public class Client {

    static void doSomething(PairGenericType<Double, Double> p){


    }

    public static void main(String[] args) {
//        Pair p1 = new Pair(1, "Alok");
//        Pair p2 = new Pair("Hello", "Hi");
//
//        doSomething(p1);
//
//        Object a = p1.getFirst();
//
//        int b = (int) a + 10;
//
//        System.out.println(b);

        // Using Generic Pair Class
        PairGenericType<Integer, String> p1 = new PairGenericType<>(1, "Hello");
        PairGenericType<Double, Double> p2 = new PairGenericType<>(3.21, 4.567);

        Double d = p2.getFirst();

        PairGenericType p3 = new PairGenericType("Hello", "Hi");

        String s = (String) p3.getFirst();





    }
}
