package rozdzial6.ZadaniaProgramistyczne.zadanie3;

import java.util.Scanner;

public class PersonalDataDemo {

    public static void main(String[] args) {

        PersonalData p1 = new PersonalData("Damian Luty", "Janiny Porazińskiej 16/28",
                                            33, 791800324);
        PersonalData p2 = new PersonalData("Grzegorz Bieszk", "Solskiego 1a/3",
                                            36, 700880188);
        PersonalData p3 = new PersonalData("Michał Kołczyński", "Władysława IV 33/4",
                                            33, 500505509);

        System.out.println("imię i nazwisko: " + p1.getName()
                            +  "\n" + "adres: "+ p1.getAddress()
                            + "\n" + "wiek: " + p1.getAge()
                            + "\n" + "telefon: " + p1.getPhoneNumber() + "\n");

        System.out.println("imię i nazwisko: " + p2.getName()
                +  "\n" + "adres: "+ p2.getAddress()
                + "\n" + "wiek: " + p2.getAge()
                + "\n" + "telefon: " + p2.getPhoneNumber() + "\n");

        System.out.println("imię i nazwisko: " + p3.getName()
                +  "\n" + "adres: "+ p3.getAddress()
                + "\n" + "wiek: " + p3.getAge()
                + "\n" + "telefon: " + p3.getPhoneNumber());

    }
}
