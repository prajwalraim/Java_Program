package com.program.adavanced;

public class SingleTon {
	//private static instance of itself
	//private constructor to avoid instatiation from outside class
	//public static method to return instance

	private static SingleTon st;
	
	private SingleTon()
	{
		
	}
	
	public static SingleTon singleton()
	{
		if(st == null)
		{
			st = new SingleTon();
		}
		return st;
	}
}
