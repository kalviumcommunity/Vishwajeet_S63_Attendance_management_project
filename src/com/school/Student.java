package com.school;

public class Student extends Person {
    private static int nextStudentIdCounter = 1;

    private int studentId;    // Made private

    // Constructor
    public Student(String name) {
        super(name);
        this.studentId = nextStudentIdCounter++; // Auto-increment and assign ID
    }

    // Getter for studentId
    public int getStudentId() {
        return studentId;
    }

    // Getter for name (inherited from Person)
    // public String getName() { return name; } // Already in Person

    @Override
    public void displayDetails() {
        System.out.println("Student ID: " + this.studentId + ", Name: " + this.name);
    }
}
