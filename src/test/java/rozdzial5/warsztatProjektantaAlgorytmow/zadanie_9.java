package rozdzial5.warsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class zadanie_9 {

    public static void main (String []args) {

        getName();
    }
        private static void getName() {

        String name;
        Scanner input = new Scanner(System.in);
            System.out.println("Podaj swoje imię: ");
            name = input.nextLine();

            System.out.println("Masz na imię: " + name);
    }
}
