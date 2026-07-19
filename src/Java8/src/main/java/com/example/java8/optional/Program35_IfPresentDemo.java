package main.java.com.example.java8.optional;
import java.util.Optional;
public class Program35_IfPresentDemo {
    public static void main(String[] args) {
        Optional<String> o = Optional.ofNullable("Hi");
        System.out.println(o);
        o.ifPresent(s->System.out.println("Value: "+s));
    }
}
