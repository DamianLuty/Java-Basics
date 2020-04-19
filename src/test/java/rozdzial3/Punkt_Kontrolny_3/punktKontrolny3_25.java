package rozdzial3.Punkt_Kontrolny_3;

import java.util.Scanner;

public class punktKontrolny3_25 {

    public static void main(String []args){

        String selection;

        Scanner input = new Scanner(System.in);
        System.out.println("Wybierz jedna z liter: " +
                            "A, B lub C");
        selection = input.nextLine();

        switch (selection)
        {
            case "a":
            case "A":
                System.out.println("Wybrales A.");
                break;
            case "b":
            case "B":
                System.out.println("wybrales B.");
                break;
            case "c":
            case "C":
                System.out.println("wybrales C.");
                break;
            default:
                    System.out.println("nie wybrales zadnej z powyzszych, wybierz litere ponownie");


        }
    }
}
