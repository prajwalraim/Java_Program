package com.program.practice;

import java.util.Scanner;
import java.util.Stack;

public class StackBalance {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("enter ");
		String input = sc.nextLine();
			System.out.println(findBalanced(input)? "yes balanced":"not balanced");

	}
	
	private static boolean findBalanced(String input)
	{
		
		
		Stack<Character> st = new Stack<>();
		for(char c : input.toCharArray())
		{
			if(c=='(' || c == '{' || c == '[')			
				st.push(c);	
			
			else
			{
				if(st.isEmpty())
					return false;
				
					char k = st.pop();
					if( c == ')' && k != '(' || c == '}' && k != '{' || c == '[' && k != ']')
						return false;
				}
			}
		
		return st.isEmpty();
		
	}

}
