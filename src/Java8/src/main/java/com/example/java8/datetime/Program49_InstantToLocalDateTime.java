package com.example.java8.datetime;
import java.time.*;
public class Program49_InstantToLocalDateTime {
    public static void main(String[] args){
        System.out.println(LocalDateTime.ofInstant(Instant.now(), ZoneId.systemDefault()));
    }
}
