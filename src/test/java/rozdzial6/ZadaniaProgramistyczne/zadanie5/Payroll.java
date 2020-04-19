package rozdzial6.ZadaniaProgramistyczne.zadanie5;

public class Payroll {

    private String name;
    private int id;
    private double hourlyRate;
    private double workingHours;
    private double payment;

    public Payroll(String nam, int i) {
        name = nam;
        id = i;
        hourlyRate = 0.0;
        workingHours = 0;
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setId (int i) {
        id = i;
    }

    public String getName() {
        return name;
    }

    public int getId() {
        return id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }

    public double getWorkingHours() {
        return workingHours;
    }

    public double  paycheck(double hourlyRate, double workingHours) {
        payment = hourlyRate * workingHours;
        return payment;
    }
}
