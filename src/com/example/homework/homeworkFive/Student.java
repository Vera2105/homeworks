package com.example.homework.homeworkFive;
public class Student {
    private String name;
    private int course;
    private int grade;
    public String getName() {
        return name;
    }
    public void setName(String name) {
        if (name.length() >= 3) {
            this.name = name;
        }
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        if (course >= 1 && course <= 4) {
            this.course = course;
        }
    }
    public int getGrade() {
        return grade;
    }
    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 10) {
            this.grade = grade;
        }
    }
     void showInfo(){
         System.out.println(name+" "+course+" "+grade);
     }
}
