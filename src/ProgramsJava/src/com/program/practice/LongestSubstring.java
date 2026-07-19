package com.program.practice;


import java.util.*;

public class LongestSubstring {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = "abccad";
        System.out.println(s.charAt(0));
        
        //abc added to set----right is 2,left is 0
        //so max len 3, 
        //
        //when check abca..a conatins---so remove a from left
        //so left =1
        //a again added ,so bca
        //d addd to set
        //right is 3, so max length is 4
        
        Set<Character> set = new HashSet<>();
        int left = 0, maxLen = 0;
        
        for (int right = 0; right < s.length(); right++) {
            while (set.contains(s.charAt(right))) {
                set.remove(s.charAt(left));
                left++;
            }
            set.add(s.charAt(right));
            maxLen = Math.max(maxLen, right - left + 1);
        }
        
        System.out.println(maxLen);
    }
}

