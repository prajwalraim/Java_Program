package com.pm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class LongestStringFromList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> names = Arrays.asList("prajwal", "kamath", "java", "interview");

		String longest = names.stream()
		    .max(Comparator.comparingInt(String::length))
		    .orElse(null);
		
		String l = names.stream().max(Comparator.comparing(String:: length)).orElse(null);

		System.out.println(longest); // interview

	}

}
