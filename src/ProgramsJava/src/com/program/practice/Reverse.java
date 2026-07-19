package com.program.practice;

public class Reverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "abc";
		int ss = a.length();
		String aa = reverse(a);
		System.out.println(aa);

	}

	private static String reverse(String a) {
		// TODO Auto-generated method stub
		if(a.isEmpty())
		{
			return a;
		}
		return reverse(a.substring(1))+a.charAt(0);
		
	}
	

}




/*once base empty reached c return from stack frame to prvios call  so cb-->next cba-->next main method get called.
"' + c
 * c  +  b
 * bc +  a
 * reverse with abc
 * main caaled inn  stack frame
 */
 
