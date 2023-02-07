package com.example.homework.homeworkFive;

public class TestStudent {
    public static void main(String[] args) {
        Student student1= new Student();
        student1.setName("Alex");
        student1.setCourse(2);
        student1.setGrade(5);
        student1.showInfo();

        Student student2= new Student();
        student2.setName("Boss");
        student2.setGrade(9);
        student2.setCourse(3);
        student2.showInfo();
    }
}
