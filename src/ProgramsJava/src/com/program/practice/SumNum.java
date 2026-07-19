package com.program.practice;

import java.util.Arrays;

public class SumNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = Arrays.asList(1,2,3).stream().reduce(0, (a,b)->a+b);
		System.out.println("num---"+num);

	}

}
