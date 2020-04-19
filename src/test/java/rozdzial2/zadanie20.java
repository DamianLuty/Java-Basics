package rozdzial2;

import java.util.Scanner;

public class zadanie20  {

    public static void main(String []args) {

        double liczbaSadzonek;
        double dlugoscRzedu;
        double iloscOkratowanegoMiejsca;
        double odlegloscMiedzySadzonkami;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj dlugosc rzedu w metrach: ");
        dlugoscRzedu = keyboard.nextDouble();

        System.out.println("Podaj ilosc miejsca zajmowanego przez okratownie: ");
        iloscOkratowanegoMiejsca = keyboard.nextDouble();

        System.out.println("Podaj odleglosc miedzy sadzonkami w metrach: ");
        odlegloscMiedzySadzonkami = keyboard.nextDouble();

        liczbaSadzonek = (dlugoscRzedu - 2 * iloscOkratowanegoMiejsca) / odlegloscMiedzySadzonkami;

        System.out.println("Liczba sadzonek jaka zmiesci sie w rzedzie to: " + liczbaSadzonek);
    }
}
