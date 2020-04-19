package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_13 {

    public static void main(String[] args) {

        int p;
        boolean isPrime;
        boolean b1 = true;
        boolean b2 = false;


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj sprawdzaną wartość: ");
        p = input.nextInt();

        isPrime = isPrime(p);

        if(isPrime == b1) {
            System.out.println(p + " jest liczbą naturalną.");
        } else if (isPrime == b2)
            System.out.println(p + " nie jest liczbą naturalną.");
    }

    private static boolean isPrime(int p) {
        int i;

        for (i = 2; i < p; i++) {
            if (p % i == 0) {
                return false;
            }
        }
        return true;
    }
}
