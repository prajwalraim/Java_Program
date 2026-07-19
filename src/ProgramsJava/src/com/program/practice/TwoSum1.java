package com.program.practice;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.Arrays;

public class TwoSum1 {
	
	static int[] sum(int[] num , int target) throws IllegalAccessException
	{
		int l = num.length;
		HashMap<Integer,Integer> hm = new HashMap<>();
		Set hs = Arrays.stream(num).boxed().collect(Collectors.toSet());
		HashSet<Integer> hss = new HashSet<>(hs);
		HashSet<Integer> hsss = new HashSet<>(hs);

		Iterator ii = hs.iterator();
		while(ii.hasNext())
		{
			Integer dd = (Integer) ii.next();
			int com = target - dd;
			if(hsss.contains(com))
			{
				return new int[] {dd,com};
			}
			//hsss.add(dd);
			
		}
		throw new IllegalAccessException("invalid solutuion");
		
		
		
	}
   

    public static void main(String[] args) throws IllegalAccessException {
        int[] nums = {2, 7, 11, 15};
        int target = 13;
        int[] a = sum(nums,target);
        Arrays.stream(a).boxed().collect(Collectors.toList()).forEach(aa->System.out.println(aa));

        
    }
}
