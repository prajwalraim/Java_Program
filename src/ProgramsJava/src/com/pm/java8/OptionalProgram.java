package com.pm.java8;

import java.util.Optional;

public class OptionalProgram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Optional<String> names = Optional.ofNullable("prajwal");
		 names.ifPresent(s->System.out.println(s));
		 names.ifPresentOrElse(s->System.out.println(s),()->System.out.println("empty"));
		 
		 Optional<String> c = Optional.of(null);
		c.ifPresent(s->System.out.println("jjjjjd"+s));
		 
		 
		 
		 Optional<String> name = Optional.ofNullable("Prajwal");

		// ifPresent
		name.ifPresent(n -> System.out.println("Hello " + n));

		// map
		int length = name.map(String::length).orElse(0);
		System.out.println("Length: " + length);

		// filter
		name.filter(n -> n.startsWith("P"))
		    .ifPresent(System.out::println);

		// orElseThrow
		String val = name.orElseThrow(() -> new RuntimeException("No value found"));


	}

}
