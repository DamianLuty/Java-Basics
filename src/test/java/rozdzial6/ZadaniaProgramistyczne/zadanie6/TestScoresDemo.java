package rozdzial6.ZadaniaProgramistyczne.zadanie6;

import java.util.Scanner;

public class TestScoresDemo {

    public static void main(String[] args) {

        double score1, score2, score3, avg;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wynik pierwszego testu: ");
        score1 = input.nextDouble();

        System.out.println("Podaj wynik drugiego testu: ");
        score2 = input.nextDouble();

        System.out.println("Podaj wynik trzeciego tetsu: ");
        score3 = input.nextDouble();

        TestScores score = new TestScores();

        avg = score.averageScore(score1,score2,score3);

        System.out.println("Średni wynik z testów wynosi: " + avg);
    }
}
