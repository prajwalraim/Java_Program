package main.java.com.example.java8.collectors;
import java.util.*;
import java.util.stream.Collectors;
public class Program21_JoinStrings {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("one","two","three");
//hello
        System.out.println(l.stream().collect(Collectors.joining(",")));
    }
}
//praj