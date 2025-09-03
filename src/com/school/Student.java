package com.school;

/**
 * Represents a student with attendance tracking.
 */
public class Student {
    private final int id;
    private final String name;
    private final boolean[] attendance; // true for present, false for absent

    public Student(int id, String name, int sessions) {
        this.id = id;
        this.name = name;
        this.attendance = new boolean[sessions];
    }

    public int getId() { return id; }
    public String getName() { return name; }

    /**
     * Mark attendance for a specific session.
     * @param session the session index (0-based)
     * @param present true if present, false if absent
     */
    public void markAttendance(int session, boolean present) {
        if (session >= 0 && session < attendance.length) {
            attendance[session] = present;
        }
    }

    /**
     * Calculate attendance percentage.
     * @return attendance percentage
     */
    public double getAttendancePercentage() {
        int presentCount = 0;
        for (boolean present : attendance) {
            if (present) presentCount++;
        }
        return attendance.length > 0 ? (double) presentCount / attendance.length * 100 : 0;
    }

    @Override
    public String toString() {
        return "Student{id=" + id + ", name='" + name + "', attendance%=" + getAttendancePercentage() + "}";
    }
}
