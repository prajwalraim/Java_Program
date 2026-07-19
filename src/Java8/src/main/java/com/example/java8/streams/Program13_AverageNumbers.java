package main.java.com.example.java8.streams;
import java.util.*;
public class Program13_AverageNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(1,2,3,4,5);
        System.out.println(nums.stream().mapToInt(Integer::intValue).average().getAsDouble());
    }
}
