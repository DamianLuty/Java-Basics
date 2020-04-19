package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_21 {

    public static void main(String []args) {

        String name1;
        String name2;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie: ");
        name1 = keyboard.nextLine();

        System.out.println("Podaj drugie imie: ");
        name2 = keyboard.nextLine();

        if (name1.compareTo(name2) < 0)
            System.out.println(name1 + ", " + name2);
        else
            System.out.println(name2 + ", " + name1);
    }
}
