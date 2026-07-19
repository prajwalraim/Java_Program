package main.java.com.example.java8.lambdas;
import java.util.*;
public class Program9_RemoveNulls {
    public static void main(String[] args) {
        List<String> l = new ArrayList<>(Arrays.asList("A",null,"B",null,"C"));
        l.removeIf(Objects::isNull);
        System.out.println(l);
    }
}
