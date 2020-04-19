package rozdzial6.ZadaniaProgramistyczne.zadanie7;

import java.util.Scanner;

public class CircleDemo {

    public static void main(String[] args) {

        double radius, area, diameter, circumference;


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj promień koła: ");
        radius = input.nextDouble();

        Circle circle = new Circle();

        area = circle.area(radius);
        diameter = circle.diameter(radius);
        circumference = circle.circumference(radius);

        System.out.println("Pole powieżchni koła wynosi: " + area
                            + "\nŚrednica koła wynosi: " + diameter
                            + "\nObwód koła wynosi: " + circumference);
    }
}
