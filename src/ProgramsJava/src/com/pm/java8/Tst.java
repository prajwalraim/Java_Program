package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Tst {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");
Map<String,List<String>>  k = words.stream().collect(Collectors.groupingBy(r->
{
	char[] c = r.toCharArray();
	Arrays.sort(c);
	return new String(c);

}));
	

	
	}

}



