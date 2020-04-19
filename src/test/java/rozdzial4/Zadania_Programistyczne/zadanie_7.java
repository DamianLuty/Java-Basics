package rozdzial4.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_7 {

    public static void main(String[] args) {

        double rooms;
        double allRooms = 0;
        double occupiedRooms;
        double floors;
        double occupancy;
        double finalOccupancy = 0;
        double sumOccupancy = 0;
        double freeRooms = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbe pięter: ");
        floors = input.nextInt();

        if (floors < 1)
            System.out.println("Podana wartość jest niepoprawna!");
        else {
            for (int x = 1; x <= floors; x++) {
                System.out.println("Podaj ilość pokoi na piętrze " + x);
                rooms = input.nextInt();
                if (rooms < 10) {
                    System.out.println("Podana wartość jest niepoprawna!");
                    break;
                }
                System.out.println("Podaj ilość zajętych pokoi: ");
                occupiedRooms = input.nextInt();
                if (occupiedRooms < 0) {
                    System.out.println("Podana wartość jest niepoprwana!");
                    break;
                } else {
                    occupancy = occupiedRooms / rooms;
                    finalOccupancy += occupancy;
                    allRooms += rooms;
                    sumOccupancy += occupiedRooms;
                }
                freeRooms = allRooms - sumOccupancy;
                finalOccupancy = sumOccupancy / allRooms;
            }
        }
        if (allRooms == 0) {
            System.out.println("Podaj wartości jeszcze raz.");
        } else {
            System.out.println("Łączna liczba pokoi: " + allRooms);
            System.out.println("Liczba zajętych pokoi: " + sumOccupancy);
            System.out.println("Liczba pustych pokoi: " + freeRooms);
            System.out.println("Łączne obłożenie wynosi: " + finalOccupancy);
        }
    }
}
