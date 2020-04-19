package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_13_operatorTelefoniKomorkowej {

    public static void main (String []args){

        String customerPackage;
        double priceA = 39.99;
        double priceB = 59.99;
        double priceC = 69.99;
        double minutes;
        double additionalCostA;
        double additionalCostB;
        double additionalMinutesA;
        double additionalMinutesB;
        double totalCostA;
        double totalCostB;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj litere reprezentujaca Twoj pakiet (A, B lub C): ");
        customerPackage = input.nextLine();
        System.out.println("Podaj laczna liczbe minut rozmow: ");
        minutes = input.nextDouble();


        //kwota dla pakietu A
        additionalMinutesA = minutes - 450;
        additionalCostA = additionalMinutesA * 0.45;
        totalCostA = priceA+additionalCostA;

        //kwota dla pakietu B
        additionalMinutesB = minutes - 900;
        additionalCostB = additionalMinutesB * 0.40;
        totalCostB = priceA+additionalCostB;

        if (customerPackage.equalsIgnoreCase("A")){
            if(minutes <= 450)
                System.out.println("Łączna opłata za dany miesiąc wynosi: " + priceA);
            else
            System.out.println("Łączne opłaty za dany miesiąc wynoszą: " +
                                "\nabonament: " + priceA +
                                "\nOpłata za dodatkowe minuty: " + additionalCostA +
                                "\nŁącznie do zapłaty: " + totalCostA);
        }
        if (customerPackage.equalsIgnoreCase("B")){
            if(minutes <= 900)
                System.out.println("Łączna opłata za dany miesiąc wynosi: " + priceB);
            else
                System.out.println("Łączne opłaty za dany miesiąc wynoszą: " +
                        "\nabonament: " + priceB +
                        "\nOpłata za dodatkowe minuty: " + additionalCostB +
                        "\nŁącznie do zapłaty: " + totalCostB);
        }
        if (customerPackage.equalsIgnoreCase("C")){
            System.out.println("Łączna opłata za dany miesiac wynosi: " + priceC);
        }
    }
}
