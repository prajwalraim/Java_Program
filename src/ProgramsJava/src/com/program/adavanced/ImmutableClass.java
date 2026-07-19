package com.program.adavanced;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/*Key rules of immutability

Class should be declared final (so it cannot be extended).

All fields should be private and final (so they can’t be modified once assigned).

No setters (so values can’t be changed after construction).

Defensive copies for mutable objects (like Date, List, Map).

Return new copies in getters (so caller cannot modify internal state).*/

public final class ImmutableClass {

    private final String name;
    private final int age;
    private final Date birthDate;
    private final List<String> hobbies;

    public ImmutableClass(String name, int age, Date birthDate, List<String> hobbies) {
        this.name = name;
        this.age = age;
        this.birthDate = new Date(birthDate.getTime());    // defensive copy
        this.hobbies = new ArrayList<>(hobbies);           // defensive copy
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public Date getBirthDate() {
        return new Date(birthDate.getTime());              // defensive copy
    }

    public List<String> getHobbies() {
        return new ArrayList<>(hobbies);                   // defensive copy
    }
}
