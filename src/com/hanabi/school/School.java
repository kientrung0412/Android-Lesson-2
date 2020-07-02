package com.hanabi.school;

import com.hanabi.cls.Cls;

import java.util.List;

public class School {

    private List<Cls> clsList;

    public School(List<Cls> clsList) {
        this.clsList = clsList;
    }

    public void getSchool() {
        for (Cls cls : clsList) {
            System.out.println("Tên lớp: " + cls.getClassName());
        }
    }

    public void maxScoreClass(){
        for (Cls cls : clsList) {
            System.out.println("Hoc sinh diem cao nhat lop " + cls.getClassName());
            cls.maxAvgScores();
        }
    }
}
