package com.hanabi.cls;

import com.hanabi.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Cls {

    private int classId;
    private String className;
    private List<Student> students;

    public Cls(int classId, String className, List<Student> students) {
        this.classId = classId;
        this.className = className;
        this.students = students;
    }

    public void setStudents(List<Student> students) {
        this.students = students;
    }

    public Cls(int classId, String className) {
        this.classId = classId;
        this.className = className;
    }

    public String getClassName() {
        return className;
    }

    public void getCls() {
        System.out.println("Ma lop la: " + classId);
        System.out.println("Ten lop la: " + className);
        System.out.println("Danh sach hoc vien: ");

        for (Student student : students) {
            student.getStudent();
        }

    }

    public void maxAvgScores() {

        List<Student> maxScoresStudents = new ArrayList<>();

        double maxScores = 0;

        for (Student student : students) {

            double avgScores = student.avgScore();

            if (maxScores < avgScores) {

                maxScores = avgScores;
                maxScoresStudents.add(student);

            } else if (maxScores == avgScores) {

                maxScoresStudents.add(student);

            }

        }

        for (Student student : maxScoresStudents) {
            student.getStudent();
        }

    }


}
