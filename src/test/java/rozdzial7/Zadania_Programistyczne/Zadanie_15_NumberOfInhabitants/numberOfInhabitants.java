package rozdzial7.Zadania_Programistyczne.Zadanie_15_NumberOfInhabitants;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class numberOfInhabitants {

    public static void main(String[] args) throws FileNotFoundException {

        ArrayList<Integer> population = new ArrayList<>();
        ArrayList<Integer> populationGrowth = new ArrayList<>();

        File file = new File("D:/Owoce Programowania/notepad - source files/" +
                "chapter7 exercise 15  - USPopulation.txt");

        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext()) {
            population.add(Integer.parseInt(inputFile.nextLine()));
        }
        inputFile.close();

        getPopulationGrowth(population, populationGrowth);
        System.out.printf("Średni przyrost populacji w latach 1950 - 1990 wynosi: %.2f tysięcy",
                avgPopulation(populationGrowth));
        getHighest(populationGrowth);
        getLowest(populationGrowth);
    }

    public static void getPopulationGrowth(ArrayList<Integer> array, ArrayList<Integer> populationGrowth) {
        int growth;
        populationGrowth.add(0, 0);

        for (int x = 0; x < array.size(); x++) {
            if (x == 40) {
                break;
            } else {
                growth = array.get(x + 1) - array.get(x);
                populationGrowth.add(growth);
            }
        }
    }

    public static double avgPopulation(ArrayList<Integer> populationGrowth) {
        double value;
        double total = 0;

        for(int x = 0; x < populationGrowth.size(); x++) {
            value = populationGrowth.get(x);
            total += value;
        }
        return total/populationGrowth.size();
    }

    public static void getHighest(ArrayList<Integer> populationGrowth) {
        int highest = populationGrowth.get(0);
        int year = 0;

        for(int x = 0; x < populationGrowth.size(); x++) {
            if(populationGrowth.get(x) > highest) {
                highest = populationGrowth.get(x);
                year = x;
            }
        }
        System.out.println("\nNajwiększy przyrost był w " + (1950 + year) + "r. - " + highest + " tysięcy");
    }

    public static void getLowest(ArrayList<Integer> populationGrowth) {
        int lowest = populationGrowth.get(1);
        int year = 0;

        for(int x = 1; x < populationGrowth.size(); x++) {
            if(populationGrowth.get(x) < lowest) {
                lowest = populationGrowth.get(x);
                year = x;
            }
        }
        System.out.println("Najmniejszy przyrost był w " + (1950 + year) + "r. - " + lowest + " tysięcy");
    }
}



