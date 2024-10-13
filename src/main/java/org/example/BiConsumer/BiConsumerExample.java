package org.example.BiConsumer;

import java.util.function.BiConsumer;

public class BiConsumerExample {
    public static void main(String[] args) {

        BiConsumer<String, String> biConsumer = (a,b)->{
            System.out.println(a);
            System.out.println(b);
        };

        biConsumer.accept("Alan","Tapia");


    }
}
