package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class warsztat_17 {

    public static void main (String []args) throws IOException {

        File file = new File("D:/NumberList.txt");
        if(!file.exists())
        {
            System.out.println("plik nie istnieje");
        }
        PrintWriter outputFile = new PrintWriter(file);

        for (int x = 1; x < 101; x++)
            outputFile.println(x);

        outputFile.close();
        System.out.println("Plik zostal zapisany.");
    }
}
