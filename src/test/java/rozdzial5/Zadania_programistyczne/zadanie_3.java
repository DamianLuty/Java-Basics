package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_3 {

    public static void main (String []args) {
        double length,    // The rectangle's length
                width,     // The rectangle's width
                area;      // The rectangle's area

        // Get the rectangle's length from the user.
        length = getLength();

        // Get the rectangle's width from the user.
        width = getWidth();

        // Get the rectangle's area.
        area = getArea(length, width);

        // Display the rectangle data.
        displayData(length, width, area);
    }

    private static double getLength() {
        double length;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj długość prostokąta: ");
        length = input.nextDouble();

        return length;

    }
    private static double getWidth() {
        double width;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj wysokość prostokąta: ");
        width = input.nextDouble();

        return width;
    }
    private static double getArea(double length, double width) {

        double area;
        area = length * width;
        return area;
    }
    private static void displayData(double length, double width, double area) {

        System.out.println("Długość prostokąta wynosi: " + length + ".");
        System.out.println("Wysokość prostokąta wynosi: " + width + ".");
        System.out.println("Pole prostokąta wynosi: " + area + ".");

    }
}
