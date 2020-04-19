package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_2 {

    //program oblicza przebyta odleglosc i podaje jej wartosc na kazda godzine czasu

    public static void main(String[] args) {


        int hour;
        int speed;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Program oblicza odlegosc przebyta przez pojazd.");
        System.out.println("Podaj ile godzin trwala podroz: ");
        hour = input.nextInt();
        System.out.println("Podaj z jaka predkoscia jechales: ");
        speed = input.nextInt();

        if (hour < 1 || speed < 1) {
            System.out.println("Podana wartosc nie moze byc ujemna!");
        } else {
            System.out.println("Godzina" + "\t \t" + "Przebyta odległość");
            System.out.println("---------------------------------");
            for (int x = 1; x <= hour; x++) {
                sum = speed * x;
                System.out.println(x + "\t \t \t \t \t" + sum);
            }
        }
    }
}
