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

    public static void main(String[] args) {
        int result = sumOfThree(224);
        System.out.println(result);
        int resultSecond = sumOfThree("sky", "blue");
        System.out.println(resultSecond);

        System.out.println("Enter number: ");
        Scanner scanner = new Scanner(System.in);
        String numberFromConsoleFirst = scanner.nextLine();
        sumOfThree(numberFromConsoleFirst);
    }

}