package com.pm.java8;

import java.util.Arrays;
import java.util.List;

public class Iterate_Using_Lambda {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> ls = Arrays.asList("ab","bc","vd");
		ls.forEach(f->System.out.println(f));
		

	}

}
