package rozdzial6.ZadaniaProgramistyczne.zadanie16;

import java.util.Scanner;

public class RoulettePocketDemo {

    public static void main(String[] args) {

        int number;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wartość z przedziału od 0 do 36: ");
        number = input.nextInt();

        RoulettePocket roulettePocket = new RoulettePocket(number);

        roulettePocket.getPocketColour(roulettePocket.getNumber());
    }
}
