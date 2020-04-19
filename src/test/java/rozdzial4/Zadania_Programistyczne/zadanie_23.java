package rozdzial4.Zadania_Programistyczne;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class zadanie_23 {

    public static void main (String []args) throws IOException {

        String name, description;
        String filename = "D:/sample.html";

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoje imie: ");
        name = input.nextLine();
        System.out.println("Jak byś siebie opisał?");
        description = input.nextLine();

        File file = new File(filename);
        PrintWriter outputfile = new PrintWriter(file);

        outputfile.println("<html>");
        outputfile.println("<head>");
        outputfile.println("</head>");
        outputfile.println("<body>");
        outputfile.println("<center>");
        outputfile.println("<h1>" + name + "</h1>");
        outputfile.println("</center>");
        outputfile.println("<hr />");
        outputfile.println(description);
        outputfile.println("<hr />");
        outputfile.println("</body>");
        outputfile.println("</html>");

        outputfile.close();
    }
}
