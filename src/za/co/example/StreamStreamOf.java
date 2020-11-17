package za.co.example;

import java.util.ArrayList;
import java.util.stream.Stream;

public class StreamStreamOf {
    public static void main(String[] args) {

        Stream<Integer> integerStream = Stream.of(9, 99, 999, 9999, 99999);
        integerStream.forEach(System.out::println);

        Integer[] i = {10,20,30,40,50};
        Stream.of(i).forEach(System.out::println);
    }
}
