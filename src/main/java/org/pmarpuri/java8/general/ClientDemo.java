package org.pmarpuri.java8.general;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class ClientDemo {
    public static void main(String[] args) {
        int[] arr = {10,84,383,93,839};

      IntStream ir = Arrays.stream(arr);
         ir.filter(x->x%2==0).forEach(System.out::println);

        int asInt = Arrays.stream(arr).min().getAsInt();
        System.out.println(asInt);

        int sum = Arrays.stream(arr).sum();
        System.out.println(sum);
        System.out.println(Arrays.stream(arr).isParallel());
        System.out.println(Arrays.stream(arr).parallel().isParallel());

        OptionalInt max = Arrays.stream(arr).max();

        List<Integer> list  =Stream.of(1,1, 2, 3,5,6,3,7,3,8,3,9,10,10).collect(Collectors.toList());
        Optional<Integer> integer = list.stream().max((v, b) -> v.compareTo(b));
        System.out.println(integer.get());
        Optional<Integer> max1 = list.parallelStream().max(Integer::compareTo);
        System.out.println(max1.get());
        Optional<Integer> min = list.parallelStream().min(Integer::compareTo);
        System.out.println(min.get());
        List<Integer> collect = list.stream().collect(Collectors.toSet()).stream().collect(Collectors.toList());
        System.out.println(collect);
        Set<Integer> collect1 = list.stream().collect(Collectors.toSet());
        System.out.println(collect1);

    }
}
