package main.java.com.example.java8.lambdas;

import java.util.function.BiFunction;
import java.util.function.Function;

public class Program7_CalculatorLambda {
	public static void main(String[] args) {
		BiFunction<Integer, Integer, Integer> mul = (a, b) -> a * b;
		System.out.println("6*7=" + mul.apply(6, 7));
		
		Function<Integer,Integer> f = n-> n*n;
		
		Function<Integer,Integer> fs = a -> a*2;
		
		System.out.println(f.apply(3));
		
		Function<Integer,Integer> fss = f.andThen(fs);
		
		System.out.println(fss.apply(7));
	}
}
