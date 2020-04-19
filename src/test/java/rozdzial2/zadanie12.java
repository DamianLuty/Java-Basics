package rozdzial2;

import java.util.Scanner;

public class zadanie12 {

    public static void main(String []args) {

        String name;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj nazwe ulubionego miasta: ");
        name = keyboard.nextLine();

        System.out.println("Liczba znakow w nazwie miasta wynosi: " + name.length() +
                            "\n " + name.toUpperCase() +
                            "\n " + name.toLowerCase() +
                            "\n " + name.charAt(5));
    }
}
