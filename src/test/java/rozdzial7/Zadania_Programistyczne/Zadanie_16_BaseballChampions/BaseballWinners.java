package rozdzial7.Zadania_Programistyczne.Zadanie_16_BaseballChampions;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class BaseballWinners {

    public static void main (String[] args) throws FileNotFoundException {

        String teamsName;
        int championships = 0;

        ArrayList<String> winnersList = new ArrayList<>();


        File file = new File("D:/Owoce Programowania/notepad - source files/" +
                "chapter7 exercise 16 - WorldSeriesWinners.txt");

        Scanner inputFile = new Scanner(file);

        while(inputFile.hasNext()) {
            winnersList.add(inputFile.nextLine());
        }

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Program wyświetla ile razy podany przez użytkownika zespół wygrał ligę " +
                "w latach 1903 - 2009");

        do {
            System.out.println("Podaj nazwę zespołu: ");
            teamsName = keyboard.nextLine();
            if (!teamsName.matches("[.a-zA-Z ]+")) {
                System.out.println("Nazwa zespołu może skadać sie tylko z liter - cyfry i symbole nie są akceptowane.");
            }
        } while (!teamsName.matches("[.a-zA-Z ]+"));

        for (String s : winnersList) {

            int titles;

            if (teamsName.equalsIgnoreCase(s)) {
                titles = 1;
            } else {
                titles = 0;
            }
            championships += titles;
        }
        System.out.println(teamsName + " wygrała " + championships + " razy.");
    }
}
