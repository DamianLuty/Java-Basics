package rozdzial3.Zadania_Programistyczne;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class zadanie_11_udzialWbiegu {

    public static void main(String[] args) {

        String competitor1;
        String competitor2;
        String competitor3;
        int competitor1Result;
        int competitor2Result;
        int competitor3Result;

        Scanner input = new Scanner(System.in);
        Scanner input2 = new Scanner(System.in);
        Scanner input3 = new Scanner(System.in);

        System.out.println("Podaj nazwisko pierwszego biegacza: ");
        competitor1 = input.nextLine();
        System.out.println("Podaj jego rezultat: ");
        competitor1Result = input.nextInt();

        System.out.println("Podaj nazwisko drugiego biegacza: ");
        competitor2 = input2.nextLine();
        System.out.println("Podaj jego rezultat: ");
        competitor2Result = input2.nextInt();

        System.out.println("Podaj nazwisko trzeciego biegacza: ");
        competitor3 = input3.nextLine();
        System.out.println("Podaj jego rezultat: ");
        competitor3Result = input3.nextInt();

        if (competitor1Result > competitor2Result && competitor1Result > competitor3Result) {
            if (competitor2Result > competitor3Result) {
                System.out.println(competitor1 + " time: " + competitor1Result
                        + "\n" + competitor2 + " time: " + competitor2Result
                        + "\n" + competitor3 + " time: " + competitor3Result);
            } else {
                System.out.println(competitor1 + " time: " + competitor1Result
                        + "\n" + competitor3 + " time: " + competitor3Result
                        + "\n" + competitor2 + " time: " + competitor2Result);
            }
        }
        if (competitor2Result > competitor1Result && competitor2Result > competitor3Result) {
            if (competitor1Result > competitor3Result) {
                System.out.println(competitor2 + " time: " + competitor2Result
                        + "\n" + competitor1 + " time: " + competitor1Result
                        + "\n" + competitor3 + " time: " + competitor3Result);
            } else {
                System.out.println(competitor2 + " time: " + competitor2Result
                        + "\n" + competitor3 + " time: " + competitor3Result
                        + "\n" + competitor1 + " time: " + competitor1Result);
            }
        }
        if (competitor3Result > competitor1Result && competitor3Result > competitor2Result) {
            if (competitor1Result > competitor2Result) {
                System.out.println(competitor3 + " time: " + competitor3Result
                        + "\n" + competitor1 + " time: " + competitor1Result
                        + "\n" + competitor2 + " time: " + competitor2Result);
            } else {
                System.out.println(competitor3 + " time: " + competitor3Result
                        + "\n" + competitor2 + " time: " + competitor2Result
                        + "\n" + competitor1 + " time: " + competitor1Result);
            }
        }
    }
}
