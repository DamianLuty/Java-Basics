package rozdzial3.Warsztat;


import java.util.Scanner;

public class warsztat_5 {

    public static void main(String[] args) {

        int amount1;
        int amount2;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsza wartosc: ");
        amount1 = input.nextInt();

        System.out.println("Podaj kolejna wartosc: ");
        amount2 = input.nextInt();

        if (amount1 > 10) {
            if (amount2 < 100) {
                if (amount1 == amount2)
                    System.out.println("Obie wartosci sa rowne");
                if (amount1 > amount2)
                    System.out.println("Wartosc " + amount1 + " jest wieksza od " + amount2);
                else
                    System.out.println("Wartosc " + amount2 + " jest wieksza od " + amount1);
            }
        }
        else
            System.out.println("Pierwsza wartosc jest mniejsza niz 10");
    }
}

