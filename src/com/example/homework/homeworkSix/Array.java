package com.example.homework.homeworkSix;

public class Array {
    public static int minResult(int[] array) {
        int result = 0;
        boolean firstCall = true;
        for (int a = 0; a < array.length; a++) {
            int first = array[a];
            for (int b = 0; b < array.length; b++) {
                int second = array[b];
                int prevResult = Math.abs(first - second);
                if (a == b) {
                    continue;
                }
                if (firstCall) {
                    result = prevResult;
                    firstCall = false;
                } else {
                    if (prevResult < result) {
                        result = prevResult;
                    }
                    if (result == 0) {
                        return 0;
                    }
                }
            }
        }
        return result;
    }
    public static void main(String[] args) {
        int[] numbers = new int[]{5, 11, 7, 20};
        int result = minResult(numbers);
        System.out.println(result);
    }
}

