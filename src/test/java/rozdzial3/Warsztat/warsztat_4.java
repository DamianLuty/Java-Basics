package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_4 {

    public static void main (String []args){

        int hours;
        int minimum;

        Scanner input = new Scanner(System.in);
        System.out.println("podaj wartosc minimalna: ");
        minimum = input.nextInt();

        if(minimum < 10) {
            hours = 10;
            System.out.println("Wartosc minimalna wynosi: " + hours);
        }
        else
            System.out.println("Wartosc minimalna przekracza 10");

    }
}
