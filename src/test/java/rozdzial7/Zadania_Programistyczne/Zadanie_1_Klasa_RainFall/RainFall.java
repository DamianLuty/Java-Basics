package rozdzial7.Zadania_Programistyczne.Zadanie_1_Klasa_RainFall;

public class RainFall {

    /**
     Ta klasa przechowuje w tablicy wartosci opadow deszcze w danym roku i udostepnia metody do
     obliczania sumy oraz średniej wartości opadów jak rownież miesiące z najwyzszym i najnizszym poziomem opadow.
     */

    private double[] rainArray;
    private final double months = 12.0;


    public RainFall(double[] array) {
        rainArray = new double[array.length];

        for (int x = 0; x < array.length; x++) {
            rainArray[x] = array[x];
        }
    }

    /**
     * Metoda getSumRainFall
     * @return Suma elementow przechowywanych w tablicy rainArray.
     */

    public double getSumRainFall() {

        double sum = 0.0;

        for (int x = 0; x < rainArray.length; x++) {
            sum += rainArray[x];
        }
        return sum;
    }

    /**
     * Metoda getAverage
     * @return Srednia wartosc wszystkich elementow tablicy rainArray.
     */

    public double getAverage() {

        return getSumRainFall() / months;
    }

    /**
     * Metoda getHighest
     * @return Miesiac z najwieksza wartoscia przechowaywana w tablicy rainArray.
     */

    public double getHighest() {

        double highest = rainArray[0];
        int month = 0;

        for (int x = 0; x < rainArray.length; x++) {

            if (rainArray[x] > highest) {
                highest = rainArray[x];
                month = x + 1;
            }
        }
        return month;
    }

    /**
     * Metoda getLowest
     * @return Miesiac z najmniejsza wartoscia przechowaywana w tablicy rainArray.
     */

    public double getLowest() {

        double lowest = rainArray[0];
        int month = 0;

        for (int x = 0; x < rainArray.length; x++) {

            if (rainArray[x] < lowest) {
                lowest = rainArray[x];
                month = x + 1;
            }
        }
        return month;
    }
}
