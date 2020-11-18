package za.co.example;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StreamSortEmployeeByNameAscAndDesc {

    public static void main(String[] args) {

        Employee e1 = new Employee("Mrunmaya", 31, (long) 999);
        Employee e2 = new Employee("Twinkle", 30, (long)999);
        Employee e3 = new Employee("Ray", 40, (long)99999);
        Employee e4 = new Employee("Phumi", 29, (long)9999);
        Employee e5 = new Employee("Drushan", 28, (long)999);
        Employee e6 = new Employee("Jade", 35, (long)99);

        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        employeeList.add(e5);
        employeeList.add(e6);

        employeeList.stream().forEach(System.out::println);
        System.out.println("----------");

        List<Employee> sortBySalaryAndIfSameThenByAgeAsc = employeeList.stream().sorted((s1, s2) -> {
            if (s1.getSalary() < s2.getSalary())
                return 1;
            else if (s1.getSalary() > s2.getSalary())
                return -1;
            else return s1.getAge().compareTo(s2.getAge());
        }).collect(Collectors.toList());

        System.out.println("sortBySalaryAndIfSameThenByAgeAsc");
        sortBySalaryAndIfSameThenByAgeAsc.stream().forEach(System.out::println);

        System.out.println("----------");

        List<Employee> sortBySalaryAndIfSameThenByAgeDesc = employeeList.stream().sorted((s1, s2) -> {
            if (s1.getSalary() < s2.getSalary())
                return 1;
            else if (s1.getSalary() > s2.getSalary())
                return -1;
            else return -s1.getAge().compareTo(s2.getAge());
        }).collect(Collectors.toList());

        System.out.println("sortBySalaryAndIfSameThenByAgeDesc");
        sortBySalaryAndIfSameThenByAgeDesc.stream().forEach(System.out::println);
    }
}
