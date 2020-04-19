package rozdzial5.Zadania_programistyczne;

/*
Program wyswietla prosbe o wprowadzenie odleglosci w metrach. Nastepnie wyswietla menu z wyborem konwersji:
na kilometry, cale lub stopy, umozliwia rowniez wyjscie s programu.
 */

import java.util.Scanner;

public class zadanie_8 {

    public static void main(String[] args) {

        String menu;
        int meters, select;
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość w metrach, którą chcesz przeliczyć: ");
        meters = input.nextInt();

        if (meters < 0) {
            System.out.println("Podana wartość nie może być ujemna!");
            System.out.println("Podaj poprawną wartość w metrach, którą chcesz przeliczyć: ");
            meters = input.nextInt();
        }

        menu();

        System.out.println("\nPodaj wybraną opcję: ");
        select = input.nextInt();

        if (select == 1) {
            showKilometers(meters);
        } else if (select == 2) {
            showInches(meters);
        } else if (select == 3) {
            showFeet(meters);
        } else if (select == 4) {
            System.out.println("Żegnaj");
        } else {
            System.out.println("Błąd programu, wybrano opcję niedostępną w menu.");
        }
    }

    private static void showKilometers(int meters) {
        double kilometers;
        kilometers = meters * 0.001;
        System.out.println(meters + " metrów w kilometrach to " + kilometers);
    }

    private static void showInches(int meters) {
        double inches;
        inches = meters * 39.37;
        System.out.println(meters + " metrów w calach to " + inches);
    }

    private static void showFeet(int meters) {
        double feet;
        feet = meters * 3.281;
        System.out.println(meters + " metrów w stopach to " + feet);
    }

    private static void menu() {
        System.out.println("\n1. konwersja na kilometry,");
        System.out.println("2. konwersja na cale,");
        System.out.println("3. konwersja na stopy,");
        System.out.println("4. wyjście z programu.");
    }
}
