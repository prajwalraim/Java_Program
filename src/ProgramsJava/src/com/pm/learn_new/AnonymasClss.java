package com.pm.learn_new;


interface MyInterface {
    default void doSomething() {
        System.out.println("Default");
    }
}

public class AnonymasClss {
    public static void main(String[] args) {
        MyInterface obj = new MyInterface() {}; // Anonymous class
        obj.doSomething(); // Prints "Default"
    }
}
