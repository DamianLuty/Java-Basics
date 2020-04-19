package rozdzial3.Zadania_Programistyczne;


import java.util.Scanner;

public class zadanie_2_MagiczneDaty {

    public static void main (String []args) {

        int day;
        int month;
        int year;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dzien, miesiac i rok (w przypdaku roku tylko 2 ostatnie cyfry.");
        day = input.nextInt();
        month = input.nextInt();
        year = input.nextInt();

        if (day * month == year)
            System.out.println("Ta data jest magiczna");
        else
            System.out.println("Ta data nie jest magiczna");

    }
}
