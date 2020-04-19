package rozdzial5.Zadania_programistyczne;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie_14 {

    public static void main(String[] args) throws IOException {

        boolean isPrime;
        boolean b1 = true;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku do zapisu: ");
        String filename2 = keyboard.nextLine();

        File file2 = new File (filename2);

        PrintWriter outputFile = new PrintWriter(file2);

        for (int p = 1; p < 100; p++) {
            isPrime = isPrime(p);
            if (isPrime == b1) {
                outputFile.println(p);
            }
        }
        outputFile.close();
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
