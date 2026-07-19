package com.pm.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String sentence = "Java 8 is powerful";

		String reversed = Arrays.stream(sentence.split(" "))
		    .map(str -> new StringBuilder(str).reverse().toString())
		    .collect(Collectors.joining(" "));

		System.out.println(reversed); // avaJ 8 si lufrewop

		

	}

}
