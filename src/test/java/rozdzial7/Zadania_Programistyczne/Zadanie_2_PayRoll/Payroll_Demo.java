package rozdzial7.Zadania_Programistyczne.Zadanie_2_PayRoll;

import java.util.Scanner;

public class Payroll_Demo {

    public static void main(String[] args) {

        Payroll payroll = new Payroll();

        int[] hours = new int[payroll.getARRAY_LENGTH()];
        double[] payRate = new double[payroll.getARRAY_LENGTH()];
        double[] wages = new double[payroll.getARRAY_LENGTH()];

        Scanner input = new Scanner(System.in);
        for(int x = 0; x < payroll.getARRAY_LENGTH(); x++) {
            System.out.println("Podaj liczbe przepracowanych godzin dla pracownika: " + payroll.getEmployeeId(x));
            hours[x] = input.nextInt();
            payroll.setHours(hours);
            System.out.println("Podaj stawke godzinowa dla tego pracownika: ");
            payRate[x] = input.nextDouble();
            payroll.setPayRate(payRate);

            wages[x] = payroll.salary(x);
            payroll.setWages(wages);
        }

        System.out.println("****PODSUMOWANIE****");

        for(int x = 0; x < payroll.getARRAY_LENGTH(); x++) {
            System.out.println("Wynagrodzenie pracownika " + payroll.getEmployeeId(x) + " wynosi: " +
                                payroll.getWages(x));
        }
    }

}
