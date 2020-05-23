package rozdzial7.Zadania_Programistyczne.Zadanie_19_Quiz;

public class Question {

    private String question, answer1, answer2, answer3, answer4;
    private int correctAnswer;

    public Question(String q, String a1, String a2, String a3, String a4, int cA) {
        question = q;
        answer1 = a1;
        answer2 = a2;
        answer3 = a3;
        answer4 = a4;
        correctAnswer = cA;
    }

    public Question() {
        question = "";
        answer1 = "";
        answer2 = "";
        answer3 = "";
        answer4 = "";
        correctAnswer = 0;
    }

    public void setQuestion(String q) {
        question = q;
    }

    public void setAnswer1(String a1) {
        answer1 = a1;
    }

    public void setAnswer2(String a2) {
        answer2 = a2;
    }

    public void setAnswer3(String a3) {
        answer3 = a3;
    }

    public void setAnswer4(String a4) {
        answer4 = a4;
    }

    public void setCorrectAnswer(int cA) {
        correctAnswer = cA;
    }

    public String getQuestion() {
        return question;
    }

    public String getAnswer1() {
        return answer1;
    }

    public String getAnswer2() {
        return answer2;
    }

    public String getAnswer3() {
        return answer3;
    }

    public String getAnswer4() {
        return answer4;
    }

    public int getCorrectAnswer() {
        return correctAnswer;
    }
}
