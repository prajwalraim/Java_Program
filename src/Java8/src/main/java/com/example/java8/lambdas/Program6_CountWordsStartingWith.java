package main.java.com.example.java8.lambdas;
import java.util.*;
public class Program6_CountWordsStartingWith {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple","banana","avocado","cherry");
        long c = words.stream().filter(s->s.startsWith("a")).count();
        System.out.println("Count starting with a: "+c);
    }
}
