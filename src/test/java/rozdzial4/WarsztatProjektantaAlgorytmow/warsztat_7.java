package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_7 {

    public static void main(String[] args) {

        //Przeksztalc ponizszy petle na do-while

        /*Scanner input = new Scanner(System.in);
        int x = 1;
        while (x > 0)
        {
            System.out.println("Podaj liczbe: ");
            x = input.nextInt();
        }
         */

        int x = 1;
        Scanner input = new Scanner(System.in);

        do {
            System.out.println("Podaj liczbe: ");
            x = input.nextInt();
        }
        while (x > 0);


    }
}