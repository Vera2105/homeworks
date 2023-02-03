package com.example.homework.homeworkFour;

public class StudentTest {
    Student student1;
    Student student2;
    Student student3;

    public void setParams() {
        this.student1 = new Student(1, "Alex", "Bolt", 1, 3.3, 4.1, 4.5);
        this.student2 = new Student(2, "Bob", "Green", 3, 4.7, 3.9, 4.2);
        this.student3 = new Student(3, "Tim", "Black", 4, 5.0, 4.6, 4.8);
        this.student1.averageStudentScore();
        this.student2.averageStudentScore();
        this.student3.averageStudentScore();
    }
}
