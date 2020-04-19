package rozdzial2;

public class zadanie19 {

    public static void main(String []args) {

        int iloscZakupionyAkcji = 1000;
        double cenaZaSztuke = 32.87;
        double prowizja = 0.02;
        double cenaZakupu;
        double wartoscProwizjiZak;
        double wartoscProwizjiSprz;
        double zysk;

        int iloscSprzedanychAkcji = 1000;
        double cenaSprzedazyZaSztuke = 33.92;
        double cenaSprzedazy;

        cenaZakupu = iloscZakupionyAkcji * cenaZaSztuke;
        wartoscProwizjiZak = cenaZakupu * prowizja;

        cenaSprzedazy = iloscSprzedanychAkcji * cenaSprzedazyZaSztuke;
        wartoscProwizjiSprz = cenaSprzedazy * prowizja;
        zysk = cenaSprzedazy - cenaZakupu - wartoscProwizjiZak - wartoscProwizjiSprz;

        System.out.println("Jacek zaplacil za akcje: " + cenaZakupu);
        System.out.println("Wartosc prowizji zaplaconej przy zakupie: " + wartoscProwizjiZak);
        System.out.println("Za sprzedaz akcji Jacek otrzymal: " + cenaSprzedazy);
        System.out.println("Wartosc prowizji zaplaconej przy sprzedazy: " + wartoscProwizjiSprz);
        System.out.println("Zysk Jacka ze sprzedazy akcji wyniosl: " + zysk);

    }
}
