package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_16 {

    //program oblicza na podstawie wprowadzonych danych przez uzytkownika, jaka kwote musi zdeponowac, aby po pewnym
    //okresie czasu otrzymac kwote jaka uzytkownik chcialbym miec na swoim koncie

    public static void main(String[] args) {

        double F; //wartosc przyszla
        double r; //roczna stopa procentowa
        double n; //liczba lat
        double presentValue;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj kwotę jaką chciałbyś uzyskać na koncie: ");
        F = input.nextInt();

        System.out.println("Podaj roczną stopę procentową: ");
        r = input.nextDouble();

        System.out.println("Podaj w jakim okresie czasu chciałbyś uzyskać wczesniej podaną kwotę: ");
        n = input.nextDouble();

        presentValue = presentValue(F,r,n);
        System.out.printf("Wartość jaką musisz zdeponować wynosi: " + "%5.2f%n", presentValue);
    }
    private static double presentValue(double F, double r, double n) {
        double P; //obliczanie wartości bieżącej;
        double R = r * 0.01;

        return P = F / Math.pow((1 + R),n);
    }
}
