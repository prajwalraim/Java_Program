package com.program.adavanced;

import java.util.ArrayList;
import java.util.List;

public class Person {
    private final List<String> hobbies;

    public Person(List<String> hobbies) {
        this.hobbies = hobbies; // No copy made = DANGER
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies); // Exposing internal object
    }
}
