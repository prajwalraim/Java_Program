package com.pm.tests;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class TestStream {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
    String str = "5abc";

    boolean startsWithDigit = !str.isEmpty() && Character.isDigit(str.charAt(0));

   System.out.println(startsWithDigit); // true
   
   List<String> listOfStrings = Arrays.asList("One", "2wo","2wo", "3hree", "Four", "5ive", "Six");
   
   List<String> ls = listOfStrings.stream().filter(s-> Character.isDigit(s.charAt(0))).collect(Collectors.toList());
   System.out.println(ls);
   

	}

}
