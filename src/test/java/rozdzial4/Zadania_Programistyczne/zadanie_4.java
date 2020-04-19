package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_4 {

    public static void main (String []args) {

        int workingDays;
        int salary = 1;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ilosc przepracowanych dni:");
        workingDays = input.nextInt();

        if (workingDays < 1)
            System.out.println("Podana wartosc jest niepoprawna!");
        else
        {
            System.out.println("Przepracowane dni" + "\t \t" + "Wynagrodzenie");
            System.out.println("---------------------------------------");
            System.out.println("\t \t" + "1" + "\t \t \t \t \t" + salary);
            for (int x = 2; x <= workingDays; x++) {
                salary = salary * 2;
                System.out.println("\t \t" + x + "\t \t \t \t \t" + salary);
                sum = salary + sum;
            }
            System.out.println("---------------------------------------");
            System.out.println("Łącznie do zapłaty: " + "\t \t" + (sum+1));
        }
    }
}
