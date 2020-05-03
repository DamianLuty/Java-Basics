package rozdzial7.Zadania_Programistyczne.Zadanie_12_GasPrice;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class GasPrice {

    public static void main(String[] args) throws FileNotFoundException {

        double[] gasAverages = new double[52];

        File file = new File
                ("D:/Owoce Programowania/notepad - source files/" +
                        "chapter7 exercise 12 - 1994_Weekly_Gas_Averages.txt");

        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            for (int x = 0; x < gasAverages.length; x++)
                gasAverages[x] = Double.parseDouble(inputFile.nextLine());
        }
        inputFile.close();

        getLowest(gasAverages);
        System.out.println("**************************************");
        getHighest(gasAverages);
        System.out.println("**************************************");
        //Average values for each month based on "gasAverages" array
        getAverage(gasAverages, 4); // January
        getAverage(gasAverages, 8); // February
        getAverage(gasAverages, 13); // March
        getAverage(gasAverages, 17); // April
        getAverage(gasAverages, 21); // May
        getAverage(gasAverages, 26); // June
        getAverage(gasAverages, 30); // July
        getAverage(gasAverages, 35); // August
        getAverage(gasAverages, 39); // September
        getAverage(gasAverages, 43); // October
        getAverage(gasAverages, 47); // November
        getAverage(gasAverages, 51); // December
    }

    public static void getLowest(double[] array) {
        double lowest = array[0];
        int week = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] < lowest) {
                lowest = array[x];
                week = x + 1;
            }
        }
        System.out.println("Najniższa srednia wartosc to: " + lowest);
        System.out.println("wystąpiła w tygodniu: " + week);
        getMonth(week);
    }

    public static void getHighest(double[] array) {
        double highest = array[0];
        int week = 0;

        for (int x = 0; x < array.length; x++) {
            if (array[x] > highest) {
                highest = array[x];
                week = x + 1;
            }
        }
        System.out.println("Najwyższa srednia wartość to: " + highest);
        System.out.println("Wystąpiła w tygodniu: " + week);
        getMonth(week);
    }

    public static void getMonth(int week) {
        if (week >= 0 && week <= 4) {
            System.out.println("Miesiąc: Styczeń");
        } else if (week >= 5 && week <= 8) {
            System.out.println("Miesiąc: Luty");
        } else if (week >= 9 && week <= 13) {
            System.out.println("Miesiac: Marzec");
        } else if (week >= 14 && week <= 17) {
            System.out.println("Miesiąc: Kwiecień");
        } else if (week >= 18 && week <= 21) {
            System.out.println("Miesiąc: Maj");
        } else if (week >= 22 & week <= 26) {
            System.out.println("Miesiąc: Czerwiec");
        } else if (week >= 27 && week <= 30) {
            System.out.println("Miesiąc: Lipiec");
        } else if (week >= 31 && week <= 35) {
            System.out.println("Miesiąc: Sierpień");
        } else if (week >= 36 && week <= 39) {
            System.out.println("Miesiąc: Wrzesień");
        } else if (week >= 40 && week <= 43) {
            System.out.println("Miesiąc: Pażdziernik");
        } else if (week >= 44 && week <= 47) {
            System.out.println("Miesiąc: Listopad");
        } else if (week >= 48 && week <= 51) {
            System.out.println("Miesiąc: Grudzień");
        } else
            System.out.println("Do tablicy wczytana została większa ilość danych niż 52");
    }

    public static void getAverage(double[] array, int lastWeekOfTheMonth) {
        double value;
        double total = 0.0;
        double avg;
        int count = 0;

        for(int x = 0; x <= lastWeekOfTheMonth; x++) {
            value = array[x];
            total += value;
            count++;
        }
        avg = total/count;
        getMonth(lastWeekOfTheMonth);
        System.out.printf(" - " + "średnia wartość w miesiącu: %.2f" ,avg);
        System.out.print("\n");
    }
}
