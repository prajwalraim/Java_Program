package com.pm.learn_new;



import java.util.Arrays;

public class MoveZeroes {
    public static void moveZeroes(int[] nums) {
    	 int inttt = 0;

        for(int i = 0; i <= nums.length-1; i++)
        {
        	if(nums[i] != 0)
        	{
        		nums[inttt] = nums[i];
        		//System.out.println(nums[i]);
        		inttt++;
        	}
        }
        while(inttt< nums.length)
        {
        	nums[inttt] = 0;
        	inttt++;
        }
    }

    // Example usage
    public static void main(String[] args) {
        int[] nums = {0, 1, 0, 3, 12};
        moveZeroes(nums);
        System.out.println(Arrays.toString(nums));  // Output: [1, 3, 12, 0, 0]
        System.out.println(nums[0]);
    }
}

