package com.example.java8.datetime;
import java.time.*;
public class Program43_PeriodBetweenDates {
    public static void main(String[] args){
        LocalDate a = LocalDate.of(2020,1,1);
        LocalDate b = LocalDate.of(2021,6,1);
        System.out.println(Period.between(a,b));
    }
}
