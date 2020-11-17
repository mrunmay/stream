package za.co.example;

import java.util.ArrayList;
import java.util.function.Consumer;

public class StreamForEach {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(0);
        marks.add(15);
        marks.add(5);
        marks.add(20);

        System.out.println(marks);

        /*for (Integer i : marks) {
            System.out.println(i);
        }*/

        marks.stream().forEach(System.out::println);

//        Consumer<Integer> func = integer -> {
//            System.out.println("Square of " + integer + " is " + integer * integer);
//        };
//
//        marks.stream().forEach(func);


        marks.stream().forEach(i -> {
            System.out.println("Square of " + i + " is " + i * i);
        });
    }
}
