package rozdzial4.PunktKontrolny;

import java.util.Scanner;

public class punktKontrolny4_4 {

    public static void main(String[] args) {

        int value;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe od 10 do 24");
        value = input.nextInt();

        while (value < 10 || value > 24)
        {
            System.out.println("Podana liczba nie znajduje sie w przedziale od 10 do 24");
            System.out.println("Podaj liczbe od 10 do 24");
            value = input.nextInt();
        }
        System.out.println("Podana wartosc to: " + value + ".");
    }
}
