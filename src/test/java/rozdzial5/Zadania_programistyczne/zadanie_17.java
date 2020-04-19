package rozdzial5.Zadania_programistyczne;

import java.util.Random;
import java.util.Scanner;

public class zadanie_17 {

    public static void main(String[] args) {

        int computerSelection;
        int userSelection;

        do {
        userSelection = userSelection();
        computerSelection = computerSelection();

            selectionDisplay(userSelection, computerSelection);
            winnerDisplay(userSelection, computerSelection);
        } while (userSelection == computerSelection);
    }
    private static int computerSelection() {

        int computer;

        Random random = new Random();
        computer = random.nextInt(3) + 1;
        return computer;
    }
    private static int userSelection() {

        int userSelection;

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz jedną z podanych opcji: ");
        System.out.println("1. Kamień");
        System.out.println("2. Nożyce");
        System.out.println("3. Papier");

        userSelection = input.nextInt();
        return userSelection;
    }
    private static void selectionDisplay(int userSelection, int computerSelection) {

        //wybór użytkownika
        if (userSelection == 1) {
            System.out.println("Wybór użytkownika: Kamień");
        } else if (userSelection == 2) {
            System.out.println("Wybór użytkowniak: Nożyce");
        } else {
            System.out.println("Wybór użytkownika: Papier");
        }
        if (computerSelection == 1) {
            System.out.println("Wybór użytkownika: Kamień");
        } else if (computerSelection == 2) {
            System.out.println("Wybór użytkowniak: Nożyce");
        } else {
            System.out.println("Wybór użytkownika: Papier");
        }
    }
    private static void winnerDisplay(int userSelection, int computerSelection) {

        if (userSelection == 1 && computerSelection == 2) {
            System.out.println("Zwycięzca: Użytkownik");
        } else if (userSelection == 1 && computerSelection == 3) {
            System.out.println("Zwycięzca: Komputer");
        } else if (userSelection == 2 && computerSelection == 1) {
            System.out.println("Zwycięzca: Komputer");
        } else if (userSelection == 2 && computerSelection == 3) {
            System.out.println("Zwycięzca: Użytkownik");
        } else if (userSelection == 3 && computerSelection == 1) {
            System.out.println("Zwycięzca: Użytkownik");
        } else if (userSelection == 3 && computerSelection == 2) {
            System.out.println("Zwycięzca: Komputer");
        } else {
            System.out.println("Remis, grę trzeba powtórzyc, aby wyłonić zwycięzcę.");
        }
    }
}
