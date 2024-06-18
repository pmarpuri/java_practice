package org.pmarpuri.java8.flatMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class UserImpl {
    public static void main(String[] args) {
        System.out.println("here");
        List<User> user =   Stream.of(
                new User("Purushothama","0506103159", Arrays.asList("pmarpuri@etisalat.ae","chowdari.mp@gmail.com")),
                new User("Jahnavi","8885681016", Arrays.asList("jahnavi@gmail.com","jahnavi@etisalat.ae")),
                new User("Hrutvik","9492594121", Arrays.asList("hmarpuri@etisalat.ae","hrutvik@gmail.com")),
                new User("Mokshagna","93839379229", Arrays.asList("mmarpuri@etisalat.ae","mokshagna@gmail.com"))).collect(Collectors.toList());

        List<String> as = new ArrayList<>();
        for (User u :user) {
            as.add(u.getPhone());
        }
        List<String> collect = user.stream().map(User::getPhone).collect(Collectors.toList());
        System.out.println(collect);
        List<List<String>> collect1 = user.stream().map(User::getEmail).collect(Collectors.toList());
        System.out.println(collect1);
        List<String> collect2 = user.stream().flatMap(u -> u.getEmail().stream()).collect(Collectors.toList());
        System.out.println(collect2);

    }
}

