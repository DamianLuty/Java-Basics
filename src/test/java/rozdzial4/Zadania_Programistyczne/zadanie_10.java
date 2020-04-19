package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_10 {

    public static void main(String[] args) {

        int number1, number2, number3, number4;
        String repeat;

        do {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj serie 4 liczb calkowitych.");

            System.out.println("Podaj pierwsza liczbę: ");
            number1 = input.nextInt();

            System.out.println("Podaj drugą liczbę: ");
            number2 = input.nextInt();

            System.out.println("Podaj trzecią liczbę: ");
            number3 = input.nextInt();

            System.out.println("Podaj czwartą liczbę: ");
            number4 = input.nextInt();

            input.nextLine();

            if (number1 > number2 && number1 > number3 && number1 > number4)
                System.out.println("Największa z podanych liczb to: " + number1);
            else if (number2 > number1 && number2 > number3 && number2 > number4)
                System.out.println("Największa z podanych liczb to: " + number2);
            else if (number3 > number1 && number3 > number2 && number3 > number4)
                System.out.println("Największa z podanych liczb to: " + number3);
            else
                System.out.println("Największa z podanych liczb to: " + number4);

            if (number1 < number2 && number1 < number3 && number1 < number4)
                System.out.println("Najmniejsza z podanych liczb to: " + number1);
            else if (number2 < number1 && number2 < number3 && number2 < number4)
                System.out.println("Najmniejsza z podanych liczb to: " + number2);
            else if (number3 < number1 && number3 < number2 && number3 < number4)
                System.out.println("Najmniejsza z podanych liczb to: " + number3);
            else
                System.out.println("Najmniejsza z podanych liczb to: " + number4);

            System.out.println("Jeżeli chcesz zakończyć serię wpisz -99");
            repeat = input.next();

        } while (!repeat.equals("-99"));
    }
}
