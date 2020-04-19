package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_6_kalkulatorCzasu {

    public static void main(String[] args) {

        double seconds;
        double minutes;
        double hours;
        double days;
        double years;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe sekund: ");
        seconds = input.nextDouble();

        minutes = seconds / 60;
        hours = seconds / 3600;
        days = seconds / 86400;
        years = seconds / 31536000;

        if (seconds >= 31536000)
            System.out.printf("Liczba lat wynosi: " + "%,.01f", years);
        else if (seconds >= 86400)
            System.out.printf("Liczba dni wynosi: " + "%,.01f", days);
        else if (seconds >= 3600)
            System.out.printf("Liczba godzin wynosi: " + "%,.01f", hours);
        else if (seconds >= 60)
            System.out.printf("Liczba minut wynosi: " + "%,.01f", minutes);

        }
    }
