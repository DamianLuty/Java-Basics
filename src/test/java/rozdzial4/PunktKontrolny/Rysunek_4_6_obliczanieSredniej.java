package rozdzial4.PunktKontrolny;

import java.util.Scanner;

public class Rysunek_4_6_obliczanieSredniej {

    public static void main (String []args) {

        int score1, score2, score3;
        double average;
        char repeat;
        String input;

        System.out.println("Ten program oblicza srednia wynikow trzech testow");

        Scanner keyboard = new Scanner(System.in);

        do {
            System.out.println("Podaj wynik pierwszego testu: ");
            score1 = keyboard.nextInt();

            System.out.println("Podaj wynik drugiego test: ");
            score2 = keyboard.nextInt();

            System.out.println("Podaj wynik trzeciego testu: ");
            score3 = keyboard.nextInt();

            keyboard.nextLine();

            average = (score1 + score2 + score3) / 3.0;
            System.out.println("Srednia wynosi: " + average + ".");

            System.out.println("Czy chcesz obliczyc srednia nastepnego zbioru wynikow: ");
            System.out.println("Wpisz T (Tak) lub N (Nie): ");
            input = keyboard.nextLine();
            repeat = input.charAt(0);

        } while (repeat == 'T' || repeat == 't');
    }
}
