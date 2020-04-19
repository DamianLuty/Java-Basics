package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class warsztat_20 {

    public static void main(String[] args) throws IOException {

        File file = new File("D:/NumberList.txt");
        if (!file.exists())
        {
            System.out.println("podany plik nie istnieje");
            System.exit(0);
        }

        FileWriter fwriter = new FileWriter("D:/NumberList.txt", true);
        PrintWriter outputfile = new PrintWriter(fwriter);

        outputfile.close();
        System.out.println ("dane zostaly zapisane w pliku.");
    }
}

