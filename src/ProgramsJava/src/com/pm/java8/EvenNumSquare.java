package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class EvenNumSquare {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> ls = Arrays.asList(1,2,3,4,5,6);
		
		List<Integer> lss =	ls.stream().filter(s->s%2==0).map(n->n*n).sorted().collect(Collectors.toList());
		lss.forEach(s->System.out.println(s));
		
		//ls.stream().filter(null)
		

	}

}
