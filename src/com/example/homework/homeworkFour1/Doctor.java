package com.example.homework.homeworkFour1;

import com.example.homework.homeworkFour.Employee;

public class Doctor {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3000, "White", 3);
        Employee employee2 = new Employee(2000, "Blue", 4);
        System.out.println(employee1.surname);
        System.out.println(employee2.surname);
        employee1.showId();
        employee1.showSalary();
        employee1.showSurname();
        employee2.showId();
        employee2.showSalary();
        employee2.showSurname();
    }
}
