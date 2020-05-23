package rozdzial7.Zadania_Programistyczne.Zadanie_19_Quiz;

import java.util.ArrayList;
import java.util.Scanner;

public class QuizDemo {

    public static void main (String[] args) {

        ArrayList<Question> questions = new ArrayList<Question>();

        questions.add(new Question("Z iloma krajami graniczy Polska: ",
                "1. 5", "2. 7", "3. 9", "4. 4", 2));
        questions.add(new Question("Kto zdobył najwięcej razy Złotą piłkę: ",
                "1. Messi", "2. Ronaldo", "3. Lewandowski", "4. Platini", 1));
        questions.add(new Question("Co ile lat rozgrywane są Mistrzostwa Świata w piłce nożnej: ",
                "1. co 3 lata", "2. co 5 lat", "3. co 4 lata", "4. co 7 lat", 3));
        questions.add(new Question("W którym roku miała miejsce denominacja złotego w Polsce: ",
                "1. 1992", "2. 1993", "3. 1994", "4. 1995", 4));
        questions.add(new Question("Ile razy z rzędu Real Madryt wygrał Ligę Mistrzów: ",
                "1. raz", "2. dwa", "3. trzy", "4. cztery", 3));

        String player1 = null, player2 = null;

        Scanner input = new Scanner(System.in);
        for(int x = 1; x < 3; x++) {
            System.out.println("Podaj imię zawodnika nr. " + x + ":");
            if(x == 1) {
                player1 = input.nextLine();
            } else {
                player2 = input.nextLine();
            }
        }
        System.out.println("\nZawodnik odpowiada na pytania, wpisując numer odpowiedzi.\n" );

        int answer;
        int p1Points = 0;
        int p2Points = 0;
        int correctAnswers;

        for(int y = 1; y < 3; y++) {
            System.out.println("NA PYTANIA ODPOWIADA ZAWODNIK NR " + y + "\n");
            for (int x = 0; x < 5; x++) {
                System.out.println("PYTANIE NR " + (x + 1) +":");
                System.out.println(questions.get(x).getQuestion());
                System.out.println(questions.get(x).getAnswer1());
                System.out.println(questions.get(x).getAnswer2());
                System.out.println(questions.get(x).getAnswer3());
                System.out.println(questions.get(x).getAnswer4());

                System.out.println("Odpowiedź: ");
                answer = input.nextInt();

                if (answer == questions.get(x).getCorrectAnswer()) {
                    correctAnswers = 1;
                } else {
                    correctAnswers = 0;
                }
                if (y == 1) {
                    p1Points += correctAnswers;
                } else {
                    p2Points += correctAnswers;
                }
            }
        }
        System.out.println("****************************");
        System.out.println("LICZBA ZDOBYTYCH PUNKTÓW: \n" +
                player1 + ": " + p1Points + "\n" +
                player2 + ": " + p2Points + "\n");
        if(p1Points > p2Points) {
            System.out.println("Zwycięzcą zostaje " + player1 + "!");
        } else if (p1Points < p2Points) {
            System.out.println("Zwycięzcą zostaje " + player2 + "!");
        } else {
            System.out.println("Remis!");
        }
    }
}
