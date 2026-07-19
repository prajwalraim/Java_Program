package main.java.com.example.java8.streams;
import java.util.*;
import java.util.stream.Collectors;
public class Program19_PartitionEvenOdd {
    public static void main(String[] args) {
        List<Integer> l = Arrays.asList(1,2,3,4,5,6);
        Map<Boolean, List<Integer>> m = l.stream().collect(Collectors.partitioningBy(i->i%2==0));
        System.out.println(m);
    }
}
