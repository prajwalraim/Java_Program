package com.pm.learn_new;

public class StringCompressor {

    public static String compressString(String str) {
        if (str == null || str.isEmpty()) return str;

        StringBuilder sb = new StringBuilder();
        int count = 1;  // Start with 1 for the first character

        for (int i = 1; i < str.length(); i++) {
        	System.out.println(str.charAt(i - 1));
            if (str.charAt(i) == str.charAt(i - 1)) {
                count++;  // Same as previous character
            } else {
                sb.append(str.charAt(i - 1)).append(count);  // Append previous char and count
                count = 1;  // Reset count
            }
        }

        // Append the last character and its count
        sb.append(str.charAt(str.length() - 1)).append(count);

        return sb.toString();
    }

    public static void main(String[] args) {
        String input = "aabbbc";
        String compressed = compressString(input);
        System.out.println(compressed);  // Output: a2b3
    }
}
