package rozdzial7.Zadania_Programistyczne.Zadanie_1_Klasa_RainFall;

public class RainFall {

    /**
     This class includes rainfall level for each month stored in rainArray table and shares methods
     to calculate sum and average rainfall levels and also months with highest and lowest level
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
     * getSumRainFall method
     * @return sum of elements stored in rainArray.
     */

    public double getSumRainFall() {

        double sum = 0.0;

        for (int x = 0; x < rainArray.length; x++) {
            sum += rainArray[x];
        }
        return sum;
    }

    /**
     * getAverage method
     * @return average value of stored elements in rainArray.
     */

    public double getAverage() {

        return getSumRainFall() / months;
    }

    /**
     * getHighest method
     * @return month where rainfall level was the highest from elements stored in rainArray.
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
     * getLowest method
     * @return month where rainfall level was the lowest one from elements stored in rainArray.
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
