package rozdzial7.Warsztat_Algorytmow;

public class warsztat_9 {

    public static void main(String[] args) {

        double total = 0.0;

        double[][] values = new double [10][20];

        for(int x = 0; x < values.length; x++) {
            for(int y = 0; y < values[x].length; y++) {
                values[x][y] = 1;

                total += values[x][y];
            }
        }
        System.out.println("Suma: " + total);
    }
}
