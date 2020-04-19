package rozdzial7.Warsztat_Algorytmow;

public class warsztat_4 {

    public static void main(String[] args) {

        String[] countries =  new String[12];
        int[]  population = new int[12];

        countries[0] = "Polska";
        countries[1] = "Włochy";
        countries[2] = "Hiszpania";
        countries[3] = "Francja";
        countries[4] = "Niemcy";
        countries[5] = "Wielka Brytania";
        countries[6] = "Rosja";
        countries[7] = "Stany Zjednoczone";
        countries[8] = "Belgia";
        countries[9] = "Holandia";
        countries[10] = "Argentyna";
        countries[11] = "Brazylia";

        population = new int[] {2, 4, 6, 8, 10, 12, 14, 16, 18, 20, 22, 24};

        System.out.println("Ludnosć w danym kraju wynosi: ");
        for(int x = 0; x < countries.length; x++) {
            System.out.println(countries[x] + ": " + population[x]);
        }
    }
}
