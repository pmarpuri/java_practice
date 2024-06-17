package org.pmarpuri.java8.streamapi.javaconceptoftheday;

import java.util.*;
import java.util.stream.Collectors;

// https://javaconceptoftheday.com/solving-real-time-queries-using-java-8-features-employee-management-system/
public class EmployeeMainJCOD {
    public static void main(String[] args) {
        List<Employee> employeeList = new ArrayList<>();
        employeeList.add(new Employee(111, "Jiya Brein", 32, "Female", "HR", 2011, 25000.0));
        employeeList.add(new Employee(122, "Paul Niksui", 25, "Male", "Sales And Marketing", 2015, 13500.0));
        employeeList.add(new Employee(133, "Martin Theron", 29, "Male", "Infrastructure", 2012, 18000.0));
        employeeList.add(new Employee(144, "Murali Gowda", 28, "Male", "Product Development", 2014, 32500.0));
        employeeList.add(new Employee(155, "Nima Roy", 27, "Female", "HR", 2013, 22700.0));
        employeeList.add(new Employee(166, "Iqbal Hussain", 43, "Male", "Security And Transport", 2016, 10500.0));
        employeeList.add(new Employee(177, "Manu Sharma", 35, "Male", "Account And Finance", 2010, 27000.0));
        employeeList.add(new Employee(188, "Wang Liu", 31, "Male", "Product Development", 2015, 34500.0));
        employeeList.add(new Employee(199, "Amelia Zoe", 24, "Female", "Sales And Marketing", 2016, 11500.0));
        employeeList.add(new Employee(200, "Jaden Dough", 38, "Male", "Security And Transport", 2015, 11000.5));
        employeeList.add(new Employee(211, "Jasna Kaur", 27, "Female", "Infrastructure", 2014, 15700.0));
        employeeList.add(new Employee(222, "Nitin Joshi", 25, "Male", "Product Development", 2016, 28200.0));
        employeeList.add(new Employee(233, "Jyothi Reddy", 27, "Female", "Account And Finance", 2013, 21300.0));
        employeeList.add(new Employee(244, "Nicolus Den", 24, "Male", "Sales And Marketing", 2017, 10700.5));
        employeeList.add(new Employee(255, "Ali Baig", 23, "Male", "Infrastructure", 2018, 12700.0));
        employeeList.add(new Employee(266, "Sanvi Pandey", 26, "Female", "Product Development", 2015, 28900.0));
        employeeList.add(new Employee(277, "Anuj Chettiar", 31, "Male", "Product Development", 2012, 35700.0));
        System.out.println(employeeList);
        // Query 3.1 : How many male and female employees are there in the organization?
        Map<String, Long> collect1 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
        System.out.println("How many male and female employees are there in the organization::"+collect1);
        // Query 3.2 : Print the name of all departments in the organization?
        List<String> collect2 = employeeList.stream().map(Employee::getDepartment).distinct().collect(Collectors.toList());
        System.out.println("Print the name of all departments in the organization::"+collect2);
        // Query 3.3 : What is the average age of male and female employees?
        Map<String, Double> collect3 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
        System.out.println("What is the average age of male and female employees::"+collect3);
        //Query 3.4 : Get the details of highest paid employee in the organization?
        Optional<Employee> collect4 = employeeList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
        System.out.println("Get the details of highest paid employee in the organization::"+collect4);
        // Query 3.5 : Get the names of all employees who have joined after 2015?
        List<Employee> collect5 = employeeList.stream().filter(employee -> employee.getYearOfJoining() > 2015).collect(Collectors.toList());
        System.out.println("Get the names of all employees who have joined after 2015::"+collect5);
        // Query 3.6 : Count the number of employees in each department?
        Map<String, Long> collect6 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.counting()));
        System.out.println("Count the number of employees in each department::"+collect6);
        // Query 3.7 : What is the average salary of each department?
        Map<String, Double> collect7 = employeeList.stream().collect(Collectors.groupingBy(Employee::getDepartment, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("What is the average salary of each department::"+collect7);
        // Query 3.8 : Get the details of youngest male employee in the product development department?
        Optional<Employee> collect8 = employeeList.stream()
                .filter(employee -> employee.getGender().equalsIgnoreCase("male") && employee.getDepartment().equalsIgnoreCase("Product Development"))
                .sorted(Comparator.comparing(Employee::getAge).reversed()).findFirst();
        System.out.println("Get the details of youngest male employee in the product development department::"+collect8.get());
        // Query 3.9 : Who has the most working experience in the organization?
        Optional<Employee> max9 = employeeList.stream().min(Comparator.comparingInt(Employee::getYearOfJoining));
        System.out.println("Who has the most working experience in the organization::"+max9.get());
        // Query 3.10 : How many male and female employees are there in the sales and marketing team?
        Map<String, Long> sales_and_marketing = employeeList.stream().filter(e -> e.getDepartment().equalsIgnoreCase("Sales And Marketing"))
                .collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));

        System.out.println("How many male and female employees are there in the sales and marketing team::"+sales_and_marketing);
        // Query 3.11 : What is the average salary of male and female employees?
        Map<String, Double> collect11 = employeeList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("What is the average salary of male and female employees::"+collect11);
        // Query 3.12 : List down the names of all employees in each department?
        Map<String, List<String>> collect12 = employeeList.stream()
                .collect(Collectors.groupingBy(Employee::getDepartment,
                        Collectors.collectingAndThen(Collectors.toList(), li -> li.stream().map(Employee::getName).collect(Collectors.toList()))));
        System.out.println("List down the names of all employees in each department::"+collect12);
        // Query 3.13 : What is the average salary and total salary of the whole organization?
        DoubleSummaryStatistics collect13 = employeeList.stream().collect(Collectors.summarizingDouble(Employee::getSalary));
        System.out.println("What is the average salary and total salary of the whole organization::"+collect13.getAverage());
        System.out.println("What is the average salary and total salary of the whole organization::"+collect13.getSum());
        // Query 3.14 : Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years.
        Map<Boolean, List<Employee>> collect14 = employeeList.stream().collect(Collectors.partitioningBy(employee -> employee.getAge() > 25));
        System.out.println("Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years::");
        for (Map.Entry<Boolean, List<Employee>> entry:collect14.entrySet()) {
           if(entry.getKey().equals(Boolean.TRUE)){
               System.out.println("employee is younger or equal to 25 years ");
           } else {
               System.out.println("employees who are older than 25 years");
           }
            System.out.println("----------------------------");

            List<Employee> list = entry.getValue();

            for (Employee e : list)
            {
                System.out.println(e.getName());
            }
        }
        // Query 3.15 : Who is the oldest employee in the organization? What is his age and which department he belongs to?
        Optional<Employee> max15 = employeeList.stream().max(Comparator.comparing(Employee::getAge));
        if(max15.isPresent()){
            Employee employee = max15.get();
            System.out.println("Who is the oldest employee in the organization? What is his age and which department he belongs to::");
            System.out.println("employee name::"+employee.getName());
            System.out.println("employee age::"+employee.getAge());
            System.out.println("employee department::"+employee.getDepartment());
        }
    }
}
