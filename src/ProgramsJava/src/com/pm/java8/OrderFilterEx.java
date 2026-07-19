package com.pm.java8;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class OrderFilterEx {
	/*From a 
	List<Order> , filter orders with status 
	lambda and 
	Predicate*/ 

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Order> ls = Arrays.asList(new Order(1,"delivered"),
				new Order(2,"pend")
				);
		Predicate<Order> pr = p-> "delivered".equalsIgnoreCase(p.getStatus());
		
		List<Order> lss  = ls.stream().filter(p-> "delivered".equalsIgnoreCase(p.getStatus())).collect(Collectors.toList());
		System.out.println(lss);
				
		
		

	}

}

class Order
{
	private int id;
	private String status;
	public Order(int id,String status)
	{
		this.id = id;
		this.status = status;
	}
	public int getId()
	{
		return id;
		
	}
	public String getStatus()
	{
		return status;
	}
	public String toString() {
		return id+"---"+status;
		
	}
}
