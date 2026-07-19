package com.pm.java8;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class PrintWithMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String,Integer> mp = new HashMap<>();
		mp.put("pm", 1);
		mp.put("sd", 2);
		mp.put("ds", 3);
		
		mp.forEach((m,n)->System.out.println(m+"-----"+n));
		Map<String,Integer> lmap = new LinkedHashMap<>();
		lmap.putAll(mp);
		lmap.forEach((k,v)->System.out.println(k+"------"+v));
		mp.forEach((m,n)->System.out.println(m+"-----"+n));

		

	}

}
