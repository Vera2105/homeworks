package com.example.homework.homeworkFive;

public class HomeworkFive {
    public void execution() {
        Pet pet = new Pet(2, 1, 4);
        Dog dog = new Dog(2, 1, 4, "Luk");
        Cat cat = new Cat(2, 1, 4, "Tom");
        Test test = new Test(cat, dog);
        test.numberOfDogsPaws();
        test.executeSleep();
    }
}
