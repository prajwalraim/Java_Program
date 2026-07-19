package com.pm.java8;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class CompareDigits {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String a = "1234561";
		String b = "4246569";
		
		Long s = IntStream.range(0, a.length()).filter(i -> a.charAt(i) == b.charAt(i)).count();
		
		
		
		String d = IntStream.range(0, a.length()).filter(c-> a.charAt(c)== b.charAt(c))
				.mapToObj(a::charAt)
				.map(String::valueOf)
				.collect(Collectors.joining());
		
		List<Character> c = IntStream.range(0, a.length()).filter(l -> a.charAt(l)==b.charAt(l)).mapToObj(a::charAt).collect(Collectors.toList());
		
		
		
		System.out.println("count same--"+d);
		
		System.out.println("char same--"+c);


	}

}
