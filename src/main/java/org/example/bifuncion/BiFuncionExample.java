package org.example.bifuncion;

import java.util.function.BiFunction;

public class BiFuncionExample {
    public static void main(String[] args) {

        BiFunction<Integer,Integer,Integer> biFunction = (a, b) -> {
            Integer res = a + b;
            return  res;
        };

        System.out.println(biFunction.apply(100,100));
    }
}
