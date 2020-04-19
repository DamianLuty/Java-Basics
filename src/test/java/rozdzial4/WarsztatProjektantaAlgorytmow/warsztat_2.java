package rozdzial4.WarsztatProjektantaAlgorytmow;

import org.w3c.dom.ls.LSOutput;

import java.util.Scanner;

public class warsztat_2 {

    public static void main(String[] args) {

        int num1, num2;
        String answer;

        Scanner input = new Scanner(System.in);

        do {
            System.out.println("podaj pierwsza liczbe: ");
            num1 = input.nextInt();
            System.out.println("podaj druga liczbe: ");
            num2 = input.nextInt();
            System.out.println("suma wynosi: " + (num1 + num2) + ".");
            System.out.println("Czy nadal chcesz wykonac powyzsza operacje? ");
            answer = input.next();
        }
        while (answer.equalsIgnoreCase("tak"));
    }
}