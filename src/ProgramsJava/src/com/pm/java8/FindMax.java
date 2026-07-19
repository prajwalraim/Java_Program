package com.pm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class FindMax {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Integer[] a = {1,2,3,4,5,7,6};
		List<Integer> aa = Arrays.asList(1,2,3,4,6,5);
		Integer max = aa.stream().max(Integer::compare).get();
		System.out.println(max);

	}

}
