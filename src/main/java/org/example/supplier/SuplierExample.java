package org.example.supplier;

import java.util.function.Supplier;

public class SuplierExample {
    public static void main(String[] args) {


        Supplier<String> supplier = () -> {
            String cadena = new String("Hola");
            return cadena;
        };

        System.out.println(supplier.get());
    }
}
