package com.program.practice;

import java.util.HashSet;
import java.util.Set;
import java.util.Arrays;

public class CommonElementFinder {
	public static Integer[] findCommonElements(Integer[] arr1, Integer[] arr2) {
		Set<Integer> set1 = new HashSet<>(Arrays.asList(arr1));
		Set<Integer> commonElements = new HashSet<>();
		for (Integer num : arr2) {
			if (set1.contains(num)) {
				commonElements.add(num);
			}
		}
		return commonElements.toArray(new Integer[0]);
	}

	public static void main(String[] args) {
		Integer[] array1 = { 1, 2, 3, 4, 5 };
		Integer[] array2 = { 3, 4, 5, 6, 7 };
		Integer[] common = findCommonElements(array1, array2);
		System.out.println("Common elements: " + Arrays.toString(common));
	}
}
/*
 * Why new Integer[0]?
 * 
 * We pass new Integer[0] just to tell Java what type of array we want
 * (Integer[] here).
 * 
 * Size 0 doesn’t matter — Java will allocate the correct size automatically.
 */

/*
 * Return type is indeed Integer[], not int[].
 * 
 * If you want to return int[] instead of Integer[], you’d need to unbox:
 * 
 * return commonElements.stream().mapToInt(Integer::intValue).toArray();
 */