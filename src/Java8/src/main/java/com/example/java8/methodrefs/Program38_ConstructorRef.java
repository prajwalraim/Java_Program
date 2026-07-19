package main.java.com.example.java8.methodrefs;

import java.util.function.Supplier;

class Box {
	String val;

	Box() {
		this.val = "box";
	}

	public String toString() {
		return val;
	}
}

public class Program38_ConstructorRef {
	public static void main(String[] args) {
		Supplier<Box> s = Box::new;
		System.out.println(s.get());
		
		Supplier<Double> randomValue = () -> Math.random();

        System.out.println("Random number 1: " + randomValue.get());
        System.out.println("Random number 2: " + randomValue.get());
	}
}/*
	 * Supplier<T>
	 * 
	 * Does not take any input
	 * 
	 * Returns a value of type T
	 */