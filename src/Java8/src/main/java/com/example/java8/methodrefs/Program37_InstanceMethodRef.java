package com.example.java8.methodrefs;

public class Program37_InstanceMethodRef {
	public void hello() {
		System.out.println("instance");
	}

	public static void main(String[] args) {
		Program37_InstanceMethodRef p = new Program37_InstanceMethodRef();
		Runnable r = p::hello;
		r.run();
	}
}
