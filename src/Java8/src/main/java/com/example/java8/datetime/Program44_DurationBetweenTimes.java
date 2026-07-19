package com.example.java8.datetime;
import java.time.*;
public class Program44_DurationBetweenTimes {
    public static void main(String[] args){
        LocalTime t1 = LocalTime.of(10,0), t2 = LocalTime.of(12,30);
        System.out.println(Duration.between(t1,t2));
    }
}
