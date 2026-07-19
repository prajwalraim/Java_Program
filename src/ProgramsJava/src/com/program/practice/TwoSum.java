package com.program.practice;

import java.util.HashMap;
import java.util.Arrays;

public class TwoSum {
	
    static int[] sum(int[] num , int target) {
        int l = num.length;
        HashMap<Integer,Integer> hm = new HashMap<>();  // value -> index

        for (int i = 0; i < l; i++) {
            int comp = target - num[i]; // find complement

            // if complement already seen, return result
            if (hm.containsKey(comp)) {
                return new int[]{hm.get(comp), i};
            }

            // otherwise store current number with index
            hm.put(num[i], i);
        }

        // if no solution (as per problem, there is always one solution)
        return new int[]{-1, -1};
    }

    public static void main(String[] args) {
        int[] nums = {2, 7, 11, 15};
        int target = 9;
        int[] a = sum(nums, target);

        System.out.println("Output: " + Arrays.toString(a));
    }
}
