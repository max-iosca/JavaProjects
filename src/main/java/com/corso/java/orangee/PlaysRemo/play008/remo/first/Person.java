package com.corso.java.orangee.PlaysRemo.play008.remo.first;

import java.util.Random;

public class Person {

    private String name;
    private int age;

    public Person(String name) {
        this.name = name;
        this.age = calcRandomByRange(5, 75);
    }


    private int calcRandomByRange(int min, int max) {
        Random random = new Random();
        return random.nextInt(max) + min;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
