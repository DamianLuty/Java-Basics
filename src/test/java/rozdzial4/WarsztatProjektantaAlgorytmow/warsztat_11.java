package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_11 {

    public static void main(String []args) {

        int value;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosc od 1 do 4.");
        value = input.nextInt();

        while (value < 0 || value > 4) {
            System.out.println("podana wartosc nie znajduje sie w przedziale od 1 do 4.");
            System.out.println("Podaj poprawna wartosc. ");
            value = input.nextInt();
        }
        System.out.println("Podana wartosc wynosi: " + value);

    }
}
