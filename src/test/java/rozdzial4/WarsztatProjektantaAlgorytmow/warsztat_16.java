package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Random;

public class warsztat_16 {

    public static void main (String []args) {

        Random a = new Random();

        for (int x = 0; x < 10; x++){
            int b = a.nextInt(2);
            if (b == 1)
                System.out.println("Tak");
            else
                System.out.println("Nie");
        }
    }
}
