package rozdzial7.Zadania_Programistyczne.Zadanie_1_Klasa_RainFall;

import java.util.Scanner;

public class RainFall_Demo {

    //Demo with Rainfall class usage

    public static void main(String[] args) {

        final int months = 12;

        //creating a new table
        double[] array = new double[months];

        Scanner input = new Scanner(System.in);

        //instruction for monthly input excluding negative values
        for(int x = 0; x < array.length; x++) {
            System.out.println("Podaj wartość opadów dla miesiąca " + (x + 1) + ":");
            array[x] = input.nextDouble();
            if (array[x] < 0) {
                System.out.println("Podana wartość nie może być mniejsza niż 0!");
                System.out.println("Podaj poprawną wartość:");
                array[x] = input.nextDouble();
            }
        }
        //new instance of RainFall object
        RainFall rainFall = new RainFall(array);

        //Display for whole year and average rainfall level and also months with lowest and highest level
        System.out.println("Łączny poziom opadów z danego roku wynosi: " + rainFall.getSumRainFall());
        System.out.println("Średni miesięczny poziom opadów wynosi: " + rainFall.getAverage());
        System.out.println("Miesiąc o najwyższym poziomie opadów to: " + rainFall.getHighest());
        System.out.println("Miesiąc o najniższym poziomie opadów to: " + rainFall.getLowest());
    }
}
