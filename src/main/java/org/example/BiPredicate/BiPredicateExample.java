package org.example.BiPredicate;

import java.util.function.BiPredicate;

public class BiPredicateExample {

    public static void main(String[] args) {


        BiPredicate<Integer,Integer> biPredicate = (n1, n2) -> {

            return  n1 > n2;
        };

        boolean test = biPredicate.test(10,10);

        System.out.println(test);
    }
}
