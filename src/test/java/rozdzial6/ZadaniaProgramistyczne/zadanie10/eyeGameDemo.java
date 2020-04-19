package rozdzial6.ZadaniaProgramistyczne.zadanie10;

import java.util.Scanner;

public class eyeGameDemo {

    public static void main(String[] args) {

        String answer = "";
        String player1;
        int playerRoll_1;
        int playerRoll_2;
        int computerRoll_2;
        int computerRoll_1;
        int playerSum = 0;
        int compSum = 0;

        //utworzenie nazwy gracza i przypisanie tej wartosci do odpowiedniego pola
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        player1 = input.nextLine();

        Players players = new Players();

        players.setPlayerName(player1);
        players.setComputerName();

        System.out.println("Imie gracza: " + players.getPlayerName());
        System.out.println("Imie przeciwnika: " + players.getComputerName());

        //stworzenie instancji klacy kostki i wywolanie metody, ktora odpowiada za rzut kostka
        Die die = new Die();
        System.out.println();
        System.out.println("Pierwszy rzut wykonany.");
        System.out.println();

        do {
            playerRoll_1 = die.rollDie();
            playerRoll_2 = die.rollDie();

            computerRoll_1 = die.rollDie();
            computerRoll_2 = die.rollDie();

            playerSum += playerRoll_1 + playerRoll_2;
            compSum += computerRoll_1 + computerRoll_2;


                if ((playerSum <= 21) && (compSum <= 21)) {
                    System.out.println("Czy chcesz zwiększyć ilość punktów i rzucić jeszcze raz? (odpowiedz 'Tak')");
                    answer = input.next();
                }

        } while (answer.equalsIgnoreCase("Tak") && playerSum < 22 && compSum < 22);

        System.out.println("KONIEC GRY");
        System.out.println("Wynik gracza: " + playerSum);
        System.out.println("Wynik komputera: " + compSum);


        if ((playerSum > compSum) && (playerSum <= 21)) {
            System.out.println(players.getPlayerName() + " wygrywa, GRATULACJE !!!");
        } else if (compSum > 21) {
            System.out.println(players.getPlayerName() + " wygrywa, GRATULACJE !!!");
        } else if (playerSum == compSum) {
            System.out.println("REMIS");
        } else {
            System.out.println(players.getComputerName() + " wygrywa");
        }
    }
}
