package com.pm.java8;

import java.util.function.BiPredicate;
import java.util.function.Predicate;

public class Pedicate_Bi {
//Definition: A functional interface that takes two input arguments and returns a boolean.
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BiPredicate<String,String> bp = (a,b)-> a.equalsIgnoreCase(b);
		
		if(bp.test("baba@gmasil.com", "baba@gmasil.com"))
		{
			System.out.println("equal");
		}
		else 
		{
			System.out.println("not equal");
		}
		
		
		
		Predicate<String> p = email -> email.toLowerCase().contains("gmail.com");

        String email1 = "baba@gmail.com";
        String email2 = "test@yahoo.com";

        if (p.test(email1)) {
            System.out.println(email1 + " is a Gmail address");
        } else {
            System.out.println(email1 + " is NOT a Gmail address");
        }

        if (p.test(email2)) {
            System.out.println(email2 + " is a Gmail address");
        } else {
            System.out.println(email2 + " is NOT a Gmail address");
        }

	}

}
