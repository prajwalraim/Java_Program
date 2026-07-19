package com.program.practice;

public class FiboWithLimit {

	

	    public static void main(String[] args) {
	        int limit = 50; // print Fibonacci numbers till this value
	        
	        printFibonacci(0,1,limit);
	    }

	    // recursive function to print Fibonacci numbers up to 'limit'
	    public static void printFibonacci(int a, int b, int limit) {
	    	if(a>limit)
	    	{
	    		return;
	    	}
	    	System.out.println(a);
	    	 printFibonacci(b,a+b,limit);
	        
	    }
	}
