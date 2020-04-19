package rozdzial4.Zadania_Programistyczne;

import java.util.Random;
import java.util.Scanner;

public class zadanie_19 {

    public static void main (String []args) {

        // 1 - czerwony
        // 2 - zielony
        // 3 - niebieski
        // 4 - pomaranczowy
        // 5 - zolty

        int color;
        int userColor;
        int count = 0;
        Random random = new Random();

        for (int x = 1; x < 11; x++) {

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj kolor (od 1 - 5) " + x + ": ");
            userColor = input.nextInt();

            color = random.nextInt(5) + 1;
            System.out.println(color);

            if (userColor == color)
                count++;

        }
        System.out.println("Liczba wskazań identycznych do komputera wynosi: " + count);
    }
}
