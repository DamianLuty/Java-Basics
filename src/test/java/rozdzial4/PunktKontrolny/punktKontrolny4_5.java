package rozdzial4.PunktKontrolny;

import java.util.Scanner;

public class punktKontrolny4_5 {

    public static void main (String []args) {

        String character;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj jedna z nastepujacyhc liter: T, t, N lub n.");
        character = input.nextLine();

        while (!character.equalsIgnoreCase("t") && !character.equalsIgnoreCase("n"))
        {
            System.out.println("Podana litera jest inna niz: T, t, N lub n.");
            System.out.println("Prosze podac jedna z wyzej wymienionych liter");
            character = input.nextLine();
        }


        System.out.println("Podana litera to: " + character);
    }
}
