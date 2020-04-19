package rozdzial6.ZadaniaProgramistyczne.zadanie6;

public class TestScores {

    private double testScore1, testScore2, testScore3, average;

    public TestScores() {
        testScore1 = 0.0;
        testScore2 = 0.0;
        testScore3 = 0.0;
    }

    public void setTestScore1 (double t1) {
        testScore1 = t1;
    }

    public void setTestScore2 (double t2) {
        testScore2 = t2;
    }

    public void setTestScore3 (double t3) {
        testScore3 = t3;
    }

    public double getTestScore1() {
        return testScore1;
    }

    public double getTestScore2() {
        return testScore2;
    }

    public double getTestScore3() {
        return testScore3;
    }

    public double averageScore(double testScore1, double testScore2, double testScore3){
        return average = (testScore1 + testScore2 + testScore3) / 3;
    }
}
