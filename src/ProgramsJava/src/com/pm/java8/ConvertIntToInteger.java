package com.pm.java8;

import java.util.Arrays;
import java.util.List;

public class ConvertIntToInteger {
	 public static void main(String[] args) {
	        int[] arr = {1, 2, 3, 4, 5};
	        List l = Arrays.asList("jj","kk");

	        // Convert int[] → Integer[]
	        Integer[] boxedArr = Arrays.stream(arr)    // IntStream
	                                   .boxed()        // Stream<Integer>
	                                   .toArray(Integer[]::new); // Collect into Integer[]

	        System.out.println(Arrays.toString(boxedArr));
	        System.out.println(l);
	    }
}
