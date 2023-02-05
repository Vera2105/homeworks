package com.example.homework.homeworkFour;

public class Employee {
    private double salary;
    public String surname;
    int id;

    public void showSalary() {
        System.out.println(salary);
    }

    public void showSurname() {
        System.out.println(surname);
    }

    public void showId() {
        System.out.println(id);
    }

    Employee() {
    }

    public Employee(double salary, String surname, int id) {
        this.salary = salary;
        this.surname = surname;
        this.id = id;
    }

    private Employee(double salary) {
        this.salary = salary;
    }
}
