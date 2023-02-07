package com.example.homework.homeworkFive;

public class Dog extends Pet {
    public Dog(int eyes, int tail, int paw, String name) {
        super(eyes, tail, paw, name);
        System.out.println("I am dog and my name is:" + " " + name);
    }

    public void play() {
        System.out.println("Dog plays");
    }
}
