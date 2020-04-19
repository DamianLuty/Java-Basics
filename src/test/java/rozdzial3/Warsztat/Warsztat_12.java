package rozdzial3.Warsztat;

public class Warsztat_12 {

    public static void main (String []args) {

        double number = 12345.6789;
        int number2 = 1234567;

        //warsztat 12
        System.out.printf("%.1f", number);
        System.out.println();

        //warsztat 13
        System.out.printf("%,.2f", number);
        System.out.println();

        //warsztat 14
        System.out.printf("%,d", number2);
    }
}
