package com.program.practice;

public class SimplePermutation {

    public static void main(String[] args) {
        String input = "ABC";
        showPermutations("", input);
    }

    public static void showPermutations(String fixedPart, String leftOver) {
        // If nothing left to choose, print the result
        if (leftOver.length() == 0) {
            System.out.println(fixedPart);
            return;
        }

        // Try each letter in the remaining string
        for (int i = 0; i < leftOver.length(); i++) {
            char ch = leftOver.charAt(i);
            String rest = leftOver.substring(0, i) + leftOver.substring(i + 1);
            showPermutations(fixedPart + ch, rest);
        }
    }
}
