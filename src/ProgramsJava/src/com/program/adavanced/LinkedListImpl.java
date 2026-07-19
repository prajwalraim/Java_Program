package com.program.adavanced;

public class LinkedListImpl {
	
	static class Node
	{
		int data;
		Node next;
		
		 Node(int data)
		{
			this.data = data;
			this.next = null;
		}
		 
	}
	Node head = null;
	public void insert(int data)
	{
		Node newNode = new Node(data);
		if(head == null)
		{
			head = newNode;
		}
		else
		{ 
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newNode;
		}
		
	}
	
	public void display()
	{
		Node temp = head;
		while(temp != null)
		{
			System.out.println(temp.data);
			temp = temp.next;
		}
	}
	public void delete(int value)
	{
		
		if(head == null)
		{
			System.out.println("nothing to delete");
			return;
		}
		if(head.data == value)
		{
			System.out.println();
			head = head.next ;
			return;
		}
		Node temp = head;
		while(temp.next != null && temp.next.data != value)
		{
			temp = temp.next;
		}
		if(temp.next == null)
		{
			System.out.println("no match found");
			return;
		}
		temp.next = temp.next.next; 
	}
	
	public static void main(String args[])
	{
		System.out.println("fist line ");
		LinkedListImpl ls = new LinkedListImpl();
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		ls.insert(30);
		System.out.println(ls.toString());
		ls.display();
		ls.delete(20);
		ls.display();
	}
}
