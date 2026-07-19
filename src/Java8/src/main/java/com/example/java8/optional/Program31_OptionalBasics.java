package main.java.com.example.java8.optional;
import java.util.Optional;
public class Program31_OptionalBasics {
    public static void main(String[] args) {
        Optional<String> o = Optional.of("Hello");
        System.out.println(o.get());
        System.out.println(Optional.empty().orElse("default"));
        System.out.println(o.orElse("baba"));
    }
}
