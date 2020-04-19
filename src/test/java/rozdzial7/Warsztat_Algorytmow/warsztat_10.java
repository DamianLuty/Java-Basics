package rozdzial7.Warsztat_Algorytmow;

public class warsztat_10 {

    public static void main (String[] args) {

        int[][] days = new int[29][5];

        int rows = 0, columns = 0;

        for(int x = 0; x < days.length; x++) {
            for(int y =0; y < days[x].length; y++) {
                days[x][y] = 1;
            }
        }

        for(int x = 0; x < days.length; x++) {
            rows += days[x][0];
        }

        for(int x = 0; x < 1; x++) {
            for(int y = 0; y < days[x].length; y++) {
                columns += days[x][y];
            }
        }

        System.out.println("Suma wierszy: " + rows);
        System.out.println("Suma kolumn: " + columns);
    }
}
