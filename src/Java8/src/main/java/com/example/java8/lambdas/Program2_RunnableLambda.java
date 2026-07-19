package main.java.com.example.java8.lambdas;
public class Program2_RunnableLambda {
    public static void main(String[] args) {
        Runnable r = () -> System.out.println("Lambda Runnable");
        new Thread(r).start();
    }
}
