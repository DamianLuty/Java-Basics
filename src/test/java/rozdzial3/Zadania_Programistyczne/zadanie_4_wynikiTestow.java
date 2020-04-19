package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_4_wynikiTestow {

    public static void main(String[] args) {

        int score1;
        int score2;
        int score3;
        double averageScore;


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wynik z pierwszego testu: ");
        score1 = input.nextInt();
        System.out.println("Podaj wynik z drugiego test: ");
        score2 = input.nextInt();
        System.out.println("Podaj wynik z trzeciego testu: ");
        score3 = input.nextInt();

        averageScore = (score1 + score2 + score3) / 3;

        String wynik = ("Twoja srednia wyników z testu wynosi: "
                + averageScore
                + "\nTwoja ocena:  ");

        if (averageScore >= 90)
            System.out.println(wynik + " 5.");
            else if (averageScore >= 80)
                System.out.println(wynik + " 4.");
            else if (averageScore >= 70)
                System.out.println(wynik + " 3.");
            else if (averageScore >= 60)
                System.out.println(wynik + " 2.");
            else
                System.out.println(wynik + " 1.");
        }
    }
