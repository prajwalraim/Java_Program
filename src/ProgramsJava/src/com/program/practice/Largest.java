package com.program.practice;

import java.util.Arrays;

public class Largest {

    public static void main(String[] args) {
    	int[] numbers = {12, 45, 2, 67, 33, 89, 23};
        
        int aa = Arrays.stream(numbers).boxed().distinct().sorted((a,b)-> b-a).skip(1).findFirst().get();
        System.out.println("The second largest number is aa: " + aa);
       Integer dd =  Arrays.stream(numbers).boxed().max(Integer::compare).get();
       System.out.println(dd+"---max");
        
        int max = findLargest(numbers);

        System.out.println("The largest number is: " + max);
    }

    public static int findLargest(int[] arr) {
        int max = arr[0]; // assume first element is largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i]; // update max if current element is greater
            }
        }

        return max;
    }
}
