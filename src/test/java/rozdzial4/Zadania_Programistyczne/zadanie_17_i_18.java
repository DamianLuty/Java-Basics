package rozdzial4.Zadania_Programistyczne;

import java.util.Random;
import java.util.Scanner;

public class zadanie_17_i_18 {

    public static void main (String []args) {

        int number;
        int yourNumber;
        //do zadania 18
        int count = 1;

        Random random = new Random();

        number = random.nextInt(10) + 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Zgadnij jaka to licza (przedzial od 1 do 10): ");
        yourNumber = input.nextInt();

        do {
            if (yourNumber < number) {
                System.out.println("Podana wartosc jest za mała, spróbuj jeszcze raz: ");
                yourNumber = input.nextInt();
            } else if (yourNumber > number) {
                System.out.println("Podana wartosc jest za duza, sprobuj jeszcze raz: ");
                yourNumber = input.nextInt();
            }
            //do zadania 18
            count++;
    } while (yourNumber != number);
        System.out.println("Brawo Twoja liczba: " + yourNumber + " jest taka sama jak wylosowana: " + number);

        //do zadania 18
        System.out.println("Twoja ilość prób do odgadnięcia liczby to: " + count);
    }
}

