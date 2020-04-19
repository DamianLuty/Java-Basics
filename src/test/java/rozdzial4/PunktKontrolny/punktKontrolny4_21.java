package rozdzial4.PunktKontrolny;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;


public class punktKontrolny4_21 {

    public static void main(String []args) throws IOException {

        File newfile = new File("D:/imie.txt");
        Scanner inputfile = new Scanner(newfile);

        String line = inputfile.nextLine();
        System.out.println(line);


        inputfile.close();

        }
    }

