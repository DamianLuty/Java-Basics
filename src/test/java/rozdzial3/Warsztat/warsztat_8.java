package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_8 {

    public static void main(String []args){

        int hours;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc godzin: ");
        hours = input.nextInt();

        if (!(hours >= 0 && hours <= 80))
            System.out.println("Liczba jest niepoprawna");
    }
}
