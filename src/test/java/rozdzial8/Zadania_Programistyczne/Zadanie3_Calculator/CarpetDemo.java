package rozdzial8.Zadania_Programistyczne.Zadanie3_Calculator;

import java.util.Scanner;

public class CarpetDemo {

    public static void main(String[] args) {

        double length;
        double width;
        double cost;
        double size;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wymiary pomieszczenia." + "\nDługość: ");
        length = input.nextDouble();
        System.out.println("Szerokość: ");
        width = input.nextDouble();

        RoomDimensions roomDimensions = new RoomDimensions(length, width);

        size = roomDimensions.getArea();

        System.out.println("Podaj cenę za metr kwadratowy: ");
        cost = input.nextDouble();

        RoomCarpet roomCarpet = new RoomCarpet(roomDimensions, cost);

        roomCarpet.getTotalCost();

        System.out.println(roomCarpet);

    }
}
