package com.pm.java8;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class FindFrequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "abc abc ghj kjh ";
		
		Map<String,Long> mp = Arrays.stream(s.split(" ")).collect(Collectors.groupingBy(w->w,Collectors.counting()));
		
		
		Map<String, Integer> map = new HashMap<>();
		for (String w : s.split(" ")) {
		    map.put(w, map.getOrDefault(w, 0) + 1);
		}


	}

}
