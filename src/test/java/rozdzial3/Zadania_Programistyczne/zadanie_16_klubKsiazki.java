package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_16_klubKsiazki {

    public static void main (String []args) {

        int books;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe zakupionych ksiazek w danym miesiacu: ");
        books = input.nextInt();

        if (books >= 4)
            System.out.println("W tym miesiacu otrzymujesz 60 pkt.");
        else if (books == 3)
            System.out.println("W tym miesiacu otrzymujesz 30 pkt.");
        else if (books == 2)
            System.out.println("W tym miesiacu otrzymujesz 15 pkt.");
        else if (books == 1)
            System.out.println("W tym miesiacu otrzymujesz 5 pkt.");
        else
            System.out.println("W tym miesiacu otrzymujesz 0 pkt.");
    }
}
