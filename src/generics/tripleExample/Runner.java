package generics.tripleExample;

import javax.swing.*;
import java.util.List;

public class Runner {
    public static void main(String[] args) {
        Triplet<String> idNameEmail = new Triplet<>("1", "Alok" , "alok@booking.com");
        Triplet<Integer> idAgeRollno = new Triplet<>(1, 26, 21);
        Triplet<Long> idAgeRollnoLong = new Triplet<>(1L, 26L, 21L);


        List<Triplet<String>> triplets = List.of(idNameEmail, idNameEmail);
        List<Triplet<Integer>> triplets1 = List.of(idAgeRollno, idAgeRollno);

//        print(triplets);
//        print(triplets1);

        System.out.println(calculateAverage(idAgeRollno));
        System.out.println(calculateAverage(idAgeRollnoLong));

    }

    private static <TYPE> void print(List<Triplet<TYPE>> triplets){
        for(Triplet<TYPE> triplet: triplets){
            System.out.println(triplet.getLeft() + "-----" +
                    triplet.getMiddle() + "----" + triplet.getRight());
        }
    }


    // Write another method to find the average and return
    private static double calculateAverage(Triplet<? extends Number> triplet){

        return (triplet.getLeft().doubleValue() +
                triplet.getMiddle().doubleValue() +
                triplet.getRight().doubleValue()) / 3;
    }

    // <? extends Animal>

}

// Integer, Long, Double, Float, Short, Byte,
