package rozdzial2;

import java.util.Scanner;

public class zadanie11 {

    public static void main(String []args) {

        double zysk;
        double marza;
        double cenaDetaliczna;

        marza = 0.4;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj cene detaliczna plytki: ");
        cenaDetaliczna = keyboard.nextDouble();

        zysk = cenaDetaliczna * marza;

        System.out.println("Zysk ze sprzedazy tego produktu wyniesie: " + zysk + "PLN");
    }
}
