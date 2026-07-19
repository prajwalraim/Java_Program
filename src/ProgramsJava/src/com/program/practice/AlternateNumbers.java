package com.program.practice;

import java.util.ArrayList;
import java.util.List;

public class AlternateNumbers {
	    public static void main(String[] args) {

	        int[] arr = {9,9,9,11,12,46,56,56,77,78,99,99,102};

	        // Step 1: Remove duplicates (array already sorted)
	        List<Integer> unique = new ArrayList<>();
	        unique.add(arr[0]); 
	        
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] != arr[i - 1]) {
	                unique.add(arr[i]);
	            }
	        }

	        // Step 2: Print alternate numbers
	        System.out.println("Output:");
	        for (int i = 0; i < unique.size(); i += 2) {
	            System.out.print(unique.get(i) + " ");
	        }
	    }
	}
