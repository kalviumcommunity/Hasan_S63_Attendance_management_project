package com.school;

public class Course {
    private String title;

    public Course() {
        this.title = "Untitled Course";
    }

    public Course(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}