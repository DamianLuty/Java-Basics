package rozdzial7.Zadania_Programistyczne.Zadanie_6_DrivingLicenseExam;

import java.util.Scanner;

public class DreiverExam_Demo {

    public static void main(String[] args) {

        boolean result;
        int correctAnswers;
        int incorrectAnswers;
        int questionMissed;

        String[] driverAnswers = new String[20];


        Scanner input = new Scanner(System.in);
        for(int x = 0; x < driverAnswers.length; x++) {
            do {
            System.out.println("Odpowiedz na pytanie nr " + (x+1));
            driverAnswers[x] = input.nextLine();
            } while (!driverAnswers[x].matches("[a-dA-D ]?"));
        }

        DriverExam driverExam = new DriverExam(driverAnswers);

        result = driverExam.passed(driverAnswers);
        if(result) {
            System.out.println("ZDAŁEŚ");
        } else {
            System.out.println("PRZYKRO NAM, NIE ZDAŁEŚ.");
        }

        correctAnswers = driverExam.totalCorrect(driverAnswers);
        incorrectAnswers = driverExam.totalIncorrect(driverAnswers);
        questionMissed = driverExam.questionMissed(driverAnswers);

        System.out.println("Ilość poprawnych odpowiedzi: " + correctAnswers);
        System.out.println("Ilość niepoprawnych odpowiedzi: " + (incorrectAnswers - questionMissed));
        System.out.println("Ilość opuszczonych pytań: " + questionMissed);
    }
}
