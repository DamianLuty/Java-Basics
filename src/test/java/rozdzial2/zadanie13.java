package rozdzial2;

import java.util.Scanner;

public class zadanie13 {

        public static void main(String []args) {

            double podatek = 0.0675;
            double procentNapiwku = 0.2;
            double cenaPosilku;
            double lacznaCenaDoZaplaty;
            double wartoscPodatku;
            double napiwek;

            Scanner keyboard = new Scanner(System.in);
            System.out.println("Prosze wprowadzic cene posilku: ");
            cenaPosilku = keyboard.nextDouble();

            wartoscPodatku = cenaPosilku * podatek;
            napiwek = cenaPosilku * procentNapiwku;
            lacznaCenaDoZaplaty = cenaPosilku + podatek + napiwek;

            System.out.println("Cena posilku: " + cenaPosilku +
                                "\nPodatek: " + wartoscPodatku +
                                "\nNapiwek: " + napiwek +
                                "\nŁączna cena do zapłaty: " + lacznaCenaDoZaplaty);

        }
}
