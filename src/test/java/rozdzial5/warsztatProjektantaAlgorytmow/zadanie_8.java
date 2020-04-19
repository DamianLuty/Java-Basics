package rozdzial5.warsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class zadanie_8 {

    public static void main(String[] args) {

        square(5);

    }
    private static void square(double y) {

        double x;
        x = Math.pow(y,2.0);

        System.out.println("Kwadrat podanej liczby wynosi: " + x);
    }
}
