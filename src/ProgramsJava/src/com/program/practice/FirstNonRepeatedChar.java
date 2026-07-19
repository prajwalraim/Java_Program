package com.program.practice;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class FirstNonRepeatedChar {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String input = sc.nextLine();

        char result = findFirstNonRepeatedChar(input);

        if (result != 0) {
            System.out.println("✅ First non-repeated character: " + result);
        } else {
            System.out.println("❌ No non-repeated character found.");
        }

        sc.close();
    }

    public static char findFirstNonRepeatedChar(String s) {
        Map<Character,Integer> mp = new LinkedHashMap<>();
        for(char c : s.toCharArray())
        {
        	
        		mp.put(c, mp.getOrDefault(c,0)+1);      	
        }
       mp.forEach((k,v)->System.out.println(k+"uuuu"+v));
      return mp.entrySet().stream().filter(mppp->mppp.getValue()==1).map(mpp->mpp.getKey()).findFirst().orElse('0');
  
    }
}
