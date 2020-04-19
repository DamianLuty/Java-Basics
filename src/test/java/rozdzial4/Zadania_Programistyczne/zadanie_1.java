package rozdzial4.Zadania_Programistyczne;

// Program  po podaniu wartosci niezerowej dodatniej liczby calkowitej oblicza sume wszystkich wartosci do podanej


import java.util.Scanner;

public class zadanie_1 {

    public static void main(String[] args) {

        int value;
        int sum = 0;
        int x;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dodatnia liczbe calkowita, ktora jest rozna od zera: ");
        value = input.nextInt();

        if (value <= 0) {
            System.out.println("Podana wartosc jest niepoprawna");
        } else {
            for (x = 1; x <= value; x++) {
                sum = sum + x;
            }
            System.out.println(sum);
        }
    }
}
