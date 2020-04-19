package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_9 {

    public static void main (String []args) {

        int initialPopulation;
        int increase;
        int days;
        double sum = 0;
        double population = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę początkową populacji organizmów:");
        initialPopulation = input.nextInt();

        System.out.println("Podaj przyrost populacji w procentach: ");
        increase = input.nextInt();

        System.out.println("Podaj liczbę dni przez jakie będą się rozmnażały dane organizy: ");
        days = input.nextInt();

        if (initialPopulation < 2)
            System.out.println("Podana wartość jest niepopawna - nie może być mniejsza od 2!");
        else if (increase < 0)
            System.out.println("Podana wartość jest niepoprawna - nie może być mniejsza od 0!");
        else if (days < 1)
            System.out.println("Podana wartość jest niepoprawna - nie możeby być mniejsza od 1!");
        else
            for (int x = 1; x <= days; x++) {
                sum = ((initialPopulation + sum) * increase) / 100;
                population += sum;
                System.out.println("Populacja na dzień " + x + ": " + population);
            }
    }
}
