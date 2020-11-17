package za.co.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamToArray {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(0);
        marks.add(15);
        marks.add(5);
        marks.add(20);

        System.out.println(marks);

//        ArrayList to Integer array
        Integer[] integers = marks.stream().toArray(Integer[]::new);

        for (Integer i1 : integers) {
            System.out.println(i1);
        }
//        Array performance wise too good when compare with Collection concepts

//                Integer array to Stream
//        Stream.of(integers).forEach(System.out::println);

    }
}
