import java.util.Scanner;

public class Main {

    public static int sumOfThree(int num) {
        int first = num / 100;
        int second = (num - (first * 100)) / 10;
        int third = num - (first * 100 + second * 10);
        return first + second + third;
    }

    public static int sumOfThree(String a, String b) {
        int w1 = a.length();
        int w2 = b.length();
        return w1 + w2;
    }

    public static boolean sumOfThree(String a) {
        int b = Integer.parseInt(a);
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

    public static String theMaxLengthOfAWord(String a, String b, String c) {

        if (a.length() > b.length() && a.length() > c.length()) {
            return a;
        } else if (b.length() > a.length() && b.length() > c.length()) {
            return b;
        } else {
            return c;
        }
    }

    public static void printXFirst() {
        int n = 5;
        int i = n;
        String show = "X";
        while (i >= 1) {
            int j = 1;
            while (j < i) {
                System.out.print(" ");
                j++;
            }
            System.out.println(show);
            show +="X";
            i--;
        }
    }

    public static void printXSecond() {
        String show = "XXXXX";
        for (int i = 1; i <= 5; i++) {
            if (i != 1) {
                show = show.replaceFirst("X", " ");
            }
            System.out.println(show);
        }
    }

    public static void printThird() {
        String show = "";
        for (int i = 1; i <= 4; i++) {
            show += "X";
            System.out.println(show);
        }
        int n = 5;
        int i = n;
        while (i >= 1) {
            int j = 1;
            while (j <= i) {
                System.out.print("X");
                j++;
            }
            System.out.println("");
            i--;
        }
        System.out.println("");
    }



    public static void main(String[] args) {
        int result = sumOfThree(224);
        System.out.println(result);
        int resultSecond = sumOfThree("sky", "blue");
        System.out.println(resultSecond);

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        String numberFromConsoleFirst = scanner.nextLine();
        sumOfThree(numberFromConsoleFirst);

        String resultWord = theMaxLengthOfAWord("Sun", "Flower", "Butterfly");
        System.out.println("The longest word is " + resultWord);

        Month month = new Month();
        int resultDays = month.showNomOfDays(12);
        System.out.println("The number of days in this month is " + resultDays);

        System.out.println("----------");
        printXFirst();
        System.out.println("----------");
        printXSecond();
        System.out.println("----------");
        printThird();
    }

}