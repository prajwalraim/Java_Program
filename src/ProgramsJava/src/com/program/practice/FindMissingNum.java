package com.program.practice;

import java.util.Arrays;

public class FindMissingNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] a = {1,2,3,5};
		int sum = 5*3;;//ie n(n+1)/2
		int sm = Arrays.stream(a).reduce(0,(aa,b)-> aa+b);
		System.out.println(sm);
		int res = sum-sm;
		System.out.println(res);
	}

}
