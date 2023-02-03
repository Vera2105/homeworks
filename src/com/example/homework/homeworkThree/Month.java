package com.example.homework.homeworkThree;

public class Month {
   public void showNomOfDays(int month){
       int result;
       switch (month){
           case 1:
           case 3:
           case 5:
           case 7:
           case 8:
           case 10:
           case 12:
               result = 31;
               break;
           case 2:
               result = 28;
               break;
           case 4:
           case 6:
           case 9:
           case 11:
               result = 30;
               break;
           default:
               result = 0;
       }
       System.out.println("The number of days in this month is " + result);

   }
}
