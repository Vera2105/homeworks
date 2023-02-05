package com.example.homework.homeworkTwo;

import java.util.Scanner;

public class HomeworkTwo {

    public void sumOfThree(int num) {
        int first = num / 100;
        int second = (num - (first * 100)) / 10;
        int third = num - (first * 100 + second * 10);
        System.out.println(first + second + third);
    }

    public void sumOfThree(String a, String b) {
        int w1 = a.length();
        int w2 = b.length();
        System.out.println(w1 + w2);
    }

    public boolean sumOfThree() {
        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        String numberFromConsoleFirst = scanner.nextLine();
        int b = Integer.parseInt(numberFromConsoleFirst);
        boolean result;
        if (b > 0) {
            System.out.println("Число > 0");
            result = true;
        } else {
            System.out.println("Число <= 0");
            result = false;
        }
        return result;
    }
    public void execution (){
        sumOfThree(224);
        sumOfThree("sky", "blue");
        sumOfThree();
    }
}
