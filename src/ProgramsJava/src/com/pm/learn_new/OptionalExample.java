package com.pm.learn_new;


import java.util.Optional;

public class OptionalExample {
    public static void main(String[] args) {

        String name = null; // could be null or non-null

        // Create an Optional that may contain a value or be empty
        Optional<String> opt = Optional.ofNullable(name);

        // Get value if present, otherwise return "Default"
        String result = opt.orElse("Default");

        System.out.println("Result: " + result); // Prints "Default" since name is null


        // Now with a non-null value
        name = "Prajwal";
        opt = Optional.ofNullable(name);
        result = opt.orElse("Default");

        System.out.println("Result: " + result); // Prints "Prajwal"
    }
}
