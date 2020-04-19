package rozdzial2;

public class zadanie16 {

    public static void main(String []args) {

        int iloscKonsumentow = 12467;
        double jedenNapojEnergetycznyTygodniowo = 0.14;
        double smakCystrusowy = 0.64;
        double konsKupujacySmakCytrusowy;
        double konsumenciKupujacy1Energetyka;

        konsKupujacySmakCytrusowy = iloscKonsumentow * smakCystrusowy;
        konsumenciKupujacy1Energetyka = iloscKonsumentow * jedenNapojEnergetycznyTygodniowo;

        System.out.println("\n\nPrzyblizona liczba ankietowanych osob kupujacych przynajmmniej jednego energetyka" +
                            " wynosi: " + konsumenciKupujacy1Energetyka +
                            "\n \nPrzyblizona liczba osob, ktore preferuja napoj energetyczny o smaku cytrusowym" +
                            " wynosi: " + konsKupujacySmakCytrusowy);
    }
}

