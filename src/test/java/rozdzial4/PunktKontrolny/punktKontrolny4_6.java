package rozdzial4.PunktKontrolny;

import java.sql.SQLOutput;
import java.util.Scanner;

public class punktKontrolny4_6 {

    public static void main (String []args) {

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj odpowiedz Tak lub Nie");
        answer = input.nextLine();

        while (!answer.equalsIgnoreCase("Tak") && !answer.equalsIgnoreCase("Nie"))
        {
            System.out.println("Podana wartosc jest nieprawidlowa.");
            System.out.println("Prosze podac odpowiedz Tak lub Nie:");
            answer = input.nextLine();
        }
    }
}
