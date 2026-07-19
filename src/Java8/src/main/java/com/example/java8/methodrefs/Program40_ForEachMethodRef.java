package main.java.com.example.java8.methodrefs;

import java.util.*;

public class Program40_ForEachMethodRef {
	public static void main(String[] args) {
		Arrays.asList("x", "y", "z").forEach(System.out::println);
	}
}
