package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_20 {

    public static void main (String []args) {

        int square;
        String answer = null;


        assert false;
        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj dlugosc boku kwadratu (od 1 - 15): ");
            square = input.nextInt();
            if (square >= 1 && square <= 15) {

                for (int x = 1; x <= square; x++) {
                    for (int y = 1; y < square; y++) {
                        System.out.print("X ");
                    }
                    System.out.println("X");
                }
            } else {
                System.out.println("Podana wartość nie znajduje się w przedziale od 1 do 15.");
            }
            System.out.println("Czy chcesz podać wartość ponownie? Wpisz 'tak' lub 'nie' ");
            answer = input.next();
        } while (answer.equalsIgnoreCase("tak"));
    }
}
