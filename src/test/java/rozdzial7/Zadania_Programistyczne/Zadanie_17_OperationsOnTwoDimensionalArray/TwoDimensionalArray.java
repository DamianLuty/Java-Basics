package rozdzial7.Zadania_Programistyczne.Zadanie_17_OperationsOnTwoDimensionalArray;

public class TwoDimensionalArray {

    public static void main (String[] args) {

        int[][] array = new int[3][3];
        int value = 0;

        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array.length; y++) {
                array[x][y] = value;
                value++;
            }
        }
        System.out.println("Suma wszystkich wartośći tablicy wynosi: " + getTotal(array));
        System.out.println("Suma podanego wiersza wynosi: " + getRowTotal(array, 0));
        System.out.println("Suma podanej kolumny wynosi: " + getColumnTotal(array, 0));
        System.out.println("Najwieksza wartosc w podanym wierszu to: " + getHighestInRow(array, 2));
        System.out.println("Najmniejsza wartosc w podanym wierszu to: " + getLowestInRow(array, 0));
    }

    public static int getTotal(int[][] array) {
        int sum = 0;
        int value;

        for(int x = 0; x < array.length; x++) {
            for(int y = 0; y < array.length; y++) {
                value = array[x][y];
                sum += value;
            }
        }
        return sum;
    }

    public static int getRowTotal(int[][] array, int row) {
        int rowSum = 0;
        int value;

        for(int x = row; x == row; x++)  {
            for(int y = 0; y < array[row].length; y++) {
                value = array[row][y];
                rowSum += value;
            }
        }
        return rowSum;
    }

    public static int getColumnTotal(int[][] array, int column) {
        int columnSum = 0;
        int value;

        for(int x = 0; x < array.length; x++) {
            for(int y = column; y == column; y++ ) {
                value = array[x][column];
                columnSum += value;
            }
        }
        return columnSum;
    }

    public static int getHighestInRow(int[][] array, int row) {
        int highest = array[row][0];

        for(int x = row; x == row; x++) {
            for(int y = 0; y < array[row].length; y++) {
                if(highest < array[row][y]) {
                    highest = array[row][y];
                }
            }
        }
        return highest;
    }

    public static int getLowestInRow(int[][] array, int row) {
        int lowest = array[row][0];

        for (int x = row; x == row; x++) {
            for(int y = 0; y < array[row].length; y++) {
                if(lowest < array[row][0])
                    lowest = array[row][0];
            }
        }
        return lowest;
    }
}
