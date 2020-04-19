package rozdzial2;

import java.util.Scanner;

public class zadanie17 {

    public static void main(String []args){

        //48 ciastek = 1,5 szklanki cukru, 1 szklanka masla, 2,75 szklanki maki
        //stworzyc program, ktory poprosi uzytkownika o podanie ilosci ciastek do wypieku i poda ilosc skadnikow

        int ileCiastek;
        double cukierNa1Ciastko = 1.5 / 48;
        double masloNa1Ciastko = 1.0 / 48;
        double makaNa1Ciastko = 2.75 / 48;
        double maka;
        double cukier;
        double maslo;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Ile ciastek chcialbys upiec? ");
        ileCiastek = keyboard.nextInt();

        cukier = ileCiastek * cukierNa1Ciastko;
        maslo = ileCiastek * masloNa1Ciastko;
        maka = ileCiastek * makaNa1Ciastko;

        System.out.println("Do wykonania ciastek, bedziesz potrzebowal nastepujacych skladnikow:" + "\n" +
                            "\n" + cukier + " szklanki cukru" +
                            "\n" + maslo + " szklanki masla" +
                            "\n" + maka + " szklanki maki");
    }
}
