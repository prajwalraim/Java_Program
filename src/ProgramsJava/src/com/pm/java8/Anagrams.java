package com.pm.java8;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Anagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s1 = "tea";
		IntStream c = s1.chars();
		String s2 = "eat";
		boolean a = Arrays.equals(s1.chars().sorted().toArray(), s2.chars().sorted().toArray());
		System.out.println(a);

	}

}
