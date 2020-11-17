package za.co.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSort {

    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(70);
        marks.add(45);
        marks.add(10);
        marks.add(65);
        marks.add(25);
        marks.add(20);

        System.out.println(marks);

        int noOfFailedStudent = marks.stream().filter(i -> i < 30).collect(Collectors.toList()).size();
        System.out.println(noOfFailedStudent);

        long countOfFailedStudent = marks.stream().filter(i -> i < 30).count();
        System.out.println(countOfFailedStudent);

        List<Integer> sortedMarkListAsc = marks.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedMarkListAsc);

//        Comparator<Integer> comp = (i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0;

        List<Integer> sortedMarkListDesc = marks.stream().sorted((i1, i2) -> (i1 < i2) ? 1 : (i1 > i2) ? -1 : 0).collect(Collectors.toList());
        System.out.println(sortedMarkListDesc);

        List<Integer> sortedMarkListAsc2 = marks.stream().sorted((i1, i2) -> i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedMarkListAsc2);

        List<Integer> sortedMarkListDesc2 = marks.stream().sorted((i1, i2) -> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(sortedMarkListDesc2);
    }
}
