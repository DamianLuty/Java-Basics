package rozdzial6.ZadaniaProgramistyczne.zadanie5;

import java.util.Scanner;

public class PayrollDemo {

    public static void main(String[] args) {

        String employee;
        int id;
        double paymentPerHour;
        double workedHours;
        double payment;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj imię i nazwisko pracownika: ");
        employee = input.nextLine();

        System.out.println("Podaj identyfikator pracownika: ");
        id = input.nextInt();

        System.out.println("Podaj stawkę godzinową: ");
        paymentPerHour = input.nextDouble();

        System.out.println("Podaj ilość przepracowanych godzin: ");
        workedHours = input.nextDouble();

        Payroll labourer = new Payroll(employee, id);

        payment = labourer.paycheck(paymentPerHour, workedHours);

        System.out.println("Imię i nazwisko: " + labourer.getName() + "\nIdentyfikator: " + labourer.getId()
                            + "\nWypłata: " + payment);
    }
}
