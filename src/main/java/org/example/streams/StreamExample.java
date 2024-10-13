package org.example.streams;

import javax.naming.NamingEnumeration;
import java.util.ArrayList;
import java.util.List;

public class StreamExample {
    public static void main(String[] args) {
        List<String> nombres = new ArrayList<>();
        nombres.add("Al");
        nombres.add("al");
        nombres.add("Carlos");
        nombres.add("María");
        nombres.add("Sofía");
        nombres.add("Pedro");

        nombres.stream()
                .filter((x -> x.length() < 3))
                .filter((z -> z.startsWith("A") || z.startsWith("a")))
                .forEach(System.out::println);


    }
}

