package rozdzial7.Zadania_Programistyczne.Zadanie_1_Klasa_RainFall;

import java.util.Scanner;

public class RainFall_Demo {

    public static void main(String[] args) {

        final int months = 12;

        double[] array = new double[months];

        Scanner input = new Scanner(System.in);

        for(int x = 0; x < array.length; x++) {
            System.out.println("Podaj wartość opadów dla miesiąca " + (x + 1) + ":");
            array[x] = input.nextDouble();
        }

        RainFall rainFall = new RainFall(array);

        System.out.println("Łączny poziom opadów z danego roku wynosi: " + rainFall.getSumRainFall());
        System.out.println("Średni miesięczny poziom opadów wynosi: " + rainFall.getAverage());
        System.out.println("Miesiąc o najwyższym poziomie opadów to: " + rainFall.getHighest());
        System.out.println("Miesiąc o najniższym poziomie opadów to: " + rainFall.getLowest());
    }

}
