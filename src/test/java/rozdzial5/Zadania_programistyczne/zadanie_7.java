package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_7 {

    //program oblicza srednia ze wszystkich testow i podaje ocene koncowa

    public static void main(String[] args) {

        double average;
        double score;
        double test1, test2, test3, test4, test5;

        test1 = testScore(1);
        test2 = testScore(2);
        test3 = testScore(3);
        test4 = testScore(4);
        test5 = testScore(5);
        average = calcAverage(test1, test2, test3, test4, test5);
        score = determineGrade(average);
        display(test1, test2, test3, test4, test5, average, score);
    }

    private static int testScore(int x) {
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wyniku testu nr: " + x);
        return input.nextInt();
    }

    private static double calcAverage(double test1, double test2, double test3, double test4, double test5) {
        return (test1 + test2 + test3 + test4 + test5) / 5;
    }

    private static double determineGrade(double average) {
        int score;

        if (average < 60) {
            score = 1;
        } else if (average < 70) {
            score = 2;
        } else if (average < 80) {
            score = 3;
        } else if (average < 90 ) {
            score = 4;
        } else {
            score = 5;
        }
        return score;
    }
    private static void display(double test1, double test2, double test3, double test4, double test5,
                                  double average, double score) {
        System.out.println("Wynik testu pierwszego: " + test1);
        System.out.println("Wynik testu drugiego: " + test2);
        System.out.println("Wynik testu trzeciego: " + test3);
        System.out.println("Wynik testu czwartego: " + test4);
        System.out.println("Wynik testu piątego: " + test5);
        System.out.println("Srednia punktów ze wszystkich testów wyniosła: " + average);
        System.out.println("Twoja ocena to: " + score);
    }
}

