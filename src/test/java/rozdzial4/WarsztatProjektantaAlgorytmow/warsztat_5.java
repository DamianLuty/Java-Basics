package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_5 {

    public static void main (String []args) {

        double total = 0;

        for (int x = 1, y = 30; x < 30; x++, y-- )
            total += x/y;
        System.out.println(total);

    }
}
