package rozdzial5.Zadania_programistyczne;

import java.util.Random;
import java.util.Scanner;

public class zadanie_18 {

    public static void main(String[] args) {

        int userSelection;
        int computerSelection;
        int count = 0;

        userSelection = userSelection();

        for (int i = 1; i <= 10; i++) {
            computerSelection = computerSelection();
            computerDisplay(computerSelection); {
            }
            if (userSelection == computerSelection) {
                count++;
            }
        }
        System.out.println("Wybrarny kolor powtorzył się " + count + " raz/y");
    }
    private static int userSelection() {
        int user;

        Scanner input = new Scanner(System.in);
        System.out.println("Jaki Twoim zdaniem kolor wybrał komputer?");
        System.out.println("1. Czerwony" +
                "\n2. Zielony" +
                "\n3. Niebieski" +
                "\n4. Pomarńczowy" +
                "\n5. Żółty");
        user = input.nextInt();
        return user;
    }

    private static int computerSelection() {
        int computer;
        Random random = new Random();
        computer = random.nextInt(5) + 1;
        return computer;
    }
    private static void computerDisplay(int computerSelection) {

        if (computerSelection == 1) {
            System.out.println("Czerwony");
        } else if (computerSelection == 2) {
            System.out.println("Zielony");
        } else if (computerSelection == 3) {
            System.out.println("Niebieski");
        } else if (computerSelection == 4) {
            System.out.println("Pomarańczowy");
        } else if (computerSelection == 5) {
                System.out.println("Żółty");
            }
        }
    }