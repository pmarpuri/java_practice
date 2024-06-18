package org.pmarpuri.java8.streamapi.devgenius;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8IVQuestions_P1 {
    // https://blog.devgenius.io/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062
    public static void main(String[] args) {
        // 1) Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
        System.out.println("Q) Given a list of integers, find out all the even numbers that exist in the list using Stream functions?");
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);

        System.out.println("------------------------------------------------------------------");
        // 2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        System.out.println("2. Given a list of integers, find out all the numbers starting with 1 using Stream functions?");
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);

        System.out.println("------------------------------------------------------------------");
        // 3. How to find duplicate elements in a given integers list in java using Stream functions?
        System.out.println("3. How to find duplicate elements in a given integers list in java using Stream functions?");
        List<Integer> myList3 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        System.out.println("------------------------------------------------------------------");
        // 4. Given the list of integers, find the first element of the list using Stream functions?
        System.out.println("4. Given the list of integers, find the first element of the list using Stream functions?");
        List<Integer> myList4 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        System.out.println("------------------------------------------------------------------");
        // 5. Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println("5. Given a list of integers, find the total number of elements present in the list using Stream functions?");
        List<Integer> myList5 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        System.out.println("------------------------------------------------------------------");
        // 6. Given a list of integers, find the maximum value element present in it using Stream functions?
        System.out.println("6. Given a list of integers, find the maximum value element present in it using Stream functions?");
        List<Integer> myList6 = Arrays.asList(10,15,8,49,25,98,98,32,15);

        System.out.println("------------------------------------------------------------------");
        // 7. Given a String, find the first non-repeated character in it using Stream functions?
        System.out.println("7. Given a String, find the first non-repeated character in it using Stream functions?");
        String input = "Java articles are Awesome";
        System.out.println("------------------------------------------------------------------");
        // 8. Given a String, find the first repeated character in it using Stream functions?
        System.out.println("8. Given a String, find the first repeated character in it using Stream functions?");
        System.out.println("------------------------------------------------------------------");
        // 9. Given a list of integers, sort all the values present in it using Stream functions?
        String input2 = "Java Articles are Awesome";
        System.out.println("9. Given a list of integers, sort all the values present in it using Stream functions?");
        List<Integer> myList9 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("------------------------------------------------------------------");
        // 10. Given a list of integers, sort all the values present in it in descending order using Stream functions?
        List<Integer> myList10 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        System.out.println("10. Given a list of integers, sort all the values present in it in descending order using Stream functions?");

        System.out.println("------------------------------------------------------------------");
        // 11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
        System.out.println("11. Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.");

        System.out.println("------------------------------------------------------------------");
        // 12. How will you get the current date and time using Java 8 Date and Time API?

        System.out.println("------------------------------------------------------------------");
        // 13. Write a Java 8 program to concatenate two Streams?
        System.out.println("13. Write a Java 8 program to concatenate two Streams?");
        List<String> list1 = Arrays.asList("Java", "8");
        List<String> list2 = Arrays.asList("explained", "through", "programs");

        System.out.println("------------------------------------------------------------------");
        // 14. Java 8 program to perform cube on list elements and filter numbers greater than 50.
        List<Integer> integerist = Arrays.asList(4,5,6,7,1,2,3);

        System.out.println("------------------------------------------------------------------");
        // 15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?
        System.out.println("15. Write a Java 8 program to sort an array and then convert the sorted array into Stream?");
        int arr[] = { 99, 55, 203, 99, 4, 91 };

        System.out.println("------------------------------------------------------------------");
        // 16. How to use map to convert object into Uppercase in Java 8?
        System.out.println("16. How to use map to convert object into Uppercase in Java 8?");
        List<String> strings = Arrays.asList("a", "b", "c", "d", "e");
        System.out.println("------------------------------------------------------------------");
        // 17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?
        System.out.println("17. How to convert a List of objects into a Map by considering duplicated keys and store them in sorted order?");

        List<Notes> noteLst = new ArrayList<>();
        noteLst.add(new Notes(1, "note1", 11));
        noteLst.add(new Notes(2, "note2", 22));
        noteLst.add(new Notes(3, "note3", 33));
        noteLst.add(new Notes(4, "note4", 44));
        noteLst.add(new Notes(5, "note5", 55));

        noteLst.add(new Notes(6, "note4", 66));

        System.out.println("------------------------------------------------------------------");
        // 18. How to count each element/word from the String ArrayList in Java8?
        System.out.println("18. How to count each element/word from the String ArrayList in Java8?");
        List<String> names = Arrays.asList("AA", "BB", "AA", "CC");

        System.out.println("------------------------------------------------------------------");
        // 19. How to find only duplicate elements with its count from the String ArrayList in Java8?
        System.out.println("19. How to find only duplicate elements with its count from the String ArrayList in Java8?");
        List<String> names19 = Arrays.asList("AA", "BB", "AA", "CC");

        System.out.println("------------------------------------------------------------------");
        // 20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?
        System.out.println("20. How to check if list is empty in Java 8 using Optional, if not null iterate through the list and print the object?");
        // input as noteLst

        System.out.println("------------------------------------------------------------------");
        // 21. Write a Program to find the Maximum element in an array?
        System.out.println("21. Write a Program to find the Maximum element in an array?");
        int[] arr21 = {12,19,20,88,00,9};

        System.out.println("------------------------------------------------------------------");
        // 22. Write a program to print the count of each character in a String?
        System.out.println("22. Write a program to print the count of each character in a String?");
        String name22 = "string data to count each character";

        System.out.println("------------------------------------------------------------------");


    }
}

