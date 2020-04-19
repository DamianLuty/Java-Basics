package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_19 {

    public static void main(String []args){

        int speed;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj jakakolwiek liczbe: ");
        speed = keyboard.nextInt();

        if (!(speed >= 0 && speed <= 200))
            System.out.println("Liczba jest niepoprawna");
        else
            System.out.println("Liczba znajduje sie przedziale od 0 do 200");
    }
}
