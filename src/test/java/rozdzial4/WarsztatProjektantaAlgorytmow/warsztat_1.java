package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_1 {

    public static void main(String[] args) {

        int num;
        int product;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj liczbe od 1 do 100: ");
        num = keyboard.nextInt();

        product = num*10;

        while (product < 100)
        {
            product++;
            System.out.println(product);
        }



    }
}
