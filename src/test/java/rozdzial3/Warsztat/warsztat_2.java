package rozdzial3.Warsztat;

import java.util.Scanner;

public class warsztat_2 {

    public static void main(String []args){

        int x;
        int y;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj y");
        y = input.nextInt();

        if (y == 10)
            x = 0;
        else
            x = 1;
        System.out.println(x);
    }
}
