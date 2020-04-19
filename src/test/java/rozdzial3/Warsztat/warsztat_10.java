package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_10 {

    public static void main (String []args) {

        int choice;

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz jedna z liczb: 1, 2 lub 3");
        choice = input.nextInt();

        switch (choice)
        {
            case 1:
                System.out.println("Wybrales 1");
                break;
            case 2:
                System.out.println("Wybrales 2 lub 3");
                break;
            case 3:
                System.out.println("Wybrales 2 lub 3");
                break;
            case 4:
                System.out.println("Wybrales 4");
                break;
            default:
                System.out.println("Wybierz ponownie");
                break;

        }

    }
}
