package com.program.practice;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class SimpleLongestUnique {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String text = sc.nextLine();

        String result = findLongest(text);
        System.out.println("Longest unique substring: " + result);
        sc.close();
    }

    public static String findLongest(String str) {
        int i = 0;  // start of window
        int j = 0;  // end of window
        int max = 0;  // max length
        int start = 0; // start index of longest substring

        Set<Character> set = new HashSet<>();

        while (j < str.length()) {
            char ch = str.charAt(j);

            if (!set.contains(ch)) {
                set.add(ch);
                if (j - i + 1 > max) {
                    max = j - i + 1;
                    start = i;
                }
                j++; // move forward
            } else {
                set.remove(str.charAt(i));
                i++; // shrink window
            }
        }

        return str.substring(start, start + max);
        
        //bcacag---
    }
}
