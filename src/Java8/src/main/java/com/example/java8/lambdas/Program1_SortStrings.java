package main.java.com.example.java8.lambdas;
import java.util.*;
public class Program1_SortStrings {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("Banana","Apple","Orange","Mango"));
        list.sort((a,b)->a.compareTo(b));
        System.out.println(list);
    }
}
