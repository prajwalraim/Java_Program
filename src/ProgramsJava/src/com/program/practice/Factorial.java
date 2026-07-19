package com.program.practice;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = fact(5);
System.out.println(a);
	}

	private static int fact(int i) {
		// TODO Auto-generated method stub
		if(i == 1)
		{
			return 1;
		}
		else
			return i * fact(i-1);
	}

}
