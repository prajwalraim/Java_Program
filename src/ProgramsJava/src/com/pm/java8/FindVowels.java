package com.pm.java8;

public class FindVowels {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "deaiou";
		String v = "aeiou";
		int count = 0;
		for (char c : s.toCharArray())
		{
			if(v.indexOf(c) >= 0)
			{
				count++;
				
			}
		}
		System.out.println("count--"+count);

	}

}
