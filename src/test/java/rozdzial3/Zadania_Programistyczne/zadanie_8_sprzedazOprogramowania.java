package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_8_sprzedazOprogramowania {

    public static void main(String[] args) {

        int softwarePrice = 99;
        int softwarePackages;
        double totalPrice;


        Scanner input = new Scanner(System.in);
        System.out.println("Proszę podać liczbę zakupionych pakietów: ");
        softwarePackages = input.nextInt();


        if (softwarePackages < 0 ) {
            System.out.println("wprowadzona wartosc jest niepoprawna.");
        }
        else if (softwarePackages < 10 ) {
            totalPrice = softwarePrice * softwarePackages;
            System.out.println("Kwota zakupu: " + totalPrice + "zł.");
        } else if (softwarePackages  < 20) {
            totalPrice = softwarePrice * softwarePackages * 0.8;
            System.out.println("Przyznany rabat wynosi: 20 %"
                    + "\nKwota zakupu po rabacie: " + totalPrice + " zł.");
        } else if (softwarePackages <= 49) {
            totalPrice = softwarePrice * softwarePackages * 0.7;
            System.out.println("Przyznany rabat wynosi: 30 %"
                    + "\nKwota zakupu po rabacie: " + totalPrice + " zł.");
        } else if (softwarePackages <= 99) {
            totalPrice = softwarePrice * softwarePackages * 0.6;
            System.out.println("Przyznany rabat wynosi: 40 %"
                    + "\nKwota zakupu po rabacie: " + totalPrice + " zł.");
        } else {
            totalPrice = softwarePrice * softwarePackages * 0.5;
            System.out.println("Przyznany rabat wynosi: 50 %"
                    + "\nKwota zakupu po rabacie: " + totalPrice + " zł.");
        }

    }
}
