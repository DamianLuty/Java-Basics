package rozdzial7.Warsztat_Algorytmow;

public class warsztat_3 {

    public static void main (String[] args) {

        int surnameLength;
        int sum = 0;

        //inicjacja tablicy typu String
        String[] surnames = {"Einstein", "Newton", "Kopernik", "Kepler"};

        //pętla do wyświetlania wszystkich elementów tablicy surnames
        for(int x =0; x < surnames.length; x++) {
            System.out.println(surnames[x]);
        }

        //obliczanie długości każdego elementu tablicy i sumowanie łącznej długości znaków
        for(int y = 0; y < surnames.length; y++) {
            surnameLength = surnames[y].length();
            sum += surnameLength;
        }
        System.out.println("Suma wszystkich znaków w tej tablicy wynosi: " + sum);
        //test
    }
}
