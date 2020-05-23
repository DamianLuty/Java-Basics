package rozdzial8.Zadania_Programistyczne.Zadanie4_LandTract;

// This program use class LandTrack and creates two objects to count plot area,
// also its using equals and toString method shared by LandTract class

import java.util.Scanner;

public class LandTractDemo {

    public static void main (String []args) {

        double length;
        double width;

        //creating two objects to calculate plot area
        LandTract object1 = new LandTract();
        LandTract object2 = new LandTract();

        Scanner input = new Scanner(System.in);

        //setting width and length for two objects - provided by user
        for(int x = 1; x < 3; x++) {
            System.out.println("Podaj długość działki nr " + x + ": ");
            length = input.nextDouble();
            System.out.println("Podaj szerokośc działki nr " + x + ": ");
            width = input.nextDouble();

            if(x == 1) {
                object1.setLength(length);
                object1.setWidth(width);
            } else {
                object2.setLength(length);
                object2.setWidth(width);
            }
        }

        // Displaying plot area for both objects
        System.out.println("DZIAŁKA nr 1 - " + object1);
        System.out.println("DZIAŁKA nr 2 - " + object2);

        // using method equals to compare plot area for both objects an displaying proper message
        boolean status = object1.equals(object2);
        if(status) {
            System.out.println("Powierzchnia obu działek jest równa.");
        } else {
            System.out.println("Powierzchnia działek nie jest sobie równa.");
        }
    }
}
