package za.co.example;

import java.util.ArrayList;

public class StreamMinMax {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(10);
        marks.add(0);
        marks.add(15);
        marks.add(5);
        marks.add(20);

        System.out.println(marks);

        Integer minElementInAscOrder = marks.stream().min((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(minElementInAscOrder);
        Integer maxElementInAscOrder = marks.stream().max((i1, i2) -> i1.compareTo(i2)).get();
        System.out.println(maxElementInAscOrder);

        Integer minElementInDescOrder = marks.stream().min((i1, i2) -> -i1.compareTo(i2)).get();
        System.out.println(minElementInDescOrder);
        Integer maxElementInDescOrder = marks.stream().max((i1, i2) -> -i1.compareTo(i2)).get();
        System.out.println(maxElementInDescOrder);

    }
}
