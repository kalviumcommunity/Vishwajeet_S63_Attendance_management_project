package com.school;

public class Person {
    protected String name;

    public Person(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void displayDetails() {
        System.out.println("Name: " + name);
    }
}
