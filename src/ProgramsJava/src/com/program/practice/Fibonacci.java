package com.program.practice;


public class Fibonacci {

    public static void main(String[] args) {
        int n = 5;
        int result = fibonacci(n);
        System.out.println("The " + n + "th Fibonacci number is: " + result);
    }

    public static int fibonacci(int n) {
		/*
		 * if (n == 0) return 0; if (n == 1) return 1;
		 * 
		 * int a = 0, b = 1, fib = 0;
		 * 
		 * for (int i = 2; i <= n; i++) { fib = a + b; a = b; b = fib; }
		 * 
		 * return fib;
		 */
    	
    	if(n == 1 || n == 2)
    	{
    		return n;
    	}
    	return fibonacci(n-1)+fibonacci(n-2);
    }
}
//0 1 1 2 3 5 8