package rozdzial2;

import java.util.Scanner;

public class zadanie8 {

    public static void main(String []args) {

        int iloscCiastekWPudelku,
                iloscPorcji,
                iloscKaloriiWPorcji,
                iloscCiastekWPorcji,
                zjedzoneCiastka,
                iloscSpozytychKalorii,
                iloscKaloriiWJednymCiastku;

        iloscCiastekWPudelku = 40;
        iloscPorcji = 10;
        iloscCiastekWPorcji = iloscCiastekWPudelku / iloscPorcji;
        iloscKaloriiWPorcji = 300;
        iloscKaloriiWJednymCiastku = iloscKaloriiWPorcji / iloscCiastekWPorcji;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ile zjadles dzisiaj ciastek?");
        zjedzoneCiastka = keyboard.nextInt();


        iloscSpozytychKalorii = zjedzoneCiastka * iloscKaloriiWJednymCiastku;

        System.out.println("Zjadles dzisiaj " +
                            iloscSpozytychKalorii + " kcal.");

        System.exit(0);

    }
}
