package com.example.homework.homeworkFive;

public class TestStudent {
    Student student1;
    Student student2;

    public void setStudent1() {
        student1 = new Student();
        student1.setName("Alex");
        student1.setCourse(2);
        student1.setGrade(5);
        student1.showInfo();
    }

    public void setStudent2() {
        student2 = new Student();
        student2.setName("Boss");
        student2.setGrade(9);
        student2.setCourse(3);
        student2.showInfo();

    }
}
