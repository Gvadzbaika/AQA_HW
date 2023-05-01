package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Random;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
            Stream<User> users = Stream.generate(() ->
                    new User(User.getRandomName(), random.nextInt(100) , User.getRandomEmail(),
                            random.nextBoolean() ? "male" : "female"));

        List<User> usersList = users
                .limit(20)
                .filter(user -> user.getAge() > 18)
                .sorted(Comparator.comparing(User::getName))
                .filter(user -> !user.getEmail().isEmpty())
                .toList();

        Map<String, List<String>> sortedUsers = usersList.stream()
                .collect(Collectors.groupingBy(User::getGender, Collectors.mapping(User::getName, Collectors.toList())));

        System.out.println(sortedUsers);

    }
}