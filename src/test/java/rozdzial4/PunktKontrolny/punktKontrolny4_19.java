package rozdzial4.PunktKontrolny;

import java.io.IOException;
import java.io.PrintWriter;

public class punktKontrolny4_19 {

    public static void main(String []args) throws IOException {

        PrintWriter outputfile = new PrintWriter("D:/imie.txt");

        outputfile.println("Damian");

        outputfile.close();
        System.out.println("Plik zapisany");

    }
}
