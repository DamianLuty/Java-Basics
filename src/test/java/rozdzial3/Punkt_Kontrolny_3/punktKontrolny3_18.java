package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_18 {

    public static void main(String []args){

        int speed;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj jakas liczbe naturalna: ");
        speed = keyboard.nextInt();

        if (speed >= 0 && speed <= 200)
        System.out.println("Liczba jest poprawna");
        else
            System.out.println("Liczba jest poza przedzialem");
    }
}
