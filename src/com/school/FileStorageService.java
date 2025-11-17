package com.school;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class FileStorageService {
    public static void saveData(List<Student> students, String filename) {
        try (FileWriter writer = new FileWriter(filename)) {
            for (Student student : students) {
                writer.write(student.getStudentId() + "," + student.getName() + "\n");
            }
            System.out.println("Data saved to " + filename);
        } catch (IOException e) {
            System.out.println("Error saving data: " + e.getMessage());
        }
    }
}
