package main.java.com.example.java8.optional;
import java.util.Optional;
public class Program32_AvoidNullPointer {
    public static void main(String[] args) {
        String name = null;
        Optional<String> opt = Optional.ofNullable(name);
        opt.ifPresent(System.out::println);
        System.out.println(opt.orElse("No name"));
    }
}
