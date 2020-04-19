package rozdzial6.ZadaniaProgramistyczne.zadanie1;

public class EmployeeDemo {

    public static void main(String[] args) {

        Employee p1 = new Employee("Sara Magura", 47899, "Rachunkowość", "Wiceprezes");
        Employee p2 = new Employee("Marek Janczyk", 39119, "Informatyka", "Programista");
        Employee p3 = new Employee("Julia Rak", 81774, "Produkcja","Inżynier");

        System.out.println();
        System.out.println("Imię i nazwisko" + "\t\tIdentyfikator" + "\t\tRachunkowość" + "\t\tStanowisko");
        System.out.println("------------------------------------------------------------------------------");
        System.out.println(p1.getName() + "\t\t\t" + p1.getIdNumber() + "\t\t\t\t" + p1.getDepartment() +
                            "\t\t" + p1.getPosition());
        System.out.println(p2.getName() + "\t\t" + p2.getIdNumber() + "\t\t\t\t" + p2.getDepartment() +
                "\t\t\t" + p2.getPosition());
        System.out.println(p3.getName() + "\t\t\t" + p3.getIdNumber() + "\t\t\t\t" + p3.getDepartment() +
                "\t\t\t" + p3.getPosition());
    }
}
