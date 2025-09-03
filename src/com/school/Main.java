package com.school;

public class Main {
    public static void main(String[] args) {
        Student[] students = new Student[2];
        students[0] = new Student("Alice");
        students[1] = new Student("Bob");

        Course[] courses = new Course[2];
        courses[0] = new Course("Math");
        courses[1] = new Course("Science");

        for (Student s : students) {
            System.out.println("Student: " + s.getName());
        }

        for (Course c : courses) {
            System.out.println("Course: " + c.getTitle());
        }
    }
}