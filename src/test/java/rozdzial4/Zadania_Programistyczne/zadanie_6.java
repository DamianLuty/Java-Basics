package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class zadanie_6 {

    public static void main (String []args) throws IOException {

        int count =0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj nazwe pliku: ");
        String filename = input.nextLine();

        File file = new File(filename);
        Scanner inputFile = new Scanner(file);

        if (!file.exists()) {
            System.out.println("nie znaleziono pliku" + filename);
            System.exit(0);
        }

        Scanner charInput = new Scanner(System.in);
        System.out.println("Podaj znak, ktory ma zostac zliczony z pliku: ");
        String character = charInput.next();

        while (inputFile.hasNext())
        {
            String text = inputFile.next();
            for (int x = 0; x < text.length(); x++)
                if (character.equals(String.valueOf(text.charAt(x))))
                {
                    count++;
                }
            }
        System.out.println(count);
    }
}
