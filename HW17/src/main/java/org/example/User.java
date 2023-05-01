package org.example;

import com.github.javafaker.Faker;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Random;
import java.util.random.RandomGenerator;


public class User {
    private String name;
    private int age;
    private String email;
    private String gender;

    public User(String name, int age, String email, String gender) {
        this.name = name;
        this.age = age;
        this.email = email;
        this.gender = gender;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getEmail() {
        return email;
    }

    public String getGender() {
        return gender;
    }

    public static String getRandomName() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        return name;
    }
    public static String getRandomEmail() {
         Faker faker = new Faker();
         return faker.internet().emailAddress();
        }
    }


