package com.example.homework.homeworkFour;

public class Student {
    int numberOfStudentTicket;
    String name;
    String surname;
    int course;
    double averageMathsScore;
    double averageEconomicsScore;
    double averageLangScore;

    public Student(int numberOfStudentTicket, String name, String surname, int course, double averageMathsScore, double averageEconomicsScore, double averageLangScore) {
        this.numberOfStudentTicket = numberOfStudentTicket;
        this.name = name;
        this.surname = surname;
        this.course = course;
        this.averageMathsScore = averageMathsScore;
        this.averageEconomicsScore = averageEconomicsScore;
        this.averageLangScore = averageLangScore;
    }

    public void averageStudentScore() {
        double average = (this.averageEconomicsScore + this.averageMathsScore + this.averageLangScore) / 3;
        System.out.println("Common average score of " + this.name + " is " + average);
    }


}

