package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_9_oplatyZaTransport {

    public static void main(String[] args) {

        double weight;
        double distance;
        double totalCost;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj ciężar przesyłki: ");
        weight = input.nextDouble();
        System.out.println("Podaj odleglość przesyłki: ");
        distance = input.nextDouble();


        if (weight < 0 || distance < 0) {
            System.out.println("podana wartosc jest niepoprawna.");
        }
        if (weight > 5 || distance > 1500) {
            System.out.println("Koszt wysyłkie wynosi: 3,80 zł.");
        }
        else if (weight > 3 || distance > 1000){
                System.out.println("Koszt wysyłki wynosi: 3,70 zł.");
        }
        else if (weight > 1 || distance > 500) {
            System.out.println("Koszt wysyłki wynosi: 2,20 zł.");
        }
        else
            System.out.println("Koszt wysyłki wynosi: 1,10 zł.");
    }
}
