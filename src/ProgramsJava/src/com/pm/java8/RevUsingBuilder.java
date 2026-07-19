package com.pm.java8;

public class RevUsingBuilder {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "rev";
		String rev = new StringBuilder(str).reverse().toString();
		System.out.println(rev);

	}

}
