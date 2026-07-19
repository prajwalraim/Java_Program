package com.pm.java8;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupAnagrams {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> words = Arrays.asList("eat", "tea", "tan", "ate", "nat", "bat");

     /*
        Map<String, List<String>> groupeds =  words.stream()
        .collect(Collectors.groupingBy(wordss -> {
            char[] charss = wordss.toCharArray();
            Arrays.sort(charss); // sort characters inside word
            return new String(charss);
        }));*/
        
        Map<String,List<String>>  map = words.stream().collect(Collectors.groupingBy(w->
        {
        	char[] cchar = w.toCharArray();
        	Arrays.sort(cchar);
        	return new String(cchar);
        }));
            
            
        System.out.println();
        map.forEach((k,v)-> System.out.println(k+"---------"+v.size()));
    }
}
