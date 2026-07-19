package com.program.practice;

public class Power {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = power(2,5);
		System.out.println(a);

	}

	private static int power(int i, int j) {
		// TODO Auto-generated method stub
		if (j == 0)
	        return 1;
	    if (j % 2 == 0)
	        return power(i * i, j / 2); // Missing return fixed
	    return i * power(i, j - 1);
	
//	    2,5
//	    
//	    2* pow(2,4);2*16
//	     rteurn pow(4,2)=16
//	     return pow(16,1)=16
//	    		 return 16* pow(16,0)
//	    				 =16*1
	    				 
	    				 
	    				 
	    				 
		/*
		 * 
		 */
		/*
		 * 2,5 passed
		 * 5 is odd
		 * 2* power(2,4)
		 * 4%2 is 0 so
		 * power(4 , 2);
		 * again even exponent
		 * so  rewrite as power(16,1)
		 * now add
		 * so return 16 * power(16,0)
		 * here j ==0 matched---so return 1
		 * now returning from 16,1 =16
		 * 4,2 = 16
		 * 2,4 = 16
		 * 2,5 = 32
		 * so result is 32
		 * 
		 */
		
		
	}

}
