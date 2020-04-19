package rozdzial2;

import java.util.Scanner;

public class zadanie14 {

    public static void main(String []args) {

        double liczbaKobiet;
        double liczbaMezczyzn;
        double lacznaLiczbaUczestnikow;
        double odsetekKobiet;
        double odsetekMezczyzn;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Prosze o wprowadzenie liczby kobiet zarejestrowanych na kurs: ");
        liczbaKobiet = keyboard.nextDouble();

        System.out.println("Prosze o wprowadzenie liczby mezczyzn zarejestrowanych na kurs: ");
        liczbaMezczyzn = keyboard.nextDouble();

        lacznaLiczbaUczestnikow = liczbaKobiet + liczbaMezczyzn;

        odsetekKobiet = (liczbaKobiet / lacznaLiczbaUczestnikow) * 100;
        odsetekMezczyzn = (liczbaMezczyzn / lacznaLiczbaUczestnikow) * 100;

        System.out.println("Odsetek kobiet zarejestrowanych na kurs wynosi: " + odsetekKobiet + "%" +
                            "\nOdsetek mezczyzn zarejestrowanych na kurs wynosi: " + odsetekMezczyzn + "%");

    }
}
