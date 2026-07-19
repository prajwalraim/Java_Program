package main.java.com.example.java8.streams;
import java.util.*;
public class Program20_FlattenListOfLists {
    public static void main(String[] args) {
        List<List<Integer>> lol = Arrays.asList(Arrays.asList(1,2), Arrays.asList(3,4));
        lol.stream().flatMap(List::stream).forEach(System.out::println);
    }
}
