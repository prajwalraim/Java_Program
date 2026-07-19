package com.example.java8.methodrefs;

import java.util.*;

public class Program39_MethodRefSort {
	public static void main(String[] args) {
		List<String> l = Arrays.asList("b", "a", "c");
		Collections.sort(l, String::compareTo);
		l.forEach(System.out::println);
	}
}
