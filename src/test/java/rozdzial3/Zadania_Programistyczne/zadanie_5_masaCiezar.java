package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_5_masaCiezar {

    public static void main (String []args) {

        double masa;
        double ciezar;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj masę badanego obiektu: ");
        masa = input.nextInt();

        ciezar = masa * 9.8;

        if (ciezar > 1000)
            System.out.println("Obiekt jest za ciezki.");
        else if (ciezar < 10)
            System.out.println("Obiekt jest za lekki.");
        else
            System.out.println("Obiekt ma idealna wage.");
    }
}
