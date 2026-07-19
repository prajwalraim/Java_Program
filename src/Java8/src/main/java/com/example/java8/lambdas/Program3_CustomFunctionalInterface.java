package main.java.com.example.java8.lambdas;

@FunctionalInterface
interface Calc {
	int add(int a , int b);

}

public class Program3_CustomFunctionalInterface {
	public static void main(String[] args) {
		Calc c = (a,b)-> a+b;
		
		int v = c.add(10, 15);
		
		
	}
}
