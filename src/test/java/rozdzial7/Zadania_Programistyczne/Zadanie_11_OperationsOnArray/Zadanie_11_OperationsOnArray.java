package rozdzial7.Zadania_Programistyczne.Zadanie_11_OperationsOnArray;

public class Zadanie_11_OperationsOnArray {

    public static void main (String[] args) {

        double[] numbers = {20.5, 30.1, 40.5, 27.1};

        getTotal(numbers);
        getAverage(numbers);
        getHighest(numbers);
        getLowest(numbers);
    }

    public static void getTotal(double[] array) {
        double total = 0.0;
        double arrayValue;

        for(int x = 0; x < array.length; x++) {
            arrayValue = array[x];
            total += arrayValue;
        }
        System.out.printf("Suma wartosci tablicy wynosi: %.2f", total);
    }

    public static void getAverage(double[] array) {
        double arrayValue;
        double total = 0.0;

        for(int x = 0; x < array.length; x++) {
            arrayValue = array[x];
            total += arrayValue;
        }
        System.out.printf("\nSrednia wartosc tablicy wynosi: %.2f" ,(total/array.length));
    }

    public static void getHighest(double[] array) {
        double highestValue = array[0];

        for(int x = 0; x < array.length; x++) {
            if(array[x] >= highestValue) {
                highestValue = array[x];
            }
        }
        System.out.println("\nNajwieksza wartosc tablicy to: " + highestValue);
    }

    public static void getLowest(double[] array) {
        double lowestValue = array[0];

        for(int x = 0; x < array.length; x++) {
            if(array[x] <= lowestValue) {
                lowestValue = array[x];
            }
        }
        System.out.println("Najmniejsza wartosc tablicy to: " + lowestValue);
    }
}
