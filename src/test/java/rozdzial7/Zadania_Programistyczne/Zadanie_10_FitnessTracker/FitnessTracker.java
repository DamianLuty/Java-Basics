package rozdzial7.Zadania_Programistyczne.Zadanie_10_FitnessTracker;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class FitnessTracker {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Double> wholeYear = new ArrayList<>();
        ArrayList<Double> January = new ArrayList<>();
        ArrayList<Double> February = new ArrayList<>();
        ArrayList<Double> March = new ArrayList<>();
        ArrayList<Double> April = new ArrayList<>();
        ArrayList<Double> May = new ArrayList<>();
        ArrayList<Double> June = new ArrayList<>();
        ArrayList<Double> July = new ArrayList<>();
        ArrayList<Double> August = new ArrayList<>();
        ArrayList<Double> September = new ArrayList<>();
        ArrayList<Double> October = new ArrayList<>();
        ArrayList<Double> November = new ArrayList<>();
        ArrayList<Double> December = new ArrayList<>();

        File file = new File
                ("D:/Owoce Programowania/notepad - source files/chapter7 exercise 10 - steps.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {

            wholeYear.add(Double.parseDouble(inputFile.nextLine()));
        }
        inputFile.close();

        get31days(wholeYear, January, 0);
        double avgJan = getAverage(January);
        get28days(wholeYear, February, 31);
        double avgFeb = getAverage(February);
        get31days(wholeYear, March, 59);
        double avgMar = getAverage(March);
        get30days(wholeYear, April, 90);
        double avgApr = getAverage(April);
        get31days(wholeYear, May, 120);
        double avgMay = getAverage(May);
        get30days(wholeYear, June, 151);
        double avgJun = getAverage(June);
        get31days(wholeYear, July,181);
        double avgJul = getAverage(July);
        get31days(wholeYear, August, 212);
        double avgAug = getAverage(August);
        get30days(wholeYear, September, 243);
        double avgSep = getAverage(September);
        get31days(wholeYear, October, 273);
        double avgOct = getAverage(October);
        get30days(wholeYear, November, 304);
        double avgNov = getAverage(November);
        get31days(wholeYear, December, 334);
        double avgDec = getAverage(December);

        System.out.println("Srednia ilosc, kroków w danym miesiącu: ");
        System.out.printf("Styczen: %.2f", avgJan);
        System.out.printf("\nLuty: %.2f", avgFeb);
        System.out.printf("\nMarzec: %.2f", avgMar);
        System.out.printf("\nKwiecien: %.2f", avgApr);
        System.out.printf("\nMaj: %.2f", avgMay);
        System.out.printf("\nCzerwiec: %.2f", avgJun);
        System.out.printf("\nLipiec: %.2f", avgJul);
        System.out.printf("\nSierpien: %.2f", avgAug);
        System.out.printf("\nWrzesien: %.2f", avgSep);
        System.out.printf("\nPazdziernik: %.2f",  avgOct);
        System.out.printf("\nListopad: %.2f", avgNov);
        System.out.printf("\nGrudzien: %.2f", avgDec);

    }

    private static void get28days(ArrayList<Double> input, ArrayList<Double> output, int inputArrayIndex) {
        for (int x = inputArrayIndex; x < (inputArrayIndex + 28); x++) {
            double steps = input.get(x);
            output.add(steps);
        }
    }

    private static void get30days(ArrayList<Double> input, ArrayList<Double> output, int inputArrayIndex) {
        for(int x = inputArrayIndex; x < (inputArrayIndex + 30); x++) {
            double steps = input.get(x);
            output.add(steps);
            }
    }

    private static void get31days(ArrayList<Double> input, ArrayList<Double> output, int inputArrayIndex) {
        for(int x = inputArrayIndex; x < (inputArrayIndex + 31); x++) {
            double steps = input.get(x);
            output.add(steps);
        }
    }

    private static double getAverage(ArrayList<Double> array2) {
        double sum = 0;

        for (int x = 0; x < array2.size(); x++) {
            double steps = array2.get(x);
            sum += steps;
        }
        return sum / array2.size();
    }
}
