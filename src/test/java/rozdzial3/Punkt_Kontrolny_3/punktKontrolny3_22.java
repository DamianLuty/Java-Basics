package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_22 {

    public static void main (String []args) {


            String name;

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Podaj imie: ");
            name = keyboard.nextLine();

            if (name.equalsIgnoreCase("Tymoteusz"))
                System.out.println("Czy my sie znamy?");
    }
}
