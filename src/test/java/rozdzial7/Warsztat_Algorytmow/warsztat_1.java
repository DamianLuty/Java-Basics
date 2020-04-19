package rozdzial7.Warsztat_Algorytmow;

public class warsztat_1 {

    public static void main(String[] args) {

        //tworzenie tablicy o wielkosci 20 elementow
        int[] names = new int[20];

        //inicjowanie tablicy liczbami calkowitymi i wyswietlanie elementow tablicy
        for(int x = 0; x < names.length; x++){
            names[x] = x + 1;
            System.out.println(names[x]);
        }
    }
}
