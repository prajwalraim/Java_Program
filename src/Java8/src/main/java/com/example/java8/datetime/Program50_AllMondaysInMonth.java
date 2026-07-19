package com.example.java8.datetime;
import java.time.*;
import java.util.stream.*;
public class Program50_AllMondaysInMonth {
    public static void main(String[] args){
        YearMonth ym = YearMonth.now();
        LocalDate start = ym.atDay(1);
        LocalDate end = ym.atEndOfMonth();
        Stream.iterate(start,d->d.plusDays(1)).limit(ChronoUnit.DAYS.between(start,end)+1)
            .filter(d->d.getDayOfWeek()==DayOfWeek.MONDAY).forEach(System.out::println);
    }
}
