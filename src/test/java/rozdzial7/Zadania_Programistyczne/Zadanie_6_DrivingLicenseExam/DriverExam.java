package rozdzial7.Zadania_Programistyczne.Zadanie_6_DrivingLicenseExam;

public class DriverExam {

    private String[] correctAnswers;
    private String[] driverAnswers;
    private int score = 0;
    private int points = 0;
    private boolean result;
    private int missed = 0;
    private int correct = 0;
    private int incorrect = 0;


    public DriverExam(String[] driver) {
        correctAnswers = new String[]{"B", "D", "A", "A", "C", "A", "B", "A", "C", "D",
                "B", "C", "D", "A", "D", "C", "C", "B", "D", "A"};
        driverAnswers = driver;
    }

    public String getDriverAnswers(int index) {
        return driverAnswers[index];
    }

    public boolean passed(String[] driverA) {
        for (int x = 0; x < correctAnswers.length; x++) {
            if (correctAnswers[x].equalsIgnoreCase(driverA[x])) {
                points = 1;
            } else {
                points = 0;
            }
            score += points;
        }
        if (score >= 15) {
            result = true;
        }
        return result;
    }

    public int totalCorrect(String[] driverA) {
        for (int x = 0; x < correctAnswers.length; x++) {
            if (correctAnswers[x].equalsIgnoreCase(driverA[x])) {
                points = 1;
            } else {
                points = 0;
            }
            correct += points;
        }
        return correct;
    }

    public int totalIncorrect(String[] driverA) {
        for (int x = 0; x < correctAnswers.length; x++) {
            if (!correctAnswers[x].equalsIgnoreCase(driverA[x])) {
                points = 1;
            } else {
                points = 0;
            }
            incorrect += points;
        }
        return incorrect;
    }

    public int questionMissed(String[] driverA) {
        for (int x = 0; x < correctAnswers.length; x++) {
            if(driverA[x].equals("") || driverA[x].equals(" ")) {
                points = 1;
            } else {
                points = 0;
            }
            missed += points;
        }
        return missed;
    }
}

