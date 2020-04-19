package rozdzial3.Punkt_Kontrolny_3;



import java.util.Scanner;

public class punktKontrolny3_23 {

    public static void main (String []args) {
    // punkt a
    /* punkt a
        int x;
        int y;
        int z;

        Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wartos x: ");
        x = keyboard.nextInt();
        System.out.println("podaj wartos z: ");
        y = keyboard.nextInt();

        z = x > y ? 1 : 20;

        System.out.println(z);
    }
   }

     */
    // punkt b
    /* punkt b
    int temp;
    int population;
    int base = 10;

        Scanner input  = new Scanner(System.in);
        System.out.println("podaj temp: ");
        temp = input.nextInt();

        population = temp > 45 ? base * 10: base * 2;

        System.out.println(population);
*/
    //punkt c
    /*
    double hours;
    double wages = 2;

        Scanner aaa = new Scanner(System.in);
        System.out.println("podaj hours: ");
        hours = aaa.nextInt();

        wages = hours > 40 ? wages * 1.5 : wages * 1;
        System.out.println(wages);
    */

    int result;

    Scanner keyboard = new Scanner(System.in);
        System.out.println("Podaj wynik");
        result = keyboard.nextInt();

        System.out.println (result >= 0 ? "wynik jest dodatni": "Wynik jest ujemny");
    }
}
