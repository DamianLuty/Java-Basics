package rozdzial5.Zadania_programistyczne;

public class zadanie_5 {

    //odleglosc w czasie oblicza sie za pomoca d = 0,5gt2
    // d - odleglosc w metrach
    // g - to stala 9,8
    // t- czas spadania w sekundach

    public static void main(String[] args) {

        double length;

        for (int x = 1; x <= 10; x++) {

            length = failingTime(x);
            System.out.println(length);
        }
    }

    private static double failingTime(double t) {

        double g = 9.8;
        double d;

        return d = 0.5 * g * (t * t);
    }
}
