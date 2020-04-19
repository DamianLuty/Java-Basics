package rozdzial3.Warsztat;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class warsztat_1 {

    public static void main(String[] args) {

    int x;
    int y;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj x");
        y = keyboard.nextInt();


        if (y == 0)
        {
            x = 100;
            System.out.println(x);

        }
        else
            System.out.println("Wartosc jest mniejsza niz 100");
    }
}