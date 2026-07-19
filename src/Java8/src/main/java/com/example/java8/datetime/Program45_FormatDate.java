package main.java.com.example.java8.datetime;
import java.time.*;
import java.time.format.DateTimeFormatter;
public class Program45_FormatDate {
    public static void main(String[] args){
        System.out.println(LocalDate.now().format(DateTimeFormatter.ofPattern("dd-MM-yyyy")));
    }
}
