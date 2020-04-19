package rozdzial4.WarsztatProjektantaAlgorytmow;

import java.util.Scanner;

public class warsztat_12 {

    public static void main (String []args) {

        String answer;

        Scanner input = new Scanner(System.in);
        System.out.println("Wpisz slowo 'tak' lub 'nie'.");
        answer = input.next();

        while (!answer.equalsIgnoreCase("tak") && !answer.equalsIgnoreCase("nie")){
            System.out.println("Podana fraza jest niepoprawna.");
            System.out.println("Wpisz 'tak' lub 'nie'.");
            answer = input.next();
        }

    }
}
