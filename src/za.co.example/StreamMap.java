package za.co.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMap {
    public static void main(String[] args) {
        ArrayList<Integer> marks = new ArrayList<>();
        marks.add(0);
        marks.add(5);
        marks.add(10);
        marks.add(15);
        marks.add(20);
        marks.add(25);

        System.out.println(marks);

        List<Integer> updatedMarks = marks.stream().map(i -> i + 5).collect(Collectors.toList());

        System.out.println(updatedMarks);

        List<Integer> marksGreaterThanEqual = marks.stream().filter(m -> m >= 15).collect(Collectors.toList());
        System.out.println(marksGreaterThanEqual);

        List<Integer> marksGreaterThanEqualAndLessThan = marks.stream().filter(m -> m >= 15 && m < 25).collect(Collectors.toList());
        System.out.println(marksGreaterThanEqualAndLessThan);

        List<Integer> failedStudentList = marks.stream().filter(i -> i < 10).collect(Collectors.toList());
        List<Integer> afterAddedGraceMarksForFailedStudents = failedStudentList.stream().map(i -> i + 2).collect(Collectors.toList());

        System.out.println(afterAddedGraceMarksForFailedStudents);



    }
}
