package com.program.practice;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class FindAnyParallel {

	public FindAnyParallel() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<Integer> any = Arrays.asList(10, 20, 30, 40).parallelStream().findAny();

		any.ifPresent(System.out::println);
// Could print 10, 20, 30, or 40 (not predictable)
		
		/*
		 * Sequential stream → preserves order.
		 * 
		 * Parallel stream → order is not guaranteed because multiple threads work
		 * simultaneously.
		 */
		List<String> list = Arrays.asList("A", "B", "C", "D", "E");

		System.out.println("Sequential Stream:");
		list.stream().forEach(System.out::println);

		System.out.println("\nParallel Stream:");
		list.parallelStream().forEach(System.out::println);
	}

}
