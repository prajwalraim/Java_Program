package main.java.com.example.java8.streams;
import java.util.*;
public class Program15_FindDuplicates {
    public static void main(String[] args) {
        List<String> l = Arrays.asList("a","b","a","c","b");
        l.stream().filter(i->Collections.frequency(l,i)>1).distinct().forEach(System.out::println);
    }
}
