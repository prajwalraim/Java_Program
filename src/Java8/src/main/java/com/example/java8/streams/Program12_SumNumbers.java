package com.example.java8.streams;
import java.util.*;
public class Program12_SumNumbers {
    public static void main(String[] args) {
        List<Integer> nums = Arrays.asList(10,20,30);
        System.out.println(nums.stream().mapToInt(Integer::intValue).sum());
    }
}
