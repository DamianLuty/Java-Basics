package rozdzial7.Warsztat_Algorytmow;

public class warsztat_2 {

    public static void main(String []args) {

        int[] numberArray1 = new int[100];

        int[] numberArray2 = new int[100];

        for (int x = 0; x < numberArray1.length; x++) {
            numberArray1[x] = x + 1;
        }

        for (int x = 0; x < numberArray2.length; x++) {
            numberArray2[x] = numberArray1[x];
            System.out.println(numberArray2[x]);
        }

    }
}
