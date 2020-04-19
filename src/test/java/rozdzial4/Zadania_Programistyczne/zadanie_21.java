package rozdzial4.Zadania_Programistyczne;

import java.util.Random;

public class zadanie_21 {

    public static <computer> void main(String[] args) {

        int computer;
        int user;
        int userWin = 0;
        int comWin = 0;
        int draw = 0;

        Random random = new Random();

        for (int x = 1; x < 11; x++) {

            computer = random.nextInt(6) + 1;
            // System.out.println(computer);
            user = random.nextInt(6) + 1;
            // System.out.println(user + "\n");

            if (computer > user)
                comWin++;
            else if (user > computer)
                userWin++;
            else
                draw++;
        }
        if (comWin > userWin) {
            System.out.println("Komputer wygrał");
            System.out.println("liczba wygranych komputera: " + comWin);
            System.out.println("liczba wygranych uzytkownika: " + userWin);
            System.out.println("liczba remisów: " + draw);
        } else {
            System.out.println("Uzytkownik wygrał");
            System.out.println("liczba wygranych uzytkownika: " + userWin);
            System.out.println("liczba wygranych komputera: " + comWin);
            System.out.println("liczba remisów: " + draw);
        }
    }
}
