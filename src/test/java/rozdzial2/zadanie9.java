package rozdzial2;

import java.util.Scanner;

public class zadanie9 {

        public static void main(String []args) {

            double przejechaneKilometry;
            double litryPaliwa;
            double liczbaPrzejechanychKilometrow;

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Podaj liczbe przejechanych kilometrow: ");
            przejechaneKilometry = keyboard.nextInt();

            System.out.println("Podaj liczbe zuzytych litrow paliwa: ");
            litryPaliwa = keyboard.nextInt();


            liczbaPrzejechanychKilometrow = przejechaneKilometry / litryPaliwa;

            System.out.println("Liczba kilometro przejechanych na 1 litrze wynosi " + liczbaPrzejechanychKilometrow + " km");

        }
}
