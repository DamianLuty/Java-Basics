package rozdzial6.ZadaniaProgramistyczne.zadanie19;

import rozdzial6.ZadaniaProgramistyczne.zadanie10.Die;

import java.util.Scanner;

public class FishingDemo {

    public static void main(String[] args) {

        int dieScore;
        int userScore, totalScore = 0;
        String answer = "";


        Die die = new Die();

        do {
            dieScore = die.rollDie();

            if(dieScore == 1){
                userScore = 10;
            } else if (dieScore == 2) {
                userScore = 20;
            } else if (dieScore == 3) {
                userScore = 5;
            } else if (dieScore == 4) {
                userScore = 0;
            } else if (dieScore == 5) {
                userScore = 20;
            } else
                userScore = 30;

            totalScore += userScore;

            Scanner input = new Scanner(System.in);
            System.out.println("Czy chcesz dalej łowić?");
            answer = input.next();

        } while (answer.equalsIgnoreCase("tak"));

        if (totalScore < 50) {
            System.out.println("Gratulacje!");

        } else if (totalScore < 100) {
            System.out.println("Gratulacje! Świetny z Ciebie łowca!");
        } else if (totalScore < 150) {
            System.out.println("Gratulacje jesteś wybitnym wędkarzem!");
        } else {
            System.out.println("To jakiś obłęd!!! Takiego wędkarza dawno nie widzieliśmy!!!");
        }
        System.out.println("Twój wynik to: " + totalScore);
    }
}
