package com.example.java8.datetime;
import java.time.*;
public class Program48_DaysLeftInYear {
    public static void main(String[] args){
        LocalDate today = LocalDate.now();
        LocalDate end = LocalDate.of(today.getYear(),12,31);
        System.out.println( java.time.temporal.ChronoUnit.DAYS.between(today,end) );
    }
}
