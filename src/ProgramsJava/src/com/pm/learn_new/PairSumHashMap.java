package com.pm.learn_new;

import java.util.*;

public class PairSumHashMap {
    public static List<List<Integer>> findPairs(int[] nums, int target) {
        Set<Integer> seen = new HashSet<>();
        Set<List<Integer>> result = new HashSet<>();

        for (int num : nums) {
            int complement = target - num;
            if (seen.contains(complement)) {
                List<Integer> pair = Arrays.asList(Math.min(num, complement), Math.max(num, complement));
                result.add(pair);  // Set ensures uniqueness
            }
            seen.add(num);
        }

        return new ArrayList<>(result);
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {1, 3, 2, 2, 4, 3, 5};
        int target = 6;
        System.out.println(findPairs(nums, target));
        // Output: [[2, 4], [1, 5], [3, 3]]
    }
}
