package rozdzial5.Zadania_programistyczne;

import java.util.Random;

public class zadanie_15 {

    public static void main(String[] args) {
        int number;
        boolean isEven;
        boolean b1 = true;
        int countTrue = 0;
        int countFalse = 0;

        Random randomNumber = new Random();

        for (int i = 0; i < 100; i++) {
            number = randomNumber.nextInt(100) + 1;
            isEven = isEven(number);
            if (isEven == b1) {
                countTrue++;
            } else {
                countFalse++;
            }
        }
        System.out.println("Liczb parzystych jest: " + countTrue);
        System.out.println("Liczb nieparzystych jest: " + countFalse);
    }

    private static boolean isEven(int number) {
        if((number % 2) == 0){
            return true;
        } else {
            return false;
        }
    }
}
