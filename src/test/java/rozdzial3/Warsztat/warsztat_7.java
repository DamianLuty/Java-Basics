package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_7 {

    public static void main(String []args) {

        int temperature;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj temperature:  ");
        temperature = input.nextInt();

        if (temperature >= -50)
        {
            if (temperature <= 150)
                System.out.println("Liczba jest poprawna.");
            else
                System.out.println("Liczba nie znajduje sie w przedziale od -50 do 150.");
        }
        else
            System.out.println("Liczba nie znajduje sie w przedziale od -50 do 150.");
    }
}
