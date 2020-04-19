package rozdzial6.ZadaniaProgramistyczne.zadanie15;

import rozdzial6.ZadaniaProgramistyczne.zadanie10.Die;

public class DieGameDemo {

    public static void main(String[] args) {

        int playerScore = 0, computerScore = 0;
        int playerPoint = 0, computerPoint = 0;
        int playerDie, computerDie;

        Die die1 = new Die();
        Die die2 = new Die();

        for (int x = 1; x <= 10; x++) {
            playerDie = die1.rollDie();
            computerDie = die2.rollDie();

            if(playerDie > computerDie) {
                playerPoint = 1;
                computerPoint = 0;
            } else if (playerDie == computerDie) {
                playerPoint = 0;
                computerPoint = 0;
            } else {
                computerPoint = 1;
                playerPoint = 0;
            }
            playerScore += playerPoint;
            computerScore += computerPoint;
        }

        System.out.println("Wygrane rundy uzytkownika: " + playerScore);
        System.out.println("Wygrane rundy komputera: " + computerScore);

        if(playerScore > computerScore) {
            System.out.println("Wygrywa uzytkownik!");
        } else {
            System.out.println("Wygrywa komputer!");
        }
    }
}
