package com.school;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void displaySchoolDirectory(List<Person> people) {
        System.out.println("\n--- School Directory ---");
        for (Person person : people) {
            person.displayDetails();
        }
    }

    public static void main(String[] args) {
        System.out.println("--- School Attendance System ---");

        Student student1 = new Student("Alice Wonderland");
        Student student2 = new Student("Bob The Builder");
        Teacher teacher1 = new Teacher("Mr. Smith", "Mathematics");
        Staff staff1 = new Staff("Ms. Johnson", "Librarian");
        Course course1 = new Course("Intro to Programming");

        List<Person> schoolPeople = new ArrayList<>();
        schoolPeople.add(student1);
        schoolPeople.add(student2);
        schoolPeople.add(teacher1);
        schoolPeople.add(staff1);

        displaySchoolDirectory(schoolPeople);

        System.out.println("\nRegistered Students:");
        student1.displayDetails();
        student2.displayDetails();

        System.out.println("\nAvailable Courses:");
        course1.displayDetails();

        // --- Attendance Recording ---
        System.out.println("\n--- Attendance Recording ---");
        List<AttendanceRecord> attendanceLog = new ArrayList<>();

        // Record valid attendance
        AttendanceRecord record1 = new AttendanceRecord(student1, course1, "Present");
        attendanceLog.add(record1);

        // Attempt to record invalid attendance status
        AttendanceRecord record2 = new AttendanceRecord(student2, course1, "Late");
        attendanceLog.add(record2); // Will be stored as "Invalid"

        // Record another valid attendance
        AttendanceRecord record3 = new AttendanceRecord(student2, course1, "Absent");
        // We'll update record2's student for this scenario (or make a new student for course1)
        // For simplicity, let's assume student2 also takes course1 and we are just making a new record.
        attendanceLog.add(record3);


        System.out.println("\n--- Attendance Log ---");
        for (AttendanceRecord record : attendanceLog) {
            record.displayRecord();
        }

        // Prepare data for saving
        List<Student> studentsToSave = new ArrayList<>();
        for (Person person : schoolPeople) {
            if (person instanceof Student) {
                studentsToSave.add((Student) person);
            }
        }
        FileStorageService.saveData(studentsToSave, "students.txt");

        System.out.println("\nPart 7: Polymorphism and Object References Complete.");
    }
}
