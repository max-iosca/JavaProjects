package com.corso.java.orangee.PlaysRemo.play008.remo.second;

public class Person {

    private String name;
    private int age;

    public Person(String name, Integer age) {
        this.name = name;
        if (age==null)
            this.age = calcRandomByRange(5, 75);
        else
            this.age = age;
    }


    private int calcRandomByRange(int min, int max) {
        return (int) ((Math.random() * (max - min)) + min);
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }
}
