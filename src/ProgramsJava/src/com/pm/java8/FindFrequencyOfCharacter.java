package com.pm.java8;

import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class FindFrequencyOfCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String word = "bananas";

		/*
		 * Map<Character, Long> freq = word.chars() .mapToObj(c -> (char)c)
		 * .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 */
		Map<String, Long> freqq = Arrays.stream(word.split(""))
				.collect(Collectors.groupingBy(w->w,Collectors.counting()));
		

		System.out.println(freq); // {a=3, b=1, n=2, s=1}
		System.out.println(freqq);


	}

}
