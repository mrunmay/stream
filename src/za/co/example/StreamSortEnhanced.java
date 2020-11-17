package za.co.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortEnhanced {
    public static void main(String[] args) {
        ArrayList<String> name = new ArrayList<>();

        name.add("A");
        name.add("AAAA");
        name.add("AA");
        name.add("AAAAA");
        name.add("AAA");
        name.add("AAA");
        name.add("XXX");

        System.out.println(name);

        List<String> inAscOrder = name.stream().sorted().collect(Collectors.toList());
        System.out.println(inAscOrder);

        List<String> naturalSortingOrder = name.stream().sorted((s1, s2) -> s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(naturalSortingOrder);

        List<String> reverseOfNaturalSortingOrder1 = name.stream().sorted((s1, s2) -> s2.compareTo(s1)).collect(Collectors.toList());
        System.out.println(reverseOfNaturalSortingOrder1);

        List<String> reverseOfNaturalSortingOrder2 = name.stream().sorted((s1, s2) -> -s1.compareTo(s2)).collect(Collectors.toList());
        System.out.println(reverseOfNaturalSortingOrder2);

        Comparator<String> c = (s1, s2) -> {
            int l1 = s1.length();
            int l2 = s2.length();
            if (l1 < l2) return -1;
            else if (l1 > l2) return +1;
            else return s1.compareTo(s2);
        };

        List<String> sortedUsingComparator = name.stream().sorted(c).collect(Collectors.toList());
        System.out.println(sortedUsingComparator);
    }
}
