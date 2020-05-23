package rozdzial7.Zadania_Programistyczne.Zadanie_18_PhoneBook;

import java.util.ArrayList;

public class PhoneBookDemo {

    public static void main(String[] args) {

        ArrayList<PhoneBookEntry> phoneBook = new ArrayList<PhoneBookEntry>();

        phoneBook.add(new PhoneBookEntry("Damian", "791800324"));
        phoneBook.add(new PhoneBookEntry("Kasia", "123123123"));
        phoneBook.add(new PhoneBookEntry("Marcin", "439343442"));
        phoneBook.add(new PhoneBookEntry("Cecylia", "14240494292"));
        phoneBook.add(new PhoneBookEntry("Roman", "9278364112"));

        System.out.println("Lista zapisanych numerów: \n");
        for (PhoneBookEntry phoneBookEntry : phoneBook) {
            System.out.print(phoneBookEntry.getName());
            System.out.print(" - " + phoneBookEntry.getPhoneNumber()+"\n");
        }
    }
}