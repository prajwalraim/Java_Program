package com.pm.java8;

import java.util.function.Consumer;
import java.util.function.Supplier;

public class ProducerConsumerDemo {

    public static void main(String[] args) {

        // Producer
        Supplier<String> producer = () -> {
            return "Data produced";
        };

        // Consumer
        Consumer<String> consumer = data -> {
            System.out.println("Consumed: " + data);
        };

        // Producer produces data
        String data = producer.get();

        // Consumer consumes data
        consumer.accept(data);
    }
}
