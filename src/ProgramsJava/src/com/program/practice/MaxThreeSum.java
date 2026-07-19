package com.program.practice;

public class MaxThreeSum {
    public static void main(String[] args) {
        int[] arr = {5, 1, 9, 3, 7, 2, 6};
        int maxSum = Integer.MIN_VALUE;
        int startIndex = 0;

        // Loop through array to find max sum of 3 consecutive elements
        for (int i = 0; i < arr.length - 2; i++) {
            int currentSum = arr[i] + arr[i + 1] + arr[i + 2];
            if (currentSum > maxSum) {
                maxSum = currentSum;
                startIndex = i;
            }
        }

        // Output the result
        System.out.println("Maximum sum of 3 consecutive numbers: " + maxSum);
        System.out.println("Subarray: [" + arr[startIndex] + ", " + arr[startIndex + 1] + ", " + arr[startIndex + 2] + "]");
    }
}
