package com.example.java8.datetime;
import java.time.*;
import java.time.temporal.TemporalAdjusters;
public class Program47_NextFriday {
    public static void main(String[] args){
        LocalDate nextFriday = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.FRIDAY));
        System.out.println(nextFriday);
    }
}
