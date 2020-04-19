package rozdzial4.PunktKontrolny;

import java.util.Scanner;

public class punktKontrolny4_13   {

    public static void main (String []args) {

        int i;
        int liczba = 0;
        int total = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Program oblicza sume podanych wartosci.");


        for (i = 0; i < 7; i++) {
            System.out.println("Podaj liczbe: ");
            liczba = input.nextInt();
            total += liczba;
        }
        System.out.println("Suma podanych liczb wynosi: " + total);


    }
}
