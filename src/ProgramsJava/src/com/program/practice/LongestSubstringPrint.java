package com.program.practice;import java.util.*;

public class LongestSubstringPrint {

	

	    public static void main(String[] args) {
	        String s = "abcad";
	        
	        int left = 0;
	        int right = 0;
	        int l = s.length();
	        int maxLen = 0;
	        
	        Set<Character> set = new HashSet<>();
	        
	        for(right =0; right < l ; right++)
	        {
	        	while(set.contains(s.charAt(right)))
	        			{
	        		           set.remove(s.charAt(left));
	        		           left++;
	        		           
	        			}
	        	set.add(s.charAt(right));
	        	maxLen = Math.max(maxLen, right-left+1);
	        	
	        	
	        	
	        }
	        System.out.println(s.substring(left,maxLen+left));
	        System.out.println("hhhh"+maxLen);
	        
	    
	    
	    }
	}
