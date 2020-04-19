package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_10_kalkulatorKaloriiZtluszczu {

    public static void main(String []args) {

        double calories;
        double fatWeight;
        double fatCalories;
        double percentageFromCalories;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe kalorii w produkcie: ");
        calories = input.nextDouble();
        System.out.println("Podaj wage (w gramach) tluszczow znajdujacych sie w produkcie: ");
        fatWeight = input.nextDouble();

        fatCalories = fatWeight * 9;
        percentageFromCalories = (fatCalories/calories)*100;

        if (fatCalories > calories) {
            System.out.println("Dane wejsciowe sa nieprawidlowe.");
        }
        else
            System.out.println("Procent kalorii pochodzacych z tlusczy wynosi: " + percentageFromCalories + "%");

        if (percentageFromCalories < 30.0)
            System.out.println("Produkt jest niskotluszczowy.");
    }
}
