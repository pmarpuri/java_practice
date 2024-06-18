package org.pmarpuri.java8.streamapi.javaconceptoftheday;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Javaconceptoftheday {
    //https://javaconceptoftheday.com/java-8-interview-sample-coding-questions/
    public static void main(String[] args) {
        // 1) Given a list of integers, separate odd and even numbers?
        System.out.println("1) Given a list of integers, separate odd and even numbers?");
        List<Integer> listOfIntegers = Arrays.asList(71, 18, 42, 21, 67, 32, 95, 14, 56, 87);
        Map<Boolean, List<Integer>> collect = listOfIntegers.stream().collect(Collectors.partitioningBy(integer -> integer % 2 == 0));
        Set<Map.Entry<Boolean, List<Integer>>> entries = collect.entrySet();
        for (Map.Entry<Boolean, List<Integer>> es :entries) {
            if(es.getKey()){
                System.out.println("even numbers : "+es.getValue());
            } else {
                System.out.println("odd numbers : "+es.getValue());
            }
        }
        System.out.println("------------------------------------------------------------------");
        // 2) How do you remove duplicate elements from a list using Java 8 streams?
        System.out.println("2) How do you remove duplicate elements from a list using Java 8 streams?");
        List<String> listOfStrings = Arrays.asList("Java", "Python", "C#", "Java", "Kotlin", "Python");
        Set<String> collect1 = listOfStrings.stream().collect(Collectors.toSet());
        List<String> collect2 = listOfStrings.stream().distinct().collect(Collectors.toList());
        System.out.println(collect1);
        System.out.println(collect2);
        System.out.println("------------------------------------------------------------------");
        // 3) How do you find frequency of each character in a string using Java 8 streams?
        System.out.println("3) How do you find frequency of each character in a string using Java 8 streams?");
        String inputString = "Java Concept Of The Day";
        Map<Character, Long> collect3 = inputString
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect3);
        System.out.println("------------------------------------------------------------------");
        // 4) How do you find frequency of each element in an array or a list?
        System.out.println("4) How do you find frequency of each element in an array or a list?");
        List<String> stationeryList = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Stapler", "Note Book", "Pencil");
        Map<String, Long> collect4 = stationeryList.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        System.out.println(collect4);
        System.out.println("------------------------------------------------------------------");
        // 5) How do you sort the given list of decimals in reverse order?
        System.out.println("5) How do you sort the given list of decimals in reverse order?");
        List<Double> decimalList = Arrays.asList(12.45, 23.58, 17.13, 42.89, 33.78, 71.85, 56.98, 21.12);
        List<Double> collect5 = decimalList.stream().sorted(Comparator.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect5);
        System.out.println("------------------------------------------------------------------");
        // 6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?
        System.out.println("6) Given a list of strings, join the strings with ‘[‘ as prefix, ‘]’ as suffix and ‘,’ as delimiter?");
        List<String> listOfStrings6 = Arrays.asList("Facebook", "Twitter", "YouTube", "WhatsApp", "LinkedIn");
       // String collect6 = listOfStrings6.stream().collect(Collectors.joining(",", "[", "]"));
        String collect6 = listOfStrings6.stream().collect(Collectors.joining(","));
        System.out.println(collect6);
        System.out.println("------------------------------------------------------------------");
        // 7) From the given list of integers, print the numbers which are multiples of 5?
        System.out.println("7) From the given list of integers, print the numbers which are multiples of 5?");
        List<Integer> listOfIntegers7 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> collect7 = listOfIntegers7.stream().filter(integer -> integer % 5 == 0).collect(Collectors.toList());
        System.out.println(collect7);
        System.out.println("------------------------------------------------------------------");
        // 8) Given a list of integers, find maximum and minimum of those numbers?
        System.out.println("8) Given a list of integers, find maximum and minimum of those numbers?");
        List<Integer> listOfIntegers8 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer min = listOfIntegers8.stream().min(Integer::compareTo).get();
        System.out.println("min value is:"+min);
        Integer max = listOfIntegers8.stream().max(Integer::compareTo).get();
        System.out.println("max value is:"+max);
        System.out.println("------------------------------------------------------------------");
        // 9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?
        System.out.println("9) How do you merge two unsorted arrays into single sorted array using Java 8 streams?");
        int[] a = new int[] {4, 2, 7, 1};
        int[] b = new int[] {8, 3, 9, 5};
        int[] ints = IntStream.concat(Arrays.stream(a), Arrays.stream(b)).sorted().toArray();
        //Arrays.stream(ints).forEach(System.out::println);
        System.out.println(Arrays.toString(ints));
        System.out.println("------------------------------------------------------------------");
        // 10) How do you merge two unsorted arrays into single sorted array without duplicates?
        System.out.println("10) How do you merge two unsorted arrays into single sorted array without duplicates?");
        int[] a10 = new int[] {4, 2, 5, 1};
        int[] b10 = new int[] {8, 1, 9, 5};
        int[] ints1 = IntStream.concat(Arrays.stream(a10), Arrays.stream(b10)).sorted().distinct().toArray();
        int[] ints2 = IntStream.concat(Arrays.stream(a10), Arrays.stream(b10)).sorted().distinct().toArray();
        System.out.println(Arrays.toString(ints2));
        System.out.println("------------------------------------------------------------------");
        // 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?
        System.out.println(" 11) How do you get three maximum numbers and three minimum numbers from the given list of integers?");
        List<Integer> listOfIntegers11 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        List<Integer> max3 = listOfIntegers11.stream().sorted(Comparator.reverseOrder()).limit(3).collect(Collectors.toList());
        System.out.println("max3 numbers are : "+max3);
        List<Integer> min3 = listOfIntegers11.stream().sorted().limit(3).collect(Collectors.toList());
        System.out.println("min3 numbers are : "+min3);
        System.out.println("------------------------------------------------------------------");
        // 12) Java 8 program to check if two strings are anagrams or not?
        System.out.println(" 12) Java 8 program to check if two strings are anagrams or not?");
        String s1 = "RaceCar";
        String s2 = "CarRace";
        String collect8 = Stream.of(s1.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        String collect9 = Stream.of(s2.split("")).map(String::toLowerCase).sorted().collect(Collectors.joining());
        if(collect8.equals(collect9)){
            System.out.println("strings are anagrams");
        } else {
            System.out.println("strings are NOT anagrams");
        }
        System.out.println("------------------------------------------------------------------");
        // 13) Find sum of all digits of a number in Java 8?
        System.out.println(" 13) Find sum of all digits of a number in Java 8?");
        int i = 15623;
        Integer collect10 = Stream.of(String.valueOf(i).split("")).collect(Collectors.summingInt(Integer::parseInt));
        System.out.println("count of the value is  "+collect10);
        System.out.println("------------------------------------------------------------------");
        // 14) Find second largest number in an integer array?
        System.out.println(" 14) Find second largest number in an integer array?");
        List<Integer> listOfIntegers14 = Arrays.asList(45, 12, 56, 15, 24, 75, 31, 89);
        Integer integer = listOfIntegers14.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst().get();
        System.out.println(integer);
        System.out.println("------------------------------------------------------------------");
        // 15) Given a list of strings, sort them according to increasing order of their length?
        System.out.println(" 15) Given a list of strings, sort them according to increasing order of their length?");
        List<String> listOfStrings15 = Arrays.asList("Java", "Python", "C#", "HTML", "Kotlin", "C++", "COBOL", "C");
        List<String> collect11 = listOfStrings15.stream().sorted(Comparator.comparing(String::length)).collect(Collectors.toList());
        System.out.println(collect11);
        System.out.println("------------------------------------------------------------------");
        // 16) Given an integer array, find sum and average of all elements?
        System.out.println("16) Given an integer array, find sum and average of all elements?");
        int[] a16 = new int[] {45, 12, 56, 15, 24, 75, 31, 89};
        int sum = Arrays.stream(a16).sum();
        double asDouble = Arrays.stream(a16).average().getAsDouble();
        System.out.println(sum);
        System.out.println(asDouble);
        System.out.println("------------------------------------------------------------------");
        // 17) How do you find common elements between two arrays?
        System.out.println(" 17) How do you find common elements between two arrays?");
        List<Integer> list1 = Arrays.asList(71, 21, 34, 89, 56, 28);
        List<Integer> list2 = Arrays.asList(12, 56, 17, 21, 94, 34);
        List<Integer> collect12 = list1.stream().filter(list2::contains).collect(Collectors.toList());
        System.out.println(collect12);
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
        String collect13 = Arrays.stream(str.split(" ")).map(s -> new StringBuilder(s).reverse().toString()).collect(Collectors.joining(" "));
        System.out.println(collect13);
        System.out.println("------------------------------------------------------------------");
        // 19) How do you find sum of first 10 natural numbers?
        System.out.println("19) How do you find sum of first 10 natural numbers?");
        int c = IntStream.range(1, 10).sum();
        System.out.println(c);
        System.out.println("------------------------------------------------------------------");
        // 20) Reverse an integer array
        System.out.println("20) Reverse an integer array");
        int[] array = new int[] {5, 1, 7, 3, 9, 6};
        int[] ints3 = IntStream.rangeClosed(1, array.length).map(operand -> array[array.length - operand]).toArray();
        System.out.println("ints3:"+Arrays.toString(ints3));
        System.out.println("------------------------------------------------------------------");
        // 21) Print first 10 even numbers
        System.out.println("21) Print first 10 even numbers");
        int[] ints4 = IntStream.rangeClosed(1, 20).filter(o -> o % 2 == 0).toArray();
        System.out.println(Arrays.toString(ints4));
        System.out.println("------------------------------------------------------------------");
        // 22) How do you find the most repeated element in an array?
        System.out.println(" 22) How do you find the most repeated element in an array?");
        List<String> listOfStrings22 = Arrays.asList("Pen", "Eraser", "Note Book", "Pen", "Pencil", "Pen", "Note Book", "Pencil");
        Map<String, Long> collect14 = listOfStrings22.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
        Map.Entry<String, Long> stringLongEntry = collect14.entrySet().stream().max(Map.Entry.comparingByValue()).get();
        System.out.println("Max repeated value:"+stringLongEntry.getValue());
        System.out.println("Count :"+stringLongEntry.getKey());
        System.out.println("------------------------------------------------------------------");
        // 23) Palindrome program using Java 8 streams
        System.out.println("23) Palindrome program using Java 8 streams");
        String str23 = "ROTATOR";
        boolean b1 = IntStream.rangeClosed(0, str23.length() / 2).noneMatch(pr -> str23.charAt(pr) != str23.charAt(str23.length() - pr - 1));
        if (b1){
            System.out.println(str23+":is Palindrome");
        } else {
            System.out.println(str23+":is not Palindrome");
        }
        System.out.println("------------------------------------------------------------------");
        // 24) Given a list of strings, find out those strings which start with a number?
        System.out.println(" 24) Given a list of strings, find out those strings which start with a number?");
        List<String> listOfStrings24 = Arrays.asList("One", "2wo", "3hree", "Four", "5ive", "Six");
        List<String> collect15 = listOfStrings24.stream().filter(s -> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
        System.out.println(collect15);
        System.out.println("------------------------------------------------------------------");
        // 25) How do you extract duplicate elements from an array?
        System.out.println(" 25) How do you extract duplicate elements from an array?");
        List<Integer> listOfIntegers25 = Arrays.asList(111, 222, 333, 111, 555, 333, 777, 222);
        Set<Integer> collect16 = listOfIntegers25.stream().filter(integer1 -> Collections.frequency(listOfIntegers25, integer1) > 1).collect(Collectors.toSet());
        System.out.println(collect16);
        System.out.println("------------------------------------------------------------------");
        // 26) Print duplicate characters in a string?
        System.out.println("26) Print duplicate characters in a string?");
        String inputString26 = "Java Concept Of The Day";
        Set<String> uniqCharacters = new HashSet<>();
        inputString26 = inputString26.replaceAll("\\s+", "").toLowerCase();
        Set<String> collect17 = Arrays.stream(inputString26.split("")).filter(s -> !uniqCharacters.add(s)).collect(Collectors.toSet());
        System.out.println(collect17);
        System.out.println("------------------------------------------------------------------");
        // 27) Find first repeated character in a string?
        System.out.println("27) Find first repeated character in a string?");
        String inputString27 = "Java Concept Of The Day";
        inputString27 = inputString27.replace("\\s","").toLowerCase();
        System.out.println(inputString27);
        LinkedHashMap<String, Long> collect18 = Arrays.stream(inputString26.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect18);
        String s = collect18.entrySet().stream().filter(stringLongEntry1 -> stringLongEntry1.getValue() > 1).map(entry -> entry.getKey()).findFirst().get();
        System.out.println(s);
        System.out.println("------------------------------------------------------------------");
        // 28) Find first non-repeated character in a string?
        System.out.println("28) Find first non-repeated character in a string?");
        String inputString28 = "Java Concept Of The Day".replaceAll("\\s+", "").toLowerCase();
        Map<String, Long> collect28 = Arrays.stream(inputString28.split("")).collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
        System.out.println(collect28);
        String s3 = collect28.entrySet()
                .stream()
                .filter(entry -> entry.getValue() == 1)
                .map(entry -> entry.getKey())
                .findFirst().get();
        System.out.println("frist non repeated character :"+s3);
        System.out.println("------------------------------------------------------------------");
        // 29) Fibonacci series
        System.out.println("29) Fibonacci series");
        System.out.println("------------------------------------------------------------------");
        // 30) First 10 odd numbers
        System.out.println("30) First 10 odd numbers");
        long[] longs = IntStream.rangeClosed(1, 20).asLongStream().filter(value -> value % 2 != 0).toArray();
        System.out.println(Arrays.toString(longs));
        System.out.println("------------------------------------------------------------------");
        // 31) How do you get last element of an array?
        System.out.println("31) How do you get last element of an array?");
        List<String> listOfStrings31 = Arrays.asList("One", "Two", "Three", "Four", "Five", "Six");
        String s4 = listOfStrings31.stream().skip(listOfStrings31.size() - 1).findFirst().get();
        System.out.println("last element "+s4);
        System.out.println("------------------------------------------------------------------");
        // 32) Find the age of a person in years if the birthday has given?
        System.out.println("32) Find the age of a person in years if the birthday has given?");
        LocalDate birthDay = LocalDate.of(1988, 8, 16);
        long between = ChronoUnit.YEARS.between(birthDay, LocalDate.now());
        System.out.println(between);
        System.out.println("------------------------------------------------------------------");

    }
}
