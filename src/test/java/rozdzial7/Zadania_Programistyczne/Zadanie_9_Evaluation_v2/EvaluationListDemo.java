package rozdzial7.Zadania_Programistyczne.Zadanie_9_Evaluation_v2;

import rozdzial7.Zadania_Programistyczne.Zadanie_8_ListEvaluation.EvaluationList;

import java.util.ArrayList;
import java.util.Scanner;

public class EvaluationListDemo {

    public static void main(String[] args) {

        final int numberOfStudents = 1;
        final int numberOfExams = 4;
        String name;
        double result = 0;

        ArrayList<String> students = new ArrayList<>();
        double[] student1 = new double[numberOfExams];
        double[] student2 = new double[numberOfExams];
        double[] student3 = new double[numberOfExams];
        double[] student4 = new double[numberOfExams];
        double[] student5 = new double[numberOfExams];

        for (int x = 0; x < numberOfStudents; x++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Podaj imię i nazwisko studenta nr " + (x + 1) + ":");
            name = input.nextLine();
            students.add(name);
            for (int z = 0; z < numberOfExams; z++) {
                do {
                    System.out.println("Podaj wynik (maksymalna ilość zodbytych pkt. to 100)" +
                            " egzaminu nr " + (z + 1) + ":");
                    result = input.nextDouble();
                    if (result < 0.0 || result > 100.0)
                        System.out.println("Podana wartość nie może być ujemna i większ od 100!");
                } while (result < 0.0);
                if (x == 0) {
                    student1[z] = result;
                } else if (x == 1) {
                    student2[z] = result;
                } else if (x == 2) {
                    student3[z] = result;
                } else if (x == 3) {
                    student4[z] = result;
                } else {
                    student5[z] = result;
                }
            }
        }

        EvaluationList_v2 evaluationList = new EvaluationList_v2(students);

        for (int y = 0; y < numberOfStudents; y++) {
            System.out.println("Student: " + evaluationList.getSudentName(y));
            if (y == 0) {
                double s1 = evaluationList.averageScore(student1);
                System.out.println("Średni wynik testów to: " + s1);
                evaluationList.getEvaluation(s1);
            } else if (y == 1) {
                double s2 = evaluationList.averageScore(student2);
                System.out.println("Średni wynik testów to: " + s2);
                evaluationList.getEvaluation(s2);
            } else if (y == 2) {
                double s3 = evaluationList.averageScore(student3);
                System.out.println("Średni wynik testów to: " + s3);
                evaluationList.getEvaluation(s3);
            } else if (y == 3) {
                double s4 = evaluationList.averageScore(student4);
                System.out.println("Średni wynik testów to: " + s4);
                evaluationList.getEvaluation(s4);
            } else {
                double s5 = evaluationList.averageScore(student5);
                System.out.println("Średni wynik testów to: " + s5);
                evaluationList.getEvaluation(s5);
            }
            System.out.println("*****************************");
        }
    }
}

