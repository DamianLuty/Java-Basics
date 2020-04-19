package rozdzial6.ZadaniaProgramistyczne.zadanie9;

import java.util.Scanner;

public class MonthDaysDemo {

    public static void main(String[] args) {

        int month;
        int year;
        int days;

        Scanner input = new Scanner(System.in);

        System.out.println("Podaj miesiąc: ");
        month  = input.nextInt();

        System.out.println("Podaj rok: ");
        year = input.nextInt();

        MonthDays monthDays = new MonthDays(month, year);

        days = monthDays.leapYear(month, year);

        System.out.println(days + " dni");
    }
}
