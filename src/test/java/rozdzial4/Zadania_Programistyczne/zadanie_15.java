package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie_15 {

    public static void main (String []args) throws IOException {

        String preview = null;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku do odczytu: ");
        String filename = keyboard.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        System.out.println("Podaj nazwe pliku do zapisu: ");
        String filename2 = keyboard.nextLine();

        File file2 = new File (filename2);

        PrintWriter outputFile = new PrintWriter(file2);

        while (inputFile.hasNext()) {

            preview = inputFile.nextLine();
            outputFile.println(preview.toUpperCase());
        }
        inputFile.close();
        outputFile.close();

    }
}
