package com.example.homework.homeworkSeven;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Phone {

    public static void main(String[] args) {
        List<String> phoneNumber = new ArrayList<>();
        phoneNumber.add("+380(97)333-2211");
        phoneNumber.add("38066-111333");
        phoneNumber.add("+380684258770");
        phoneNumber.add("38077-248-6543");
        String regex = "^\\+?3?8?(0?[(]?[0-9]{2}?[)]?[0-9]{3}.[0-9]{4}$)";
        Pattern pattern = Pattern.compile(regex);
        for (String phone : phoneNumber) {
            Matcher matcher = pattern.matcher(phone);
            System.out.println(phone + " " + ":" + " " + matcher.matches());
        }
    }
}
