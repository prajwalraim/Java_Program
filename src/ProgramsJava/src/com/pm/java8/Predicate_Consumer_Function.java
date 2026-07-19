package com.pm.java8;

import java.util.List;
import java.util.function.Predicate;
import java.util.function.Consumer;
import java.util.function.Function;        import java.util.function.BinaryOperator;

import java.util.function.UnaryOperator;

public class Predicate_Consumer_Function {
	public static void main(String[] args) {
//Predicate<T> (Condition / Boolean check)
        Predicate<Integer> isEven = n -> n % 2 == 0;

        System.out.println(isEven.test(10)); // true
        System.out.println(isEven.test(7));  // false
        
        List<Integer> list = List.of(10, 15, 20, 25);

        list.stream()
            .filter(n -> n % 2 == 0)
            .forEach(System.out::println);
        
        
        //Function<T, R> (Input → Output)

        Function<String, Integer> lengthFn = s -> s.length();

        System.out.println(lengthFn.apply("Java")); // 4
        
        //Consumer<T> (Consumes data, no return)
        
        Consumer<String> print = s -> System.out.println(s);

        print.accept("Hello Java 8");
        
        //UnaryOperator<T> (Same input & output)

        UnaryOperator<Integer> square = n -> n * n;

        System.out.println(square.apply(5)); // 25


//BinaryOperator<T> (Two inputs, same output)

        BinaryOperator<Integer> add = (a, b) -> a + b;

        System.out.println(add.apply(10, 20)); // 30

        
        
    }
}
