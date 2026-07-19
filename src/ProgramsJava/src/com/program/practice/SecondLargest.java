package com.program.practice;

public class SecondLargest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		 int[] numbers = {12, 35, 1, 10, 34, 1};
		 System.out.println("Second largest number: " + 
		findSecondLargest(numbers));

	}
	
	 public static int findSecondLargest(int[] arr) {
		 int largest = Integer.MIN_VALUE;
		 System.out.println(largest);
		 int secondLargest = Integer.MIN_VALUE;
		 for (int num : arr) {
		 if (num > largest) {
		 secondLargest = largest;
		 largest = num;
		 } else if (num > secondLargest && num != largest) {
		 secondLargest = num;
		 }
		 }
		 return secondLargest;
		 }

}
