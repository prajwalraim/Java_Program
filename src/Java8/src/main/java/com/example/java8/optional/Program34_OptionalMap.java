package main.java.com.example.java8.optional;
import java.util.Optional;
public class Program34_OptionalMap {
    public static void main(String[] args) {
        Optional<String> o = Optional.of("hello");
        System.out.println(o.map(String::toUpperCase).orElse("none"));
    }
}
