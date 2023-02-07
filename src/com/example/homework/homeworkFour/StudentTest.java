package com.example.homework.homeworkFour;

public class StudentTest {
    public static void main(String[] args) {
        Student student1 = new Student(1, "Alex", "Bolt", 1, 3.3,
                4.1, 4.5);
        Student student2 = new Student(2, "Bob", "Green", 3, 4.7,
                3.9, 4.2);
        Student student3 = new Student(3, "Tim", "Black", 4, 5.0,
                4.6, 4.8);
       student1.averageStudentScore();
       student2.averageStudentScore();
       student3.averageStudentScore();
    }
}
