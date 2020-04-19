package rozdzial2;

import java.util.Scanner;

public class zadanie7 {

    public static void main(String []args) {

        double podatekStanowy, podatekLokalny, kupowanyProdukt, lacznaSumaWrazZPodatkiem;


        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartosc kupowanego produktu: ");
        kupowanyProdukt = keyboard.nextDouble();

        podatekStanowy = kupowanyProdukt * 0.04;
        podatekLokalny = kupowanyProdukt * 0.02;
        lacznaSumaWrazZPodatkiem = kupowanyProdukt + podatekLokalny + podatekStanowy;

        System.out.println("Wartosc produktu wynosi: " + kupowanyProdukt +
                            "\nPodatek Stanowy wynosi: " + podatekStanowy +
                            "\nPodatek Lokalny wynosi: " + podatekLokalny +
                            "\nLaczna suma wartosci produktu wynosi: " + lacznaSumaWrazZPodatkiem);

    }
}
