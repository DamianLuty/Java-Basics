package rozdzial3.Punkt_Kontrolny_2;

import java.util.Scanner;

public class punktKontrolny3_13 {

    public static void main (String []args) {

        int x;
        int y;
        int z;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartosc x: ");
        x = keyboard.nextInt();

        System.out.println("Podaj wartosc y: ");
        y = keyboard.nextInt();

        if (x > 0)
        {
            if (y < 20)
                z = 1;
            else
                z = 0;
            System.out.println(z);
        }

    }
}
