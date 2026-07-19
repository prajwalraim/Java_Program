package com.pm.java8;

public class WithdrawAmount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int amount = 3600;
		
		Integer[] i = {2000,500,200,100};
		Integer[] notes = new Integer[i.length];
		
		
		for(int j = 0 ; j < i.length; j++)
		{
			notes[j] = amount/i[j];
			
			amount = amount%i[j];
			System.out.println(amount);
		}
		for(int j = 0 ; j < i.length; j++)
		{
			System.out.println(i[j]+"hhhhh"+notes[j]);
		}
	}

}
