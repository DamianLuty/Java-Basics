package rozdzial7.Zadania_Programistyczne.Zadanie_14_MostPopularNames;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class MostPopularNames {

    public static void main(String[] args) throws FileNotFoundException {

        String boyName, girlName;

        ArrayList<String> boys = new ArrayList<>();
        ArrayList<String> girls = new ArrayList<>();

        File boyNames = new File("D:/Owoce Programowania/notepad - source files/" +
                "chapter7 exercise 14 - BoyNames.txt");
        File girlNames = new File("D:/Owoce Programowania/notepad - source files/" +
                "chapter7 exercise 14 - GirlNames.txt");

        Scanner inputFileBoys = new Scanner(boyNames);
        Scanner inputFileGirls = new Scanner(girlNames);

        while (inputFileBoys.hasNext()) {
            boys.add(inputFileBoys.nextLine());
        }

        while (inputFileGirls.hasNext()) {
            girls.add(inputFileGirls.nextLine());
        }

        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Wprowadź imię męskie aby sprawdzić, czy znajdowało się na " +
                    "liście najbardziej popularnych imion w 2009r. :");
            boyName = keyboard.nextLine();
            if (!boyName.matches("[a-zA-Z]+"))
                System.out.println("Imię nie może zawierać cyfr ani znaków specjalnych!");

            } while (!boyName.matches("[a-zA-Z]+"));
        getName(boys, boyName);

        System.out.println("\nCzy chcesz sprawdzić również imię żeńskie?");
        String answer = keyboard.nextLine();

        if(answer.equalsIgnoreCase("Tak")) {
            do {
                System.out.println("Wprowadź imię żeńskie aby sprawdzić, czy znajdowało się na " +
                        "liście najbardziej popularnych imion w 2009r. :");
                girlName = keyboard.nextLine();
                if (!girlName.matches("[a-zA-Z]+"))
                    System.out.println("Imię nie może zawierać cyfr ani znaków specjalnych!");

            } while (!girlName.matches("[a-zA-Z]+"));
            getName(girls, girlName);
        } else {
            System.out.println("PROGRAM ZOSTAŁ ZAMKNIĘTY!");
        }
    }

    public static void getName(ArrayList<String> array, String name) {
        for (String result : array) {
            if (name.equalsIgnoreCase(result)) {
                System.out.println("Imię " + name + " znajdowało się na liście najbardziej popularnych imion w 2009r.");
                break;
            } else {
                System.out.println("Podane imię nie znajdowało się na liście najbardziej popularnych imion.");
                break;
            }
        }
    }
}
