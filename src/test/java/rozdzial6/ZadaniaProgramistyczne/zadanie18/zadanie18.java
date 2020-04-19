package rozdzial6.ZadaniaProgramistyczne.zadanie18;

import rozdzial6.ZadaniaProgramistyczne.zadanie17.Coin;

public class zadanie18 {

    public static void main(String[] args) {

        int score = 0;
        int amount5 = 0, amount10 = 0, amount20 = 0;

        Coin coin5 = new Coin();
        Coin coin10 = new Coin();
        Coin coin20 = new Coin();

        for (int x = 0; score < 100; x++) {
            coin5.toss();
            coin10.toss();
            coin20.toss();

            if (coin5.getSideUp().equals("orzeł")) {
                amount5 = 5;
            } else {
                amount5 = 0;
            }

            if (coin10.getSideUp().equals("orzeł")) {
                amount10 = 10;
            } else {
                amount10 = 0;
            }

            if (coin20.getSideUp().equals("orzeł")) {
                amount20 = 20;
            } else {
                amount20 = 0;
            }
            score = score + amount5 + amount10 + amount20;
        }
        if (score == 100) {
            System.out.println("Wygrałeś!");
            System.out.println("Twoja suma wynosi: " + score + " groszy.");
        } else {
            System.out.println("Przykro mi, przegrałeś!");
            System.out.println("Twoja suma wynosi: " + score + " groszy.");
        }
    }
}
