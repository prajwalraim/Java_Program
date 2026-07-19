package com.pm.java8;
import java.util.Arrays;
import java.util.List;

public class SecondLarge {
	

	

	
	    public static void main(String[] args) {
	        int[] numbers = {10, 20, 5, 40, 30};

	        int secondLargest = Arrays.stream(numbers)
	                                  .distinct()
	                                  .boxed()
	                                  .sorted((a, b) -> b - a)
	                                  .skip(1)
	                                  .findFirst()
	                                  .orElseThrow(() -> new RuntimeException("No second largest found"));

	        System.out.println("Second largest number is: " + secondLargest);
	        
	        
	       int ll =  Arrays.stream(numbers).distinct().boxed().sorted((a,b)-> b-a).limit(1).findFirst().orElseThrow(()-> new RuntimeException("no second"));
	        
	       System.out.println("llll--"+ll); 
	        
	    }
	}

