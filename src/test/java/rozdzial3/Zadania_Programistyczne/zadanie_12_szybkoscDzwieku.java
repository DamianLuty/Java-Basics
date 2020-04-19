package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_12_szybkoscDzwieku {

    public static void main(String[] args) {

        //powietrze - 343  m/s
        //woda      - 1490 m/s
        //stal      - 5100 m/s

        String selection;
        double distance;
        double time;

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadz jedno z podanych slow: powietrze, woda lub stal: ");
        selection = input.nextLine();

        System.out.println("Podaj odleglosc, jaka fala dzwiekowa ma przebyc w wybranym nosniku: ");
        distance = input.nextInt();

        if (selection.equalsIgnoreCase("woda")) {
            time = distance / 1490;
            System.out.println("Czas potrzebny do pokonania odleglosci w wodzie wynosi: " + time);
        }
        if (selection.equalsIgnoreCase("powietrze")){
            time = distance / 343;
            System.out.println("Czas potrzebny do pokonania odleglosci w powietrzu wynosi: " + time);
        }
        if (selection.equalsIgnoreCase("stal")){
            time = distance / 5100;
            System.out.println("Czas potrzebny do pokonania odleglosci w stali wynosi: " + time);
        }
        else
        {
            System.out.println("Podana wartosc nie jest prawidlowa");
        }
    }
}
