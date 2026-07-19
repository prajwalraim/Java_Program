package com.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class JoiningString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> l = Arrays.asList("s","a","n");
		String s = l.stream().collect(Collectors.joining(","));
		String ss = l.stream().collect(Collectors.joining(""));
		System.out.println(ss);
		System.out.println(s);


	}

}
