package com.example.java8.methodrefs;

public class Program36_StaticMethodRef {
	public static void say() {
		System.out.println("static");
	}

	public static void main(String[] args) {
		Runnable r = Program36_StaticMethodRef::say;
		r.run();
	}
}
