package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_9 {

    public static void main (String []args) {

        String title1;
        String title2;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwszy tytul: ");
        title1 = input.nextLine();
        System.out.println("Podaj drugi tytul: ");
        title2 = input.nextLine();

        if (title1.compareTo(title2) < 0)
            System.out.println(title1 + ", " + title2);
        else
            System.out.println(title2 + ", " + title1);
    }
}
