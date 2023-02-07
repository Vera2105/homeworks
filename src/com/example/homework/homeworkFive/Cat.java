package com.example.homework.homeworkFive;

public class Cat extends Pet {
    public Cat(int eyes, int tail, int paw, String name) {
        super(eyes, tail, paw, name);
        System.out.println("I am a cat and my name is:" + " " + name);
    }

    public void sleep() {
        System.out.println("Cat sleeps");
    }
}
