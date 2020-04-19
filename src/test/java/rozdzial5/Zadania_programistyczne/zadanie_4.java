package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_4 {

    public static void main(String[] args) {

        double roomArea;
        double paintAmount;
        double workingHours;
        double paintPrice;
        double fullPaintPrice;
        double workingHoursPrice;
        double fullPrice;

        roomArea = generalInfo();
        paintPrice = paintPrice();
        paintAmount = paintAmount(roomArea);
        workingHours = workingHours(roomArea);
        fullPaintPrice = fullPaintPrice(paintPrice, paintAmount);
        workingHoursPrice = workingHoursPrice(workingHours);
        fullPrice = fullPrice(workingHoursPrice, fullPaintPrice);
        display(roomArea, paintAmount, workingHours, fullPaintPrice, workingHoursPrice, fullPrice);

    }

    private static double generalInfo() {

        double roomArea;
        double count = 0.0;
        double rooms;

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź liczbę pokoi: ");
        rooms = input.nextDouble();


        for (int x = 1; x <= rooms; x++) {
            System.out.println("Podaj powieżchnię w metrach kwadratowych pokoju nr." + x + ": ");
            roomArea = input.nextDouble();
            count += roomArea;
        }
        return count;
    }

    private static double paintPrice() {

        double paintPrice;

        Scanner input = new Scanner(System.in);
        System.out.println("Wprowadź cenę farby za litr: ");
        paintPrice = input.nextDouble();

        return paintPrice;
    }

    private static double paintAmount(double roomArea) {

        double howMuchPaint;

        howMuchPaint = (roomArea / 10.0) * 1.5;
        return howMuchPaint;
    }

    private static double workingHours(double roomArea) {

        double howManyHours;

        howManyHours = (roomArea / 10.0) * 8.0;
        return howManyHours;

    }

    private static double fullPaintPrice(double paintPrice, double paintAmount) {

        double howMuchForPaint;

        howMuchForPaint = paintPrice * paintAmount;
        return howMuchForPaint;
    }

    private static double workingHoursPrice(double workingHours) {

        double workPrice;

        workPrice = workingHours * 18.00;
        return workPrice;
    }

    private static double fullPrice(double workingHoursPrice, double fullPaintPrice) {

        double fullCost;

        fullCost = workingHoursPrice + fullPaintPrice;
        return fullCost;
    }

    private static void display(double roomArea, double paintAmount, double workingHours,
                                double fullPaintPrice, double workingHoursPrice, double fullPrice) {

        System.out.println("Powierzchnia do malowania: " + roomArea + " m.2");
        System.out.println("Do pomalowania, będzie potrzebne " + paintAmount + " litra/ów farby");
        System.out.println("Ilość roboczogodzin: " + workingHours);
        System.out.println("Koszt za wszystkie puszki farby: " + fullPaintPrice + "zł.");
        System.out.println("Koszt roboczogodzin: " + workingHoursPrice + "zł.");
        System.out.println("Całkowity koszt malowania: " + fullPrice + "zł.");
    }
}

