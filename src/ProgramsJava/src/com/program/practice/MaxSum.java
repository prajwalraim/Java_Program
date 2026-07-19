package com.program.practice;


public class MaxSum {

    public static void main(String[] args) {
        
        int[] nums = {-2, 1, -3, 4, -1, 2, 1, -5, 4};

        int currentSum = nums[0];   // start with first element
        int maxSum = nums[0];       // max also starts with first element

        for (int i = 1; i < nums.length; i++) {
            // either take current element alone or extend previous subarray
            currentSum = Math.max(nums[i], nums[i] + currentSum);
            // update global maximum
            maxSum = Math.max(maxSum, currentSum);
        }

        System.out.println("Maximum Subarray Sum = " + maxSum);
    }
}

