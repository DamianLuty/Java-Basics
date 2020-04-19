package rozdzial2;

public class zadanie15 {

    public static void main(String []args) {

        int iloscAkcji = 600;
        double cenaAkcji = 21.77;
        double prowizja = 0.02;
        double kwotaZaAkcje;
        double wysokoscProwizji;
        double lacznaKwota;

        kwotaZaAkcje = iloscAkcji * cenaAkcji;

        wysokoscProwizji = prowizja * kwotaZaAkcje;

        lacznaKwota = kwotaZaAkcje + wysokoscProwizji;

        System.out.println("Kwota zaplacona za same akcje (bez prowizji) " + kwotaZaAkcje + " PLN");
        System.out.println("Wysokosc prowizji wynosi: " + wysokoscProwizji + " PLN");
        System.out.println("Laczna kwota(cena akcji + prowizja) " + lacznaKwota + " PLN");

    }
}
