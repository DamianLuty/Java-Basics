package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_10 {

    public static void main(String[] args) {
        double LA, CZ, PZ, CS, PS;
        double profit;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę akcji: ");
        LA = input.nextDouble();

        System.out.println("Podaj cenę zakupu: ");
        CZ = input.nextDouble();

        System.out.println("Podaj kwotę prowizji od zakupu: ");
        PZ = input.nextDouble();

        System.out.println("Podaj cenę sprzedaży: ");
        CS = input.nextDouble();

        System.out.println("Podaj kwotę prowizji: ");
        PS = input.nextDouble();

        profit = profit(LA, CZ, PZ, CS, PS);

        if(profit > 0 ) {
            System.out.println("Zysk wynosi " + profit);
        } else {
            System.out.println("Strata wyniosła: " + profit);
        }
    }
    private static double profit(double LA, double CZ, double PZ, double CS, double PS) {
        double profit;
        return profit = ((LA * CZ) - PZ) - ((LA * CS) + PS);
    }
}
