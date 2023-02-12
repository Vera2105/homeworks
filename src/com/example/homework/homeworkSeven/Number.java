package com.example.homework.homeworkSeven;

import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;


public class Number {

    public static Integer[] newNumbersArray(Integer[] arrayToChange, int dividerWeUse) {
        List<Integer> numNew = Arrays.asList(arrayToChange);
        List<Integer> arrayChanged = numNew.stream().map(el -> el / dividerWeUse).collect(Collectors.toList());
        return arrayChanged.toArray(new Integer[arrayChanged.size()]);
    }

    public static void main(String[] args) {

        Integer[] numbers = new Integer[]{45, 596, 248, -89, 365};

        Scanner sc = new Scanner(System.in);
        System.out.println("Please, enter your number:");
        try {
            int number = sc.nextInt();
            System.out.println("Your number is:" + " " + number);
            Integer[] result = newNumbersArray(numbers, number);
            System.out.println(Arrays.toString(result));
        } catch (ArithmeticException | InputMismatchException e) {
            System.out.println("The exception was caught");
        }
        sc.close();
    }
}