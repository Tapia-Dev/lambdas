package org.example.unary;

import java.util.function.UnaryOperator;

public class UnaryOperatorExample {
    public static void main(String[] args) {

        UnaryOperator<Integer> unaryOperator = (a) ->{
            return a * a;
        };

        Integer res = unaryOperator.apply(10);
        System.out.println(res);
    }
}
