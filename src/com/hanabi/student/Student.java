package com.hanabi.student;

public class Student {

    private String name;
    private double scoresMath;
    private double scoresEngList;
    private double scoresLiterature;

    public Student() {
    }

    public Student(String name, double scoresMath, double scoresEng, double scoresLiterature) {
        this.name = name;
        this.scoresMath = scoresMath;
        this.scoresEngList = scoresEng;
        this.scoresLiterature = scoresLiterature;
    }

    public void getStudent() {
        System.out.println("Ten hs: " + name);
        System.out.println("Diem toan: " + scoresMath);
        System.out.println("Diem van: " + scoresLiterature);
        System.out.println("Diem anh: " + scoresEngList);
    }

    public double avgScore() {

        return (scoresEngList + scoresLiterature + scoresMath) / 3;

    }

}
