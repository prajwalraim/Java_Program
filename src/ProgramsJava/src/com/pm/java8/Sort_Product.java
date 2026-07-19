package com.pm.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Sort_Product {
    public static void main(String[] args) {
    	
    	List<Product> ls = Arrays.asList(new Product("cam",1000.0),new Product("glass",678));
    	Collections.sort(ls,Comparator.comparing(Product::getPrice));
    	System.out.println("mine--"+ls);
    	
    	ls.sort((a,b)->Double.compare(a.getPrice(), b.getPrice()));
    	System.out.println(ls);
    	char[] c = {'a','b'};
    	String s = String.copyValueOf(c);
    	String v = String.valueOf(c);
    	System.out.println("copy--"+s);
    	System.out.println("String value of--"+v);
		/*
		 * copyValueOf was introduced to make code readable/explicit, emphasizing that a
		 * copy of the char[] is being turned into a String.
		 * 
		 * valueOf is more general — it works with many types (int, boolean, Object,
		 * char[], etc.).
		 */
    	
    	
    	//Method reference--preferred
    	//ls.sort(Comparator.comparingDouble(Product::getPrice));
    	Collections.sort(ls,Comparator.comparing(Product::getPrice));
    	System.out.println(ls);
    			
    			
    	
    }
    }

class Product {
    private final String name;
    private final double price;

    public Product(String name, double price) {
        this.name = name; this.price = price;
    }
    public String getName() { return name; }
    public double getPrice() { return price; }

    @Override public String toString() {
        return name + " - ₹" + price;
    }
}

