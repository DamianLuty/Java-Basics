package rozdzial3.Punkt_Kontrolny_2;

import java.util.Scanner;

public class punktKontrolny3_12 {

    public static void main(String []args) {

    int amount1;
    int amount2;

    Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsza wartosc: ");
    amount1 = keyboard.nextInt();

        System.out.println("Podaj druga wartosc: ");
    amount2 = keyboard.nextInt();

        if(amount1 > 10)
    {
        if (amount2 < 100)
        {
            if(amount1 > amount2)
                System.out.println(amount1);
            else
                System.out.println(amount2);
        }

    }
    System.exit(0);
    }
}

