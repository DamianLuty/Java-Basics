package rozdzial7.Zadania_Programistyczne.Zadanie_7_MagicBall;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class MagicBall {

    public static void main (String[] args) throws FileNotFoundException {

        String question;
        String answer;

        ArrayList<String> answerList = new ArrayList<>();

        File answers = new File
                ("D:/Owoce Programowania/notepad - source files/chapter7 exercise 7 - answers.txt");
        Scanner inputFile = new Scanner(answers);

        while(inputFile.hasNext()) {
            String ans = inputFile.nextLine();
            answerList.add(ans);
        }
        inputFile.close();

        Scanner input = new Scanner(System.in);
        System.out.println("Zadaj pytanie: ");
        question = input.nextLine();

        Random magicBallAnswer = new Random();
        int answerNo = magicBallAnswer.nextInt(answerList.size());
        System.out.println(answerList.get(answerNo));
    }
}
