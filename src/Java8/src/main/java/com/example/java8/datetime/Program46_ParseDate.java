package main.java.com.example.java8.datetime;
import java.time.*;
public class Program46_ParseDate {
    public static void main(String[] args){
        LocalDate d = LocalDate.parse("2025-01-01");
        System.out.println(d);
    }
}
