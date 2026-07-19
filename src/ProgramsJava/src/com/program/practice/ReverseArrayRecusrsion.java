package com.program.practice;

public class ReverseArrayRecusrsion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,5,9,5};
		int index = arr.length-1;
		
		rev(arr,index);

	}

	private static void rev(int[] arr, int index) {
		// TODO Auto-generated method stub
		if(index<0)
		{
			return ;
		}
		System.out.println(arr[index]+" ");
		rev(arr,index-1);
		
	}

}
