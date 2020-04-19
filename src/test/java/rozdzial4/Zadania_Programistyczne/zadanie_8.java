package rozdzial4.Zadania_Programistyczne;

// Program oblicza sredni poziom opadow w cm dla kazdego miesiaca w okresie podanym w latach przez uzytkownika.


import java.util.Scanner;

public class zadanie_8 {

    public static void main(String[] args) {

        int years;
        int rainfall;
        int rainfallLevelSum = 0;
        int January = 0, February = 0, March = 0, April = 0, May = 0,
                June = 0, July = 0, August = 0, September = 0, October = 0, November = 0, December = 0;
        double month1 = 0, month2 = 0, month3 = 0, month4 = 0, month5 = 0, month6 = 0, month7 = 0,
                month8 = 0, month9 = 0, month10 = 0, month11 = 0, month12 = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę lat, dla których ma zostać obliczona statystyka opadów: ");
        years = input.nextInt();

        if (years < 1) {
            System.out.println("Podana wartość jest niepoprawna!");
            System.out.println("Podaj wartość ponownie.");
        } else {
            for (int x = 1; x <= years; x++) {
                for (int y = 1; y <= 12; y++) {
                    System.out.println("Podaj liczbę centymentrów opadów w miesiącu " + y + ": ");
                    rainfall = input.nextInt();
                    if (rainfall < 0) {
                        System.out.println("Podana wartość nie może być ujemna!");
                    } else {
                        rainfallLevelSum += rainfall;
                    }
                    if (y == 1)
                        January = rainfall;
                    else if (y == 2)
                        February = rainfall;
                    else if (y == 3)
                        March = rainfall;
                    else if (y == 4)
                        April = rainfall;
                    else if (y == 5)
                        May = rainfall;
                    else if (y == 6)
                        June = rainfall;
                    else if (y == 7)
                        July = rainfall;
                    else if (y == 8)
                        August = rainfall;
                    else if (y == 9)
                        September = rainfall;
                    else if (y == 10)
                        October = rainfall;
                    else if (y == 11)
                        November = rainfall;
                    else
                        December = rainfall;
                }
                month1 += January;
                month2 += February;
                month3 += March;
                month4 += April;
                month5 += May;
                month6 += June;
                month7 += July;
                month8 += August;
                month9 += September;
                month10 += October;
                month11 += November;
                month12 += December;
            }
            System.out.println("\n" +"Liczba miesięcy: " + (years * 12));
            System.out.println("Łączna wartość opadów: " + rainfallLevelSum);
            System.out.println("Średnia wartość opadów dla poszczególnych miesięcy wynosi: " + "\n");
            System.out.println("Styczeń: " + month1 / years);
            System.out.println("Luty: " + month2 / years);
            System.out.println("Marzec: " + month3 / years);
            System.out.println("Kwiecień: " + month4 / years);
            System.out.println("Maj: " + month5 / years);
            System.out.println("Czerwiec: " + month6 / years);
            System.out.println("Lipiec: " + month7 / years);
            System.out.println("Sierpień: " + month8 / years);
            System.out.println("Wrzesień: " + month9 / years);
            System.out.println("Październik: " + month10 / years);
            System.out.println("Listopad: " + month11 / years);
            System.out.println("Grudzień: " + month12 / years);
        }
    }
}