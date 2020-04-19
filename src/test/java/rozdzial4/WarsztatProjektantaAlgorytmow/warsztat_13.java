package rozdzial4.WarsztatProjektantaAlgorytmow;

public class warsztat_13 {

    public static void main(String[] args) {

        final int base = 7;
        int r;
        int c;

        for (r = 0; r < base; r++)
        {
            for (c = 0; c < ( base - r); c++)
            {
               System.out.print("*");
           }
            System.out.println("");
        }
    }
}