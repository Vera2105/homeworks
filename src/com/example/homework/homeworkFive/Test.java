package com.example.homework.homeworkFive;

public class Test {

    public Cat cat;
    public  Dog dog;

    public Test(Cat cat, Dog dog) {
        this.cat= cat;
        this.dog = dog;
    }
    public void executeSleep(){
        cat.sleep();
    }
    public void numberOfDogsPaws() {
        System.out.println("The number of dog's paw is" + " " + dog.paw);
    }



}
