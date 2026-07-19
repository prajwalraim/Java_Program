package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupByLength {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("am","pm","gf");
		Map<Integer,List<String>> mp = ls.stream().collect(Collectors.groupingBy(s->s.length()));
		mp.forEach((a,b)->System.out.println(a+"------"+b));
		

	}

}
