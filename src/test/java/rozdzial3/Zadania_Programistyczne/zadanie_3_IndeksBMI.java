package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_3_IndeksBMI {

    public static void main (String []args) {

        //program oblicza indeks BMI

        int weight;
        double hight;
        double BMI;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoja wage: ");
        weight = input.nextInt();
        System.out.println("Podaj swoj wzrost: ");
        hight = input.nextDouble();

        if (hight > 50)
            hight = hight * 0.01;

        BMI = weight / (Math.pow(hight, 2));

        if (BMI < 18.5)
            System.out.printf("Twoj indeks BMI wynosi: " + "%.2f" + " co oznacza, ze masz niedowage." , BMI );
        if (BMI >= 18.5)
            if (BMI <= 25)
                System.out.printf("Twoj indeks BMI wynosi: "
                                + "%.2f"
                                + " co oznacza, ze Twoja waga jest optymalna.", BMI);
            else
                System.out.print("Twoj indeks BMI wynosi: "
                        + "%.2f"
                        + " co oznacza, ze masz nadwage.");
    }
}
