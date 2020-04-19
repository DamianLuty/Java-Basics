package rozdzial2;

import java.util.Scanner;

public class zadanie10 {

    public static void main(String[] args) {

        int wynik1Testu;
        int wynik2Testu;
        int wynik3Testu;
        int  srednia;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wynik pierwszego testu: ");
        wynik1Testu = keyboard.nextInt();

        System.out.println("podaj wynik drugiego testu: ");
        wynik2Testu = keyboard.nextInt();

        System.out.println("Podaj wynik trzeciego testu: ");
        wynik3Testu = keyboard.nextInt();

        srednia = (wynik1Testu + wynik2Testu + wynik3Testu) / 3;

        System.out.println("Twoj wynik z poszczegolnych testow wyglada nastepujaco:" +
                            "\n     \nWynik testu 1: " + wynik1Testu +
                            "\nWynik testu 2: " + wynik2Testu +
                            "\nWynik testu 3: " + wynik3Testu +
                            "\n     \nSrednia ze wszystkich testow wynosi: " + srednia) ;

    }

}
