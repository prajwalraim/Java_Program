package main.java.com.example.java8.lambdas;
import java.util.function.Predicate;
public class Program10_IsEmptyLambda {
    public static void main(String[] args) {
        Predicate<String> isEmpty = s -> s==null || s.trim().isEmpty();
        System.out.println(isEmpty.test("")); System.out.println(isEmpty.test("Hi"));
    }
}
