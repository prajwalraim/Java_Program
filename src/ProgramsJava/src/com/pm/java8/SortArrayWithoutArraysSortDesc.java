package com.pm.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayWithoutArraysSortDesc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer[] arr = {5, 1, 4, 2, 8};
		

        Integer[] sortedDesc = Arrays.stream(arr)
                                     .sorted(Comparator.reverseOrder())
                                     .toArray(Integer[]::new);

        System.out.println(Arrays.toString(sortedDesc));
        
		Integer[] arr1 = {5, 1, 4, 2, 8};

        Arrays.sort(arr1); // ascending
        Collections.reverse(Arrays.asList(arr1)); // reverse
	}

}
