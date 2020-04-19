package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie_3 {

    public static void main(String[] args) throws FileNotFoundException {

        String filename;
        int hour;
        int speed;
        int sum = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Program oblicza odlegosc przebyta przez pojazd.");
        System.out.println("Podaj ile godzin trwala podroz: ");
        hour = input.nextInt();
        System.out.println("Podaj z jaka predkoscia jechales: ");
        speed = input.nextInt();

        System.out.println("Podaj nazwe pliku: ");
        Scanner input2 = new Scanner(System.in);
        filename = input2.nextLine();

        File file = new File(filename);
        if (file.exists()) {
            System.out.println("Plik" + filename + " juz istnieje");
            System.exit(0);
        }
        PrintWriter outputfile = new PrintWriter(file);

        if (hour < 1 || speed < 1)
            System.out.println("Podana wartosc nie moze byc ujemna!");
        else {
            outputfile.println("Godzina" + "\t \t" + "Przebyta odległość");
            outputfile.println("---------------------------------");
            for (int x = 1; x <= hour; x++) {
                sum = speed * x;
                outputfile.println(x + "\t \t \t " + sum);
            }
            outputfile.close();
            System.out.println("Plik zapisany.");
        }

    }
}