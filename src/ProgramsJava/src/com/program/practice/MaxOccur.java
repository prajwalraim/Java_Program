package com.program.practice;

import java.util.HashMap;
import java.util.Map;

public class MaxOccur {

    public static void main(String[] args) {
        String input = "hello world";

        char maxChar = getMaxOccurringChar(input);
        System.out.println("Max occurring character: " + maxChar);
    }

    public static char getMaxOccurringChar(String str) {
        Map<Character, Integer> map = new HashMap<>();

        // Count frequency of each character
        for (char ch : str.toCharArray()) {
            if (ch != ' ') { // skip spaces if needed
                map.put(ch, map.getOrDefault(ch, 0) + 1);
            }
        }

        // Find max entry
        char maxChar = ' ';
        int maxCount = 0;

        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            if (entry.getValue() > maxCount) {
                maxChar = entry.getKey();
                maxCount = entry.getValue();
            }
        }

        return maxChar;
    }
}
