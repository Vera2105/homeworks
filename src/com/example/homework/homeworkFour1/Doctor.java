package com.example.homework.homeworkFour1;

import com.example.homework.homeworkFour.Employee;

public class Doctor {
    Employee employee1;
    Employee employee2;

    public void setParams() {
        this.employee1 = new Employee(3000, "White", 3);
        this.employee2 = new Employee(2000, "Blue", 4);

        System.out.println(this.employee1.surname);
        System.out.println(this.employee2.surname);

        this.employee1.showSurname();
        this.employee1.showSalary();
        this.employee1.showId();

        this.employee2.showSurname();
        this.employee2.showSalary();
        this.employee2.showId();
    }
}
