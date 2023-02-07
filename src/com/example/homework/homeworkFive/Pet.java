package com.example.homework.homeworkFive;

public class Pet extends Animal {
    String name;
    int tail;
    int paw;
    void run() {
        System.out.println("Pet runs");
    }
    void jump() {
        System.out.println("Pet jumps");
    }

    public Pet(int eyes, int tail, int paw) {
        super();
        System.out.println("I am a pet");
        this.tail = tail;
        this.paw = paw;
    }
    public Pet(int eyes, int tail, int paw, String name) {
        super();
        this.tail = tail;
        this.paw = paw;
        this.name = name;
    }
}
