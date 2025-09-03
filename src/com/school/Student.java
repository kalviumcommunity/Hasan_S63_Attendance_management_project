package com.school;

public class Student {
    private String name;

    public Student() {
        this.name = "Unnamed Student";
    }

    public Student(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}