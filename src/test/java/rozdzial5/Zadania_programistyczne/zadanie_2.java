package rozdzial5.Zadania_programistyczne;

import java.util.Scanner;

public class zadanie_2 {

    public static void main (String []args) {

        double price;
        int margin;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj cene hurtową produktu: ");
        price = input.nextDouble();
        System.out.println("Podaj marżę produktu w procentach: ");
        margin = input.nextInt();

        calculateRetail(price, margin);
    }

    private static void calculateRetail(double price, int margin) {

        double productValue;
        double marginValue;

        marginValue = (price * margin) / 100;

        productValue = price + marginValue;
        System.out.println("Wartość produktu wynosi: " + productValue);
        }
    }
