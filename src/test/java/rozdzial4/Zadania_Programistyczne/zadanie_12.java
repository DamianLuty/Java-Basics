package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_12 {

    public static void main (String []args) {

        int shop1, shop2, shop3, shop4, shop5;

        Scanner input = new Scanner (System.in);
        System.out.println("Podaj dzisiejszą wartośc sprzedaży dla sklepu nr 1: ");
        shop1 = input.nextInt();
        System.out.println("Podaj dzisiejszą wartośc sprzedaży dla sklepu nr 2: ");
        shop2 = input.nextInt();
        System.out.println("Podaj dzisiejszą wartośc sprzedaży dla sklepu nr 3: ");
        shop3 = input.nextInt();
        System.out.println("Podaj dzisiejszą wartośc sprzedaży dla sklepu nr 4: ");
        shop4 = input.nextInt();
        System.out.println("Podaj dzisiejszą wartośc sprzedaży dla sklepu nr 5: ");
        shop5 = input.nextInt();

        System.out.print("Sklep nr 1: ");
        for (int x = 100; x <= shop1; x += 100) {
            System.out.print("*");
        }
        System.out.print("\n" + "Sklep nr 2: ");
        for (int x = 100; x <= shop2; x += 100) {
            System.out.print("*");
        }
        System.out.print("\n" + "Sklep nr 3: ");
        for (int x = 100; x <= shop3; x += 100) {
            System.out.print("*");
        }
        System.out.print("\n" + "Sklep nr 4: ");
        for (int x = 100; x <= shop4; x += 100) {
            System.out.print("*");
        }
        System.out.print("\n" + "Sklep nr 5: ");
        for (int x = 100; x <= shop5; x += 100)
            System.out.print("*");

    }
}
