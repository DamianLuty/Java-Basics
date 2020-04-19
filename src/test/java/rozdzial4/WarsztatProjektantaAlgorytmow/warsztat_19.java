package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class warsztat_19 {

    public static void main (String []args) throws IOException {
        int sum = 0;
        File file = new File("D:/NumberList.txt");
        Scanner inputFile = new Scanner(file);

        while (inputFile.hasNext())
        {
            int x = inputFile.nextInt();
            sum = sum + x;
        }

        inputFile.close();

        System.out.println(sum);
    }
}

