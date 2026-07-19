package com.program.practice;

import java.util.Scanner;

public class SimplePalindrome {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String s = sc.nextLine();

        String str = s.toLowerCase();  // convert to lowercase
        int a = 0;
        int b = str.length() - 1;

        boolean isPalindrome = true;

        while (a < b) {
            if (str.charAt(a) != str.charAt(b)) {
                isPalindrome = false;
                break;
            }
            a++;
            b--;
        }

        if (isPalindrome) {
            System.out.println("✅ Palindrome");
        } else {
            System.out.println("❌ Not a palindrome");
        }

        sc.close();
    }
}
