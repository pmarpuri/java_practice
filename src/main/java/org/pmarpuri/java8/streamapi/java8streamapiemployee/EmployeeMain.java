package org.pmarpuri.java8.streamapi.java8streamapiemployee;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// https://www.linkedin.com/pulse/unlocking-efficiency-exploring-java-8-stream-api-employee-kadam-xf2af/
public class EmployeeMain {

    public static void main(String[] args) {
        List<EmployeeData.Employee> empList = EmployeeData.list;
        // Question 1: Grouping Employees by City
        Map<String, List<EmployeeData.Employee>> empByCity = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getCity));
        System.out.println("Employees grouped by city :: \n" + empByCity);
        // Question 2: Grouping Employees by Age
        Map<Integer, List<EmployeeData.Employee>> empByAge = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getAge));
        System.out.println("Grouping Employees by Age::\n " + empByAge);
        // Question 3: Finding the Count of Male and Female Employees
        Map<String, Long> collect3 = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getGender, Collectors.counting()));
        System.out.println("Finding the Count of Male and Female Employees::\n " + collect3);
        // Question 4: Printing Names of All Departments
        Stream<String> distinct = empList.stream().map(EmployeeData.Employee::getDeptName).distinct();
        distinct.forEach(System.out::println);
        // Question 5: Printing Employee Details by Age Criteria (// Print employee details whose age is greater than 28)
        List<EmployeeData.Employee> collect5 = empList.stream().filter(employee -> employee.getAge() > 28).collect(Collectors.toList());
        System.out.println("Printing Employee Details by Age Criteria (// Print employee details whose age is greater than 28)::\n " + collect5);
        // Question 6: Finding Maximum Age of Employee
        Optional<EmployeeData.Employee> max = empList.stream().max(Comparator.comparing(EmployeeData.Employee::getAge));
        max.ifPresent(employee -> System.out.println("Finding Maximum Age of Employee::\n" + employee.getAge()));
        OptionalInt max1 = empList.stream().mapToInt(EmployeeData.Employee::getAge).max();
        max1.ifPresent(value -> System.out.println("2 Finding Maximum Age of Employee::\n" + value));
        // Question 7: Printing Average Age of Male and Female Employees
        Map<String, Double> collect7 = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getGender, Collectors.averagingInt(EmployeeData.Employee::getAge)));
        System.out.println("Printing Average Age of Male and Female Employees ::\n " + collect7);
        // Question 8: Printing the Number of Employees in Each Department
        Map<String, Long> collect8 = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.counting()));
        System.out.println("Printing Average Age of Male and Female Employees ::\n " + collect8);
        // Question 9: Finding the Oldest Employee
        //noinspection OptionalGetWithoutIsPresent
        EmployeeData.Employee employee = empList.stream().max(Comparator.comparingInt(EmployeeData.Employee::getAge)).get();
        System.out.println("Finding the Oldest Employee ::" + employee);
        // Question 11: Finding Employees by Age Range ( Find employees whose age is greater than 30 and less than 30)
        Map<Boolean, List<EmployeeData.Employee>> collect11 = empList.stream().collect(Collectors.partitioningBy(employee1 -> employee1.getAge() > 30));
        Set<Map.Entry<Boolean, List<EmployeeData.Employee>>> entrySet = collect11.entrySet();
        for (Map.Entry<Boolean, List<EmployeeData.Employee>> entry : entrySet) {
            if (Boolean.TRUE.equals(entry.getKey())) {
                // Employees greater than 30 years old
                System.out.println("Employees greater than 30 years ::" + entry.getValue());
            } else {
                // Employees less than 30 years old
                System.out.println("Employees less than 30 years ::" + entry.getValue());
            }
        }
        // Question 12: Finding Department with Highest Number of Employees
        Map.Entry<String, Long> collect12 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println(" Finding Department with Highest Number of Employees " + collect12);
        // // Find if there are any employees from the HR Department
        List<EmployeeData.Employee> hr = empList.stream().filter(employee1 -> employee1.getDeptName().equalsIgnoreCase("hr")).collect(Collectors.toList());
        System.out.println("Find if there are any employees from the HR Department::\n" + hr);
        Optional<EmployeeData.Employee> hr1 = empList.stream().filter(employee1 -> employee1.getDeptName().equalsIgnoreCase("hr")).findAny();
        if (hr1.isPresent()) {
            System.out.println("Find if there are any employees from the HR Department is::\n" + hr1);
        }
        // Question 14: Finding Departments with Over 3 Employees
        List<Map.Entry<String, Long>> collect14 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().filter(stringLongEntry -> stringLongEntry.getValue() > 3)
                .collect(Collectors.toList());
        System.out.println(collect14);
        // Question 15: Finding Distinct Department Names
        List<String> distinct15 = empList.stream().map(EmployeeData.Employee::getDeptName).distinct().collect(Collectors.toList());
        System.out.println(distinct15);
        // Question 16: Finding and Sorting Employees by City
        List<String> sorted16 = empList.stream().map(EmployeeData.Employee::getCity).sorted().collect(Collectors.toList());
        System.out.println("Sorting Employees by City::" + sorted16);
        //Question 17: Counting the Number of Employees in the Organization
        long count17 = empList.size();
        System.out.println("total emp count in org " + count17);
        // Question 18: Finding Employee Count in Every Department
        Map<String, Long> collect18 = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.counting()));
        System.out.println("employee count in each department ::\n" + collect18);
        // Question 19: Finding Department with the Highest Number of Employees
        Optional<Map.Entry<String, Long>> max2 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.counting()))
                .entrySet().stream().max(Map.Entry.comparingByValue());
        max2.ifPresent(stringLongEntry -> System.out.println("department with highest employee::" + stringLongEntry));
        // Question 20: Sorting Employees by Name and Age
        System.out.println("Sorting based on name and age:: ");
        Comparator<EmployeeData.Employee> comparing1 = Comparator.comparing(EmployeeData.Employee::getName);
        Comparator<EmployeeData.Employee> comparing2 = Comparator.comparing(EmployeeData.Employee::getAge);
        List<EmployeeData.Employee> collect20 = empList.stream().sorted(comparing1.thenComparing(comparing2)).collect(Collectors.toList());
        System.out.println("collect20 " + collect20);
        // Question 21: Finding the Highest Experienced Employee
        List<EmployeeData.Employee> collect21 = empList.stream().sorted(Comparator.comparingInt(EmployeeData.Employee::getYearOfJoining)).collect(Collectors.toList());
        System.out.println("Finding the Highest Experienced Employee::" + collect21);
        // Question 22: Printing Average and Total Salary of the Organization41/04
        DoubleSummaryStatistics collect22 = empList.stream().collect(Collectors.summarizingDouble(EmployeeData.Employee::getSalary));
        System.out.println("highest and average salary::" + collect22);
        // Question 23: Printing Average Salary of Each Department
        Map<String, Double> collect23 = empList.stream().collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.averagingDouble(EmployeeData.Employee::getSalary)));
        System.out.println("Average Salary of Each Department " + collect23);
        // Question 24: Finding the Highest Salary in the Organization
        Optional<EmployeeData.Employee> first24 = empList.stream().max(Comparator.comparingDouble(EmployeeData.Employee::getSalary));
        if (first24.isPresent()) {
            System.out.println("Highest salary in the salary::" + first24);
        }
        // Question 25: Finding the Second-Highest Salary in the Organization
        Optional<EmployeeData.Employee> first = empList.stream().sorted(Comparator.comparingDouble(EmployeeData.Employee::getSalary).reversed()).skip(1).findFirst();
        first.ifPresent(value -> System.out.println("second highest employee salary::" + value));
        // Question 26: Finding the Nth Highest Salary in the Organization
        long n = 2;
        Optional<EmployeeData.Employee> first1 = empList.stream().sorted(Comparator.comparingDouble(EmployeeData.Employee::getSalary).reversed()).skip(n - 1).findFirst();
        System.out.println("Question 26: Finding the Nth Highest Salary in the Organization::" + first1.get());
        // Question 27: Finding the Highest Paid Salary in the Organization Based on Gender
        Map<String, Optional<EmployeeData.Employee>> collect27 = empList.stream().
                collect(Collectors.groupingBy(EmployeeData.Employee::getGender, Collectors.maxBy(Comparator.comparing(EmployeeData.Employee::getSalary))));
        System.out.println("Highest Paid Salary in the Organization Based on Gender::" + collect27);
        // Question 28: Finding the Lowest Paid Salary in the Organization Based on Gender
        Map<String, Optional<EmployeeData.Employee>> collect28 = empList.stream().
                collect(Collectors.groupingBy(EmployeeData.Employee::getGender, Collectors.minBy(Comparator.comparing(EmployeeData.Employee::getSalary))));
        System.out.println("Finding the Lowest Paid Salary in the Organization Based on Gender::" + collect28);
        // Question 29: Sorting Employees' Salary in Ascending Order
        List<EmployeeData.Employee> collect29 = empList.stream().sorted(Comparator.comparing(EmployeeData.Employee::getSalary)).collect(Collectors.toList());
        System.out.println("Question 29: Sorting Employees' Salary in Ascending Order::");
        collect29.forEach(System.out::println);
        // Question 30: Sorting Employees' Salary in Descending Order:
        List<EmployeeData.Employee> collect30 = empList.stream().sorted(Comparator.comparing(EmployeeData.Employee::getSalary).reversed()).collect(Collectors.toList());
        System.out.println("collect30::" + collect30);
        // Question 31: Finding the Highest Salary Based on Department:
        Map<String, Optional<EmployeeData.Employee>> collect31 = empList.stream()
                //.filter(employee1 -> employee1.getDeptName().equalsIgnoreCase("BT"))
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName, Collectors.maxBy(Comparator.comparingDouble(EmployeeData.Employee::getSalary))));
        System.out.println("Highest salary dept wise:: \n" + collect31);
        // Question 32: Printing the List of Employee's Second-Highest Record Based on Department:
        // learn this
        // Question 33: Sorting the Employees' Salary in Each Department in Ascending Order:
        Map<String, Stream<EmployeeData.Employee>> collect33 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(),
                                el -> el.stream().sorted(Comparator.comparingDouble(EmployeeData.Employee::getSalary)))));
        System.out.println("Question 33: Sorting the Employees' Salary in Each Department in Ascending Order::");
        collect33.forEach((deptName, employees) -> {
            System.out.println(deptName);
            System.out.println(employees.collect(Collectors.toList()));
        });
        // Question 34: Sorting the Employees' Salary in Each Department in Descending Order:
        Map<String, Stream<EmployeeData.Employee>> collect34 = empList.stream()
                .collect(Collectors.groupingBy(EmployeeData.Employee::getDeptName,
                        Collectors.collectingAndThen(Collectors.toList(),
                                el -> el.stream().sorted(Comparator.comparingDouble(EmployeeData.Employee::getSalary).reversed()))));

        collect34.forEach((deptName, employees) -> {
            System.out.println(deptName);
            System.out.println(employees.collect(Collectors.toList()));
        });
    }
    //
}
