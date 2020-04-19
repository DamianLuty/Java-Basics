package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_15_oplatyBankowe {

    public static void main(String[] args) {

        int cheques;
        int defaultPrice = 10;
        double additionalCosts;
        double totalPrice;
        double price;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe czekow wystawionych w danym miesiacu: ");
        cheques = input.nextInt();

        if (cheques >= 60) {
            additionalCosts = cheques * 0.04;
            totalPrice = additionalCosts + defaultPrice;
            System.out.println("Oplata pobrana w tym miesiacu wynosi: " + totalPrice + " zł.");
        } else if (cheques >= 40) {
            additionalCosts = cheques * 0.06;
            totalPrice = additionalCosts + defaultPrice;
            System.out.println("Oplata pobrana w tym miesiacu wynosi: " + totalPrice + " zł.");
        } else if (cheques >= 20) {
            additionalCosts = cheques * 0.08;
            totalPrice = additionalCosts + defaultPrice;
            System.out.println("Oplata pobrana w tym miesiacu wynosi: " + totalPrice + " zł.");
        } else {
            additionalCosts = cheques * 0.10;
            price = additionalCosts + defaultPrice;
            System.out.println("Oplata pobrana w tym miesiacu wynosi: " + price + " zł.");
        }
    }
}


