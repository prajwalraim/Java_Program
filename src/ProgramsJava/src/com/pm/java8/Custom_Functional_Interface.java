package com.pm.java8;


public class Custom_Functional_Interface 
{
	public static void main( String[] args)
	{
		Custom_Functional cf = (a,b)-> a+b;
		System.out.println(cf.sum(10, 20));
		Custom_Functional mul = (a,b)-> a*b;
		System.out.println(mul.sum(3, 7));

		
	}

}
 interface Custom_Functional{
	int sum(int a , int b);
	
}
