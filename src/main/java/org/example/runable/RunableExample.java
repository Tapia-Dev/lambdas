package org.example.runable;

public class RunableExample {
    public static void main(String[] args) {


        Runnable runnable = () -> {
            System.out.println("Ejecutando tareas");
        };

        runnable.run();



    }
}
