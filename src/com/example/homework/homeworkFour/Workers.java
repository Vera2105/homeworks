package com.example.homework.homeworkFour;

public class Workers {
    public static void main(String[] args) {
        Employee employee1 = new Employee(3000, "Green", 1);
        Employee employee2 = new Employee(3500, "Black", 2);
        System.out.println(employee1.id + " " + employee1.surname);
        System.out.println(employee2.id + " " + employee2.surname);
        employee1.showId();
        employee1.showSalary();
        employee1.showSurname();
        employee2.showId();
        employee2.showSalary();
        employee2.showSurname();
    }
}
