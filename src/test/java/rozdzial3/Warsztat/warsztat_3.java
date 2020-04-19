package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_3 {

    public static void main(String[] args) {

        double sales;
        double commission;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosc sprzedazy");
        sales = input.nextDouble();

        if (sales < 10000)
        {
            commission = 0.10;
            System.out.println("Wartosc prowizji wynosi: " + commission);
        }
        else if (sales < 15000)
        {
            commission = 0.15;
            System.out.println("Wartosc prowizji wynosi: " + commission);
        }
        else
        {
            commission = 0.20;
            System.out.println("Wartosc prowizji wynosi: " + commission);
        }
    }
}
