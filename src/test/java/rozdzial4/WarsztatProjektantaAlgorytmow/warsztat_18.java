package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class warsztat_18 {

    public static void main (String []args) throws IOException {
        int x = 0;
        File file = new File("D:/NumberList.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            x = inputFile.nextInt();
            System.out.println(x);

        }

        inputFile.close();

    }
}
