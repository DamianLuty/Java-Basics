package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_8 {

    public static void main(String[] args) {
        //przeksztalc petle do-while z ponizszego kodu w petle while

        /* Scanner keyboard = new Scanner(System.in);
        String input;
        char sure;

        do
        {
            System.out.println("Na pewno chcesz zakonczyc prace? ");
            input = keyboard.next();
            sure = input.charAt(0);
        }
        while (sure != 'T' && sure != 'N');

         */

        Scanner key = new Scanner(System.in);
        String input;
        String sure = " ";

        while (!sure.equalsIgnoreCase("T") && !sure.equalsIgnoreCase("N")) {
            System.out.println("Na pewno chcesz zakonczyc prace? ");
            sure = key.next();


        }
    }
}