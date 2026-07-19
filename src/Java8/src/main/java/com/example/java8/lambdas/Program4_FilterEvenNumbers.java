package main.java.com.example.java8.lambdas;
import java.util.*;
public class Program4_FilterEvenNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5,6);
        nums.stream().filter(n->n%2==0).forEach(System.out::println);
    }
}
