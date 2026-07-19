package com.program.practice;

public class PrintOneToNRecusrion {

	static void printNos(int n)
    {
       if(n>0)
       {
    	   printNos(n-1);
    	   System.out.println(n);
       }
       
    }

    // Driver Code
    public static void main(String[] args)
    {
        int n = 10;
        printNos(n);
    }

}
