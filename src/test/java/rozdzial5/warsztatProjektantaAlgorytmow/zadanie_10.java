package rozdzial5.warsztatProjektantaAlgorytmow;

public class zadanie_10 {

    public static void main (String []args) {

        quartersToDollars(9);

    }
    private static void quartersToDollars(int x) {

        double quarters = 0.25;
        double howManyQuarters;

        howManyQuarters = quarters * x;
        System.out.println("Wartość podanej liczby wynosi: " + howManyQuarters);

    }
}
