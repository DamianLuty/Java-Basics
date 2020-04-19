package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_6 {

    public static void main(String[] args) {

        int grade;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj jakas liczbe: ");
        grade = input.nextInt();

        if (grade > 0)
        {
            if (grade < 100)
                System.out.println("Liczba jest poprawna");
            else
                System.out.println("Liczba nie znajduje sie w przedziale od 0 do 100.");
        }
        else
            System.out.println("Liczba nie znajduje sie w przedziale od 0 do 100.");
    }
}