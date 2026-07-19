package com.program.practice;

import java.util.Scanner;
public class Digit_Sum 
{
    public static void main(String args[])
    {
        int m, n, sum = 0;
       
       
        m = 333;
        while(m>0)
        {
        	int temp = m%10;
        	sum = sum + temp;
        	m = m/10;
        }
           
        
        System.out.println("Sum of Digits:"+sum);
    }
}