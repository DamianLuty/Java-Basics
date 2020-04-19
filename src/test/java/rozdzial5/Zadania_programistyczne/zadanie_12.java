package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_12 {

    public static void main(String[] args) {

        double m,v;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj masę obiektu w kilogramach: ");
        m = input.nextDouble();

        System.out.println("Podaj prędkość obiektu w metrach na sekundę: ");
        v = input.nextDouble();

        kineticEnergy(m, v);
    }
    private static void kineticEnergy (double m, double v) {
        double kineticEnergy;
        kineticEnergy = 0.5 * m * Math.pow(v,2);
        System.out.println("Energia kinetyczna obiektu wynosi: " + kineticEnergy);
    }
}
