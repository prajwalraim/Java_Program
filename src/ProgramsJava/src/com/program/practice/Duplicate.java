package com.program.practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Duplicate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a[] = {1,2,3,4,5,4};
		List<Integer> s = Arrays.asList(1,2,3,4,5,1);
		Set ss = new HashSet();;
		List ff = s.stream().filter(sss-> !ss.add(sss)).collect(Collectors.toList());
		/*
		 * Set aa = new HashSet(); Set dup = new HashSet();
		 * 
		 * for(int b = 0 ; b < a.length; b++) { if(aa.add(a[b])) {
		 * 
		 * } else { dup.add(a[b]);
		 * 
		 * } } System.out.println("dup"+dup);
		 */
		List f = (List) s.stream().filter(d-> !ss.add(d)).collect(Collectors.toList());
		System.out.println(ff);
		
	}

}
