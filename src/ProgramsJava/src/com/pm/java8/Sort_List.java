package com.pm.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Sort_List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("ss","lambda","node js");
		
		 ls.sort((s1,s2)-> s1.compareTo(s2)); ls.forEach(System.out::println);
		 
		ls.stream().sorted(Comparator.comparing(String::valueOf)).forEach(System.out::println);
		

	}

}
