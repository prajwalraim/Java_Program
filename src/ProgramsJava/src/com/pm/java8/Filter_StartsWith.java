package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Filter_StartsWith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("pm","sm","gff");
		List<String> l =ls.stream().filter(s->s.startsWith("p")).collect(Collectors.toList());
		List<String> y = ls.stream().filter(d->d.startsWith("m", 1)).collect(Collectors.toList());
		List<String> z =  ls.stream().filter(ll-> ll.startsWith("f",2)).collect(Collectors.toList());
		System.out.println(z);
		

	}

}
