package za.co.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilter {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);

        System.out.println(marks);

        List<Integer> listOfEvenNumber = marks.stream().filter(i -> i % 2 == 0).collect(Collectors.toList());

        System.out.println(listOfEvenNumber);
    }
}
