public class HomeworkThree {

    public void theMaxLengthOfAWord(String a, String b, String c) {
        String resultWord;
        if (a.length() > b.length() && a.length() > c.length()) {
            resultWord = a;
        } else if (b.length() > a.length() && b.length() > c.length()) {
            resultWord = b;
        } else {
            resultWord = c;
        }
        System.out.println("The longest word is " + resultWord);
    }

    public  void printXFirst() {
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
            show += "X";
            i--;
        }
    }

    public void printXSecond() {
        String show = "XXXXX";
        for (int i = 1; i <= 5; i++) {
            if (i != 1) {
                show = show.replaceFirst("X", " ");
            }
            System.out.println(show);
        }
    }

    public void printThird() {
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
    }
    public void execution (){
        theMaxLengthOfAWord("Sun", "Flower", "Butterfly");
        Month month = new Month();
        month.showNomOfDays(12);
        System.out.println("----------");
        printXFirst();
        System.out.println("----------");
        printXSecond();
        System.out.println("----------");
        printThird();
    }
}
