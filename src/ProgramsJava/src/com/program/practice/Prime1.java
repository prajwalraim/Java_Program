package com.program.practice;


import java.util.Scanner;

public class Prime1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Input: how many prime numbers to print
        System.out.print("Enter how many prime numbers to print: ");
        int n = sc.nextInt();

        int count = 0; // number of primes found
        int num = 2;   // start checking from 2

        System.out.println("First " + n + " prime numbers:");

        while (count < n) {
            if (isPrime(num)) {
                System.out.print(num + " ");
                count++;
            }
            num++;
        }

        sc.close();
    }

    // Method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0)
                return false;
        }
        return true;
    }
}
