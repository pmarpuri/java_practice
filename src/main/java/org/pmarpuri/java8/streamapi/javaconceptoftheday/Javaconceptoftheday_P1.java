package org.pmarpuri.java8.streamapi.javaconceptoftheday;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Javaconceptoftheday_P1 {
    //https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
    public static void main(String[] args) {
        // 1) Given a list of integers, separate odd and even numbers?
        System.out.println("1) Given a list of integers, separate odd and even numbers?");
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);

        System.out.println("------------------------------------------------------------------");
        // 2) How do you remove duplicate elements from a list using Java 8 streams?
        System.out.println("2) How do you remove duplicate elements from a list using Java 8 streams?");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");

        System.out.println("------------------------------------------------------------------");
        // 3) How do you find frequency of each character in a string using Java 8 streams?
        System.out.println("3) How do you find frequency of each character in a string using Java 8 streams?");
        String inputString = "Java Concept Of The Day";
        System.out.println("------------------------------------------------------------------");
        // 4) How do you find frequency of each element in an array or a list?
        System.out.println("4) How do you find frequency of each element in an array or a list?");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");

        System.out.println("------------------------------------------------------------------");
        // 5) How do you sort the given list of decimals in reverse order?
        System.out.println("5) How do you sort the given list of decimals in reverse order?");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);

        System.out.println("------------------------------------------------------------------");
        // 6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        System.out.println("6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?");
        List<String> listOfStrings6 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
       // String collect6 = listOfStrings6.stream().collect(Collectors.joining(",", "[", "]"));

        System.out.println("------------------------------------------------------------------");
        // 7) From the given list of integers, print the numbers which are multiples of 5?
        System.out.println("7) From the given list of integers, print the numbers which are multiples of 5?");
        List<Integer> listOfIntegers7 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("------------------------------------------------------------------");
        // 8) Given a list of integers, find maximum and minimum of those numbers?
        System.out.println("8) Given a list of integers, find maximum and minimum of those numbers?");
        List<Integer> listOfIntegers8 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("------------------------------------------------------------------");
        // 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        System.out.println("9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?");
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};

        System.out.println("------------------------------------------------------------------");
        // 10) How do you merge two unsorted arrays into single sorted array without duplicates?
        System.out.println("10) How do you merge two unsorted arrays into single sorted array without duplicates?");
        int[] a10 = new int[] {4, 2, 5, 1};
        int[] b10 = new int[] {8, 1, 9, 5};

        System.out.println("------------------------------------------------------------------");
        // 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        System.out.println(" 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?");
        List<Integer> listOfIntegers11 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

         System.out.println("------------------------------------------------------------------");
        // 12) Java 8 program to check if two strings are anagrams or not?
        System.out.println(" 12) Java 8 program to check if two strings are anagrams or not?");
        String s1 = "RaceCar";
        String s2 = "CarRace";

        System.out.println("------------------------------------------------------------------");
        // 13) Find sum of all digits of a number in Java 8?
        System.out.println(" 13) Find sum of all digits of a number in Java 8?");
        int i = 15623;

        System.out.println("------------------------------------------------------------------");
        // 14) Find second largest number in an integer array?
        System.out.println(" 14) Find second largest number in an integer array?");
        List<Integer> listOfIntegers14 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);

        System.out.println("------------------------------------------------------------------");
        // 15) Given a list of strings, sort them according to increasing order of their length?
        System.out.println(" 15) Given a list of strings, sort them according to increasing order of their length?");
        List<String> listOfStrings15 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");

        System.out.println("------------------------------------------------------------------");
        // 16) Given an integer array, find sum and average of all elements?
        System.out.println("16) Given an integer array, find sum and average of all elements?");
        int[] a16 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};

        System.out.println("------------------------------------------------------------------");
        // 17) How do you find common elements between two arrays?
        System.out.println(" 17) How do you find common elements between two arrays?");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);

       /*
        List<Integer> li = new ArrayList<>();
        System.out.println(collect12);
        for (Integer it:list1) {
            if(list2.contains(it)){
                li.add(it);
            }
        }
        System.out.println(li);
        */
        System.out.println("------------------------------------------------------------------");
        // 18) Reverse each word of a string using Java 8 streams?
        System.out.println("18) Reverse each word of a string using Java 8 streams?");
        String str = "Java Concept Of The Day";

        System.out.println("------------------------------------------------------------------");
        // 19) How do you find sum of first 10 natural numbers?
        System.out.println("19) How do you find sum of first 10 natural numbers?");

        System.out.println("------------------------------------------------------------------");
        // 20) Reverse an integer array
        System.out.println("20) Reverse an integer array");
        int[] array = new int[] {5, 1, 7, 3, 9, 6};

        System.out.println("------------------------------------------------------------------");
        // 21) Print first 10 even numbers
        System.out.println("21) Print first 10 even numbers");

        System.out.println("------------------------------------------------------------------");
        // 22) How do you find the most repeated element in an array?
        System.out.println(" 22) How do you find the most repeated element in an array?");
        List<String> listOfStrings22 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> collect14 = listOfStrings22.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("------------------------------------------------------------------");
        // 23) Palindrome program using Java 8 streams
        System.out.println("23) Palindrome program using Java 8 streams");
        String str23 = "ROTATOR";

        System.out.println("------------------------------------------------------------------");
        // 24) Given a list of strings, find out those strings which start with a number?
        System.out.println(" 24) Given a list of strings, find out those strings which start with a number?");
        List<String> listOfStrings24 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");

        System.out.println("------------------------------------------------------------------");
        // 25) How do you extract duplicate elements from an array?
        System.out.println(" 25) How do you extract duplicate elements from an array?");
        List<Integer> listOfIntegers25 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        System.out.println("------------------------------------------------------------------");
        // 26) Print duplicate characters in a string?
        System.out.println("26) Print duplicate characters in a string?");
        String inputString26 = "Java Concept Of The Day";

        System.out.println("------------------------------------------------------------------");
        // 27) Find first repeated character in a string?
        System.out.println("27) Find first repeated character in a string?");
        String inputString27 = "Java Concept Of The Day";

        System.out.println("------------------------------------------------------------------");
        // 28) Find first non-repeated character in a string?
        System.out.println("28) Find first non-repeated character in a string?");
        String inputString28 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();

        System.out.println("------------------------------------------------------------------");
        // 29) Fibonacci series
        System.out.println("29) Fibonacci series");
        System.out.println("------------------------------------------------------------------");
        // 30) First 10 odd numbers
        System.out.println("30) First 10 odd numbers");

        System.out.println("------------------------------------------------------------------");
        // 31) How do you get last element of an array?
        System.out.println("31) How do you get last element of an array?");
        List<String> listOfStrings31 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");

        System.out.println("------------------------------------------------------------------");
        // 32) Find the age of a person in years if the birthday has given?
        System.out.println("32) Find the age of a person in years if the birthday has given?");
        LocalDate birthDay = LocalDate.of(1988, 8, 16);

        System.out.println("------------------------------------------------------------------");

    }
}
