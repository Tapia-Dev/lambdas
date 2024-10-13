package org.example.binary;

import java.util.function.BinaryOperator;

public class testBinary {

    public static void main(String[] args) {

        BinaryOperator<Integer> binaryOperator = (a ,b) ->{
            return a + b;
        };

        System.out.println(binaryOperator.apply(20,20));



    }
}
