package com.pm.java8;

import java.util.Arrays;

public class ConvertIntegerToInt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {1, 2, 3, 4, 5};

        // Convert Integer[] → int[]
        int[] primitiveArr = Arrays.stream(arr)   // Stream<Integer>
                                   .mapToInt(Integer::intValue) // convert to IntStream
                                   .toArray(); // collect into int[]

        System.out.println(Arrays.toString(primitiveArr));
	}

}

/*
 * non java8 Integer[] arr = {1, 2, 3, 4, 5}; 
 * int[] primitiveArr = new int[arr.length];
 * 
 * for (int i = 0; i < arr.length; i++) { primitiveArr[i] = arr[i]; //
 * auto-unboxing }
 */

