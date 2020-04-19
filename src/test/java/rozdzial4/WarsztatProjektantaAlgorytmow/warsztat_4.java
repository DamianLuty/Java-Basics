package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_4 {

    public static void main (String []args){

        int num1, iter, sum = 0;

        System.out.println("Program bedzie podliczal sume podanej liczby iterujac ja 10 krotnie. ");
        Scanner input = new Scanner(System.in);

        for (iter = 0; iter <= 10; iter++ ){
            System.out.println("Podaj wartosc: ");
            num1 = input.nextInt();

            sum += num1;
            System.out.println(sum);

        }
    }
}
