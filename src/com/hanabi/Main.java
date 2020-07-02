package com.hanabi;

import com.hanabi.cls.Cls;
import com.hanabi.school.School;
import com.hanabi.student.Student;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        //bài 1
//        Prime prime = new Prime(15);
//        prime.listPrimeNumbers();

        //bai 2
//        Quadratic quadratic = new Quadratic(1, 0, -9);
//        quadratic.solve();

        //bai 3
        List<Student> students = new ArrayList<>();
        students.add(new Student("Trung", 10, 9, 10));
        students.add(new Student("Hiếu", 8, 4, 7));
        students.add(new Student("Hòa", 1, 3, 1));
        students.add(new Student("Vũ", 5, 1, 10));
        students.add(new Student("Tùng", 8, 9, 10));

        Cls cls = new Cls(1, "K32", students);
        Cls cls2 = new Cls(3, "K33", students);

        List<Cls> clsList = new ArrayList<>();
        clsList.add(cls2);
        clsList.add(cls);

        School school = new School(clsList);
        school.getSchool();
        school.maxScoreClass();

    }
}
