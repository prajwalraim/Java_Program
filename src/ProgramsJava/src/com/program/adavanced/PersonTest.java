package com.program.adavanced;

import com.program.adavanced.LinkedListImpl.Node;

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

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedListImpl ls = new LinkedListImpl();
		ls.insert(10);
		ls.insert(20);
		ls.insert(30);
		ls.insert(40);
		ls.insert(50);


		System.out.println(ls);



	}
	Node head = null;

	private void insert(int data) {
		// TODO Auto-generated method stub//--40
		Node newNode = new Node(data);//---30
		if(head == null)
		{
			head = newNode;//10
		}
		else
		{
			Node temp = head;//10
			while(temp.next != null)
			{
				temp = temp.next;//--20
			}
			temp.next = newNode;//30
		}
		
		
	}

}
