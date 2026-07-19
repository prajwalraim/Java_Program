package com.program.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Frequency {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "prajwal";
		char[] c = s.toCharArray();
		Map<Character , Integer> map = new HashMap<>();
		for(int i = 0 ; i < c.length; i++)
		{
			if(map.containsKey(c[i]))
					{
				      Integer count = map.get(c[i])+1;
				      map.put(c[i], count);
					}
			else
			{
				map.put(c[i], 1);
			}
		}
		for(Entry<Character, Integer>  e : map.entrySet())
		{
			System.out.println(e.getKey()+"key-----------value----"+e.getValue());
		}

	}

}
