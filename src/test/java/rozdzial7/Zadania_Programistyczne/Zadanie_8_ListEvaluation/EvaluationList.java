package rozdzial7.Zadania_Programistyczne.Zadanie_8_ListEvaluation;

import java.util.ArrayList;

public class EvaluationList {

    private final int EVALUATIONS_LENGTH = 4;
    private ArrayList<String> studentNames = new ArrayList<>();
    private ArrayList<Integer> evaluations = new ArrayList<>();

    public EvaluationList(ArrayList<String> students) {
        studentNames = students;
        evaluations = new ArrayList<Integer>() {
            {
                add(5);
                add(4);
                add(3);
                add(2);
                add(1);
            }
        };
    }

    public String getSudentName(int x) {
        return studentNames.get(x);
    }

    public void setStudentName(String name) {
        studentNames.add(name);
    }

    public double averageScore(double[] stud) {
        double totalScore = 0.0;
        double avgScore;
        double lowestScore = stud[0];

        for (int x = 0; x < stud.length; x++) {
            double result = stud[x];

            if(stud[x] < lowestScore) {
                lowestScore = stud[x];
            }
            totalScore += result;
        }
        totalScore = totalScore - lowestScore;
        avgScore = totalScore / EVALUATIONS_LENGTH;
        return avgScore;
    }

     public void getEvaluation(double avgScore) {

        double evaluation;

        if (avgScore >= 90) {
            evaluation = evaluations.get(0);
        } else if (avgScore >= 80) {
            evaluation = evaluations.get(1);
        } else if (avgScore >= 70) {
            evaluation = evaluations.get(2);
        } else if (avgScore >= 60) {
            evaluation = evaluations.get(3);
        } else {
            evaluation = evaluations.get(4);
        }
        System.out.println("Ocena: " + evaluation);
    }
}


