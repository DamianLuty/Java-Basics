package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zadanie_14 {

    public static void main(String[] args) throws IOException {

        String filename;
        int x = 1;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku: ");
        filename = input.nextLine();

        File file = new File(filename);
        if (!file.exists()) {
            System.out.println("Podany plik" + filename + "nie istnieje!");
            System.exit(0);
        }

        Scanner inputFile = new Scanner(file);
        while (inputFile.hasNext()) {
            String line = inputFile.nextLine();
            System.out.print(x++ + ". ");
            System.out.println(line);
        }
        inputFile.close();
    }
}