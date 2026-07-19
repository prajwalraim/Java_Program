package com.pm.java8;

import java.util.Arrays;
import java.util.List;

public class Lambda_With_ForEach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> l = Arrays.asList(1,2,3,4);
		l.stream().filter(ll->ll%2==0).forEach(System.out::println);

	}

}
