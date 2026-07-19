package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/*Implement a 
Stream pipeline with 
squared values of odd numbers.
 ma*/

public class OddFindSqaure {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1,2,3,4,5);
		List<Integer> l = ls.stream().filter(s->s%2!=0).map(n->n*n).collect(Collectors.toList());
		System.out.println(l);

	}

}
