package rozdzial4.Zadania_Programistyczne;

import java.util.Random;
import java.util.Scanner;

public class zadanie_22 {

    public static void main(String[] args) {

        // 0 - wisnie
        // 1 - pomarancze
        // 2 - śliwki
        // 3 - dzwonki
        // 4 - melony
        // 5 - bary

        int amount;
        int picture1, picture2, picture3;
        int winningPrice;
        String answer;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Za jaką kwotę chcesz obstawić: ");
            amount = input.nextInt();

            Random random = new Random();
            picture1 = random.nextInt(5);
            picture2 = random.nextInt(5);
            picture3 = random.nextInt(5);

            //obrazek 1
            if (picture1 == 0)
                System.out.println("Wiśnie");
            else if (picture1 == 1)
                System.out.println("Pomarańcze");
            else if (picture1 == 2)
                System.out.println("Śliwki");
            else if (picture1 == 3)
                System.out.println("Dzwonki");
            else if (picture1 == 4)
                System.out.println("Melony");
            else
                System.out.println("Pomarańcze");

            //obrazek 2
            if (picture2 == 0)
                System.out.println("Wiśnie");
            else if (picture2 == 1)
                System.out.println("Pomarańcze");
            else if (picture2 == 2)
                System.out.println("Śliwki");
            else if (picture2 == 3)
                System.out.println("Dzwonki");
            else if (picture2 == 4)
                System.out.println("Melony");
            else
                System.out.println("Pomarańcze");

            //obrazek 3
            if (picture3 == 0)
                System.out.println("Wiśnie");
            else if (picture3 == 1)
                System.out.println("Pomarańcze");
            else if (picture3 == 2)
                System.out.println("Śliwki");
            else if (picture3 == 3)
                System.out.println("Dzwonki");
            else if (picture3 == 4)
                System.out.println("Melony");
            else
                System.out.println("Pomarańcze");

            if (picture1 == picture2 && picture1 == picture3)
                winningPrice = amount * 3;
            else if (picture1 == picture2 || picture1 == picture3)
                winningPrice = amount * 2;
            else if (picture2 == picture3)
                winningPrice = amount * 2;
            else
                winningPrice = 0;

            System.out.println("Wygrtałeś: " + winningPrice + " zł.");;

            System.out.println("Czy chcesz zagrac jeszcze raz? Wpisz 'tak' lub 'nie' ");
            answer = input.next();

        } while (answer.equalsIgnoreCase("tak"));
    }
}
