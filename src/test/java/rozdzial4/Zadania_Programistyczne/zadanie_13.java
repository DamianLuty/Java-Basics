package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zadanie_13 {

    public static void main (String []args) throws IOException {

        String filename;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku: ");
        filename = input.nextLine();

        File file = new File (filename);
        if (!file.exists()) {
            System.out.println("Podany plik" + filename + "nie istnieje!");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);

        String line1 = inputFile.nextLine();
        System.out.println(line1);
        String line2 = inputFile.nextLine();
        System.out.println(line2);
        String line3 = inputFile.nextLine();
        System.out.println(line3);
        if (inputFile.hasNextLine()) {
            String line4 = inputFile.nextLine();
            System.out.println(line4);
        }
        if (inputFile.hasNextLine()) {
            String line5 = inputFile.nextLine();
            System.out.println(line5);
        }
        inputFile.close();
    }
}
