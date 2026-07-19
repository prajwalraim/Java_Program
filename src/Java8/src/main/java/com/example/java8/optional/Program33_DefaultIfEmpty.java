package main.java.com.example.java8.optional;
public class Program33_DefaultIfEmpty {
    public static void main(String[] args) {
        Optional<String> o = Optional.empty();
        System.out.println(o.orElse("DefaultVal"));
    }
}
