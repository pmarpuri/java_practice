package org.pmarpuri.java8.streamapi.java8streamapiemployee;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class EmployeeData {
    public static List<Employee>  list ;
    static{
        list = Stream.of(new Employee(1, "abc", 28, 123, "F", "HR", "Blore", 2020),
                new Employee(2, "xyz", 29, 120, "F", "HR", "Hyderabad", 2015),
                new Employee(3, "efg", 30, 115, "M", "HR", "Chennai", 2014),
                new Employee(4, "def", 32, 125, "F", "HR", "Chennai", 2013),
                new Employee(5, "ijk", 22, 60, "F", "IT", "Noida", 2013),
                new Employee(6, "mno", 27, 140, "M", "IT", "Gurugram", 2017),
                new Employee(7, "uvw", 26, 130, "F", "IT", "Pune", 2016),
                new Employee(8, "pqr", 23, 145, "M", "IT", "Trivandrum", 2015),
                new Employee(9, "stv", 88, 160, "M", "IT", "Blore", 2010),
                new Employee(10, "marpuri", 25, 115, "F", "BT", "Blore", 2023)
        ).collect(Collectors.toList());
    }

    @Data
    @AllArgsConstructor
    @NoArgsConstructor
    public static class Employee {
        private int id;
        private String name;
        private int age;
        private long salary;
        private String gender;
        private String deptName;
        private String city;
        private int yearOfJoining;
    }
}
