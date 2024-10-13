package org.example.predicate;

import java.util.function.Predicate;

public class PredicateExample {

    public static void main(String[] args) {

        Predicate<String> predicate = (str) -> str.length() > 4;


        boolean test = predicate.test("Holaa");
        System.out.println(test);
    }

}
