package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_14_operatorTelefoniiKomorkowejCz2 {

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
            double discountA;
            double discountB;

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj litere reprezentujaca Twoj pakiet (A, B lub C): ");
            customerPackage = input.nextLine();
            System.out.println("Podaj laczna liczbe minut rozmow: ");
            minutes = input.nextDouble();


            //kwota dla pakietu A
            additionalMinutesA = minutes - 450;
            additionalCostA = additionalMinutesA * 0.45;
            totalCostA = priceA+additionalCostA;
            discountA = totalCostA - priceB;

            //kwota dla pakietu B
            additionalMinutesB = minutes - 900;
            additionalCostB = additionalMinutesB * 0.40;
            totalCostB = priceA+additionalCostB;
            discountB = totalCostB - priceC;

            if (customerPackage.equalsIgnoreCase("A")){
                if(minutes <= 450)
                    System.out.println("Łączna opłata za dany miesiąc wynosi: " + priceA + " zł");
                else
                    System.out.println("Łączne opłaty za dany miesiąc wynoszą: " +
                            "\nabonament: " + priceA + " zł" +
                            "\nOpłata za dodatkowe minuty: " + additionalCostA + " zł" +
                            "\nŁącznie do zapłaty: " + totalCostA  + " zł");
                if (totalCostA > 59.99)
                    System.out.println("Jezeli wybralbys pakiet B, zaoszczedzilbys: " + discountA + " zł");
            }
            if (customerPackage.equalsIgnoreCase("B")){
                if(minutes <= 900)
                    System.out.println("Łączna opłata za dany miesiąc wynosi: " + priceB + " zł");
                else
                    System.out.println("Łączne opłaty za dany miesiąc wynoszą: " + " zł" +
                            "\nabonament: " + priceB + " zł" +
                            "\nOpłata za dodatkowe minuty: " + additionalCostB + " zł" +
                            "\nŁącznie do zapłaty: " + totalCostB + " zł");
                if (totalCostB > 69.99)
                    System.out.println("Jezeli wybralbys pakiet C, zaoszczedzilbys: " + discountB + " zł");
            }
            if (customerPackage.equalsIgnoreCase("C")){
                System.out.println("Łączna opłata za dany miesiac wynosi: " + priceC + " zł");
            }
        }
}

