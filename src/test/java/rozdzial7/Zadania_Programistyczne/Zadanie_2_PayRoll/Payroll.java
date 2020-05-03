package rozdzial7.Zadania_Programistyczne.Zadanie_2_PayRoll;

public class Payroll {

    private final int ARRAY_LENGTH = 7;
    private int[] employeeId;
    private int[] hours;
    private double[] payRate;
    private double[] wages;

    public Payroll() {
        employeeId = new int[]{5658845, 4520125, 7895122, 8777541, 8451277, 1302850, 7580489};
        hours = new int[ARRAY_LENGTH];
        payRate = new double[ARRAY_LENGTH];
        wages = new double[ARRAY_LENGTH];
    }

    public int getEmployeeId(int e) {
        return employeeId[e];
    }

    public void setHours(int[] h) {
        hours = h;
    }

    public int getHours(int h) {
        return hours[h];
    }

    public void setPayRate(double[] p) {
        payRate = p;
    }

    public double getPayRate(int p) {
        return payRate[p];
    }

    public void setWages(double[] w) {
        wages = w;
    }

    public double getWages(int w) {
        return wages[w];
    }

    public int getARRAY_LENGTH() {
        return ARRAY_LENGTH;
    }

    public double salary(int employeeId) {
        double salary = getHours(employeeId) * getPayRate(employeeId);
        wages[employeeId] = salary;
        return wages[employeeId];
    }


}
