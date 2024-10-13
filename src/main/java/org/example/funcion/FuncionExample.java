package org.example.funcion;

import java.util.function.Function;

public class FuncionExample {

    public static void main(String[] args) {

        Function<Integer,String> function = (nu) -> {
            return  "El numero es " + nu;
        };

        System.out.println(function.apply(10));

    }



}
