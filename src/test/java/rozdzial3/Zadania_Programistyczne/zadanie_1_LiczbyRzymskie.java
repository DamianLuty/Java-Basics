package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_1_LiczbyRzymskie {

    public static void main (String []args) {

        //Program po wprowadzeniu liczby od 1 do 10 wyswietla ich odpowiednik rzymski

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 10.");
        number = input.nextInt();

        /*
        switch (number)
        {
            case 1:
                System.out.println("I");
                break;
            case 2:
                System.out.println("II");
                break;
            case 3:
                System.out.println("III");
                break;
            case 4:
                System.out.println("IV");
                break;
            case 5:
                System.out.println("V");
                break;
            case 6:
                System.out.println("VI");
                break;
            case 7:
                System.out.println("VII");
                break;
            case 8:
                System.out.println("VIII");
                break;
            case 9:
                System.out.println("IX");
                break;
            case 10:
                System.out.println("X");
                break;
            default:
                System.out.println("Wybrana liczba jest niepoprawna, podaj liczbe z zakresu od 1 do 10");
        }
        */
        if (number == 1)
            System.out.println("I");
        else if (number == 2)
            System.out.println("II");
        else if (number == 3)
            System.out.println("III");
        else if (number == 4)
            System.out.println("IV");
        else if (number == 5)
            System.out.println("V");
        else if (number == 6)
            System.out.println("VI");
        else if (number == 7)
            System.out.println("VII");
        else if (number == 8)
            System.out.println("VIII");
        else if (number == 9)
            System.out.println("IX");
        else if (number == 10)
            System.out.println("X");
        else
            System.out.println("Blad, wybierz liczbe od 1 do 10.");
    }
}
