package rozdzial7.Zadania_Programistyczne.Zadanie_5_WiekszeOdN;

import java.util.Scanner;

public class BiggerThanN {

    public static void main(String[] args) {

        int[] values = new int[] {4, 5, 1, 2, 3, 4, 5, 6, 7, 8};
        int n;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartosć liczby 'n':");
        n = input.nextInt();

        getBigger(values, n);
    }

    public static void getBigger(int[] val, int n) {
        System.out.println("Wartości większe od podanej, znajdujące się w tablicy to: ");
        for(int x = 0; x < val.length; x++) {
            if(n < val[x]) {
                System.out.println(val[x]);
            }
        }
    }
}
