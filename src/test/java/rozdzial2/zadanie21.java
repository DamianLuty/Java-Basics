package rozdzial2;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie21 {

    public static void main(String []args) {

        double kwotaNaKonciePoLatach;
        double zdeponowanaKwota;
        double rocznaStopaProcentowaPodanaPrzezUzytkownika;
        double rocznaStopaProcentowa;
        double kapitalizacjaOdsetek;
        double liczbaLat;
        double potega;
        double kwota;
        double suma;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ile chcialbys zdeponowac pieniedzy? ");
        zdeponowanaKwota = keyboard.nextDouble();

        System.out.println("Podaj stope procentowa: ");
        rocznaStopaProcentowaPodanaPrzezUzytkownika = keyboard.nextDouble();

        rocznaStopaProcentowa = rocznaStopaProcentowaPodanaPrzezUzytkownika / 100;
        System.out.println(rocznaStopaProcentowa);

        System.out.println("Ile razy w roku odestki beda kapitalizowane?");
        kapitalizacjaOdsetek = keyboard.nextInt();

        System.out.println("Podaj liczbe lat, przez jakie srodki beda znajdowac sie i generowac odsetki:");
        liczbaLat = keyboard.nextInt();

        potega = kapitalizacjaOdsetek + liczbaLat;

        kwotaNaKonciePoLatach = (1 + rocznaStopaProcentowa / kapitalizacjaOdsetek);
        System.out.println(kwotaNaKonciePoLatach);
        kwota = Math.pow(kwotaNaKonciePoLatach, potega);
        System.out.println(kwota);

        suma = zdeponowanaKwota * kwota;



        System.out.println("Kwota jaka znajdzie sie na koncie po podanym okresie bedzie wynosic: " +
                            suma  + " PLN");

            }
}
