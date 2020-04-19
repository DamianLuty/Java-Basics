package rozdzial6.ZadaniaProgramistyczne.zadanie14;

public class Procedure {

    private String testName;
    private String testDate;
    private String testingPersonName;
    private double testCharge;

    public Procedure () {
        testName = "";
        testDate = "";
        testingPersonName ="";
        testCharge = 0.0;
    }

    public Procedure(String tName, String tDate, String tPerson, double tCharge) {
        testName = tName;
        testDate = tDate;
        testingPersonName = tPerson;
        testCharge = tCharge;
    }

    public void setTestName(String tname) {
        testName = tname;
    }

    public String getTestName() {
        return testName;
    }

    public void setTestDate(String tdate) {
        testDate = tdate;
    }

    public String getTestDate() {
        return  testDate;
    }

    public void setTestingPersonName (String tname) {
        testingPersonName = tname;
    }

    public String getTestingPersonName() {
        return testingPersonName;
    }

    public void setTestCharge(double tcharge) {
        testCharge = tcharge;
    }

    public double getTestCharge() {
        return testCharge;
    }
}
