package com.pm.java8;

import java.util.Arrays;

public class SortArrayWithoutArraysSort {
	public static void main(String[] args) {
	int[] arr = {5, 1, 4, 2, 8};

    // Sort using streams
    int[] sortedArr = Arrays.stream(arr)
                            .sorted()
                            .toArray();

   System.out.println(Arrays.toString(sortedArr));
}
}