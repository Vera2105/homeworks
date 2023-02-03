package com.example.homework.homeworkFour;

public class Workers {
    Employee employee1;
    Employee employee2;

    public void setParams() {
        this.employee1 = new Employee(3000, "Green", 1);
        this.employee2 = new Employee(3500, "Black", 2);
        System.out.println(this.employee1.id + " " + this.employee1.surname);
        System.out.println(this.employee2.id + " " + this.employee2.surname);

        this.employee1.showId();
        this.employee1.showSalary();
        this.employee1.showSurname();

        this.employee2.showId();
        this.employee2.showSalary();
        this.employee2.showSurname();

    }

}
