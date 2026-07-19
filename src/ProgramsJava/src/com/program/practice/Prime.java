package com.program.practice;

import java.util.Scanner;

public class Prime{

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input number
        System.out.print("Enter a number: ");
        int num = sc.nextInt();

        // Check and print result
        if (isPrime(num)) {
            System.out.println(num + " is a PRIME number.");
        } else {
            System.out.println(num + " is NOT a prime number.");
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
       if(n ==2)
       {
    	   return true;
       }
       for(int i = 2; i <= Math.sqrt(n); i++)
       {
    	   if(n%i == 0)
    	   {
    		   return false;
    	   }
       }
       return true;
    }
}
