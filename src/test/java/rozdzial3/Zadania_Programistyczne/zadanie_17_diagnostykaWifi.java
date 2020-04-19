package rozdzial3.Zadania_Programistyczne;

import java.sql.SQLOutput;
import java.util.Scanner;

public class zadanie_17_diagnostykaWifi {

    public static void main(String[] args) {

        String answer;
        String defaultQuestion = "Czy to rozwiazalo problem?";
        String step1 = "Uruchom ponownie komputer i sprobuj nawiazac polaczenie.";
        String step2 = "Uruchom ponownie router i sprobuj nawiazac polaczenie.";
        String step3 = "Upewnij sie, ze kable prowadzace do routera i modemu sa dobrze zamocowane.";
        String step4 = "Przenies router w inne miejsce.";
        String step5 = "Kup nowy router";

        System.out.println(step1);
        System.out.println(defaultQuestion);
        Scanner input = new Scanner(System.in);
        answer = input.nextLine();

        if (answer.equalsIgnoreCase("nie")) {
            System.out.println(step2);
            System.out.println(defaultQuestion);
            String answer1 = input.nextLine();
             if (answer1.equalsIgnoreCase("nie")) {
                System.out.println(step3);
                System.out.println(defaultQuestion);
                String answer2 = input.nextLine();
                if (answer2.equalsIgnoreCase("nie")) {
                    System.out.println(step4);
                    System.out.println(defaultQuestion);
                    String answer3 = input.nextLine();
                    if (answer3.equalsIgnoreCase("nie")) {
                        System.out.println(step5);
                    }
                }
            }
        }
    }
}