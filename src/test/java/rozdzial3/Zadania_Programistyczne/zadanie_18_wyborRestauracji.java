package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_18_wyborRestauracji {

    public static void main(String []args) {

        String wege = "Czy ktoras z osob jest na diecie wegetarianskiej?";
        String wegan = "Czy ktoras z osob jest na diecie weganskiej?";
        String nogluten = "Czy ktoras z osob jest na diecie bezglutenowej?";

        String restaurant1 = "Luksusowe Burgery u Janka";   // nie, nie, nie
        String restaurant2 = "Pizzeria przy Dworcowej";     // tak, nie, tak
        String restaurant3 = "Kawiarnia na Rogu";           // tak, tak, tak
        String restaurant4 = "Wloskie Specjaly";            // tak, nie, nie
        String restaurant5 = "Kuchani u Szefa";             // tak, tak, tak

        Scanner input = new Scanner(System.in);
        System.out.println(wege);
        String answer1 = input.nextLine();
        System.out.println(wegan);
        String answer2 = input.nextLine();
        System.out.println(nogluten);
        String answer3 = input.nextLine();

        if (answer1.equalsIgnoreCase("tak") && answer2.equalsIgnoreCase("tak") &&
            answer3.equalsIgnoreCase("tak"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant5 +
                                "\n" + restaurant3);
        if (answer1.equalsIgnoreCase("nie") && answer2.equalsIgnoreCase("nie") &&
            answer3.equalsIgnoreCase("nie"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant1 +
                                "\n" + restaurant2 +
                                "\n" + restaurant3 +
                                "\n" + restaurant4 +
                                "\n" + restaurant5);
        if (answer1.equalsIgnoreCase("tak") && answer2.equalsIgnoreCase("nie") &&
            answer3.equalsIgnoreCase("nie"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant2 +
                                "\n" + restaurant3 +
                                "\n" + restaurant4 +
                                "\n" + restaurant5);
        if (answer1.equalsIgnoreCase("tak") && answer2.equalsIgnoreCase("tak") &&
            answer3.equalsIgnoreCase("nie"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant5 +
                                "\n" + restaurant3);
        if (answer1.equalsIgnoreCase("tak") && answer2.equalsIgnoreCase("nie") &&
            answer3.equalsIgnoreCase("tak"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant2 +
                                "\n" + restaurant3 +
                                "\n" + restaurant5);
        if (answer1.equalsIgnoreCase("nie") && answer2.equalsIgnoreCase("tak") &&
            answer3.equalsIgnoreCase("tak"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant5 +
                                "\n" + restaurant3);
        if (answer1.equalsIgnoreCase("nie") && answer2.equalsIgnoreCase("nie") &&
            answer3.equalsIgnoreCase("tak"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant2 +
                                "\n" + restaurant3 +
                                "\n" + restaurant5);
        if (answer1.equalsIgnoreCase("nie") && answer2.equalsIgnoreCase("tak") &&
            answer3.equalsIgnoreCase("nie"))
            System.out.println("Mozecie wybrac sie do nastepujacych restauracji: " +
                                "\n" + restaurant5 +
                                "\n" + restaurant3);
    }
}
