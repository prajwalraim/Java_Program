package com.program.practice;

public class SimplePermutation2 {

	
		
		
		    public static void main(String[] args) {
		        String str = "ABC";
		        permute(str.toCharArray(), 0);
		    }

		    public static void permute(char[] arr, int index) {
		        if (index == arr.length - 1) {
		            System.out.println(String.valueOf(arr));
		            return;
		        }

		        for (int i = index; i < arr.length; i++) {
		            char temp = arr[index];
		            arr[index] = arr[i];
		            arr[i] = temp;

		            permute(arr, index + 1);

		            // backtrack
		            temp = arr[index];
		            arr[index] = arr[i];
		            arr[i] = temp;
		        }
		    }
		}


