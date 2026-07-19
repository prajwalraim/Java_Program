package com.pm.java8;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Collections_Sort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        List<String> l = Arrays.asList("pm","gd","fd");
        Collections.sort(l, (a,b)->a.compareTo(b));
        
        
        Collections.sort(l);
        Collections.sort(l,Comparator.reverseOrder());
        
        List<String> sortedDesc = l.stream().sorted(Collections.reverseOrder()).toList();
        
        System.out.println(sortedDesc);
        
	}

}
