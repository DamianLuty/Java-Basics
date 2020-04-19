package rozdzial7.Warsztat_Algorytmow;

public class warsztat_8 {

    public static void main(String[] args) {

        int[][] numberArray = new int [9] [11];

        for(int x = 0; x < 1; x++) {
            for(int y = 0; y < numberArray[x].length; y++) {
                numberArray[x][y] = 145;
                System.out.println("Pozycja [" + x + "]" + " [" + y + "]" + " : " + numberArray[x][y]);
            }
        }
        System.out.println();
        System.out.println();

        for(int x = numberArray.length - 1; x < numberArray.length; x++) {
            for(int y = 0; y < numberArray[x].length; y++) {
                numberArray[x][y] = 18;
                System.out.println("Pozycja [" + x + "]" + " [" + y + "]" + " : " + numberArray[x][y]);
            }
        }
    }
}
