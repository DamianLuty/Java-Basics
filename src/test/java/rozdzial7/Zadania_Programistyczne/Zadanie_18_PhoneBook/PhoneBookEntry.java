package rozdzial7.Zadania_Programistyczne.Zadanie_18_PhoneBook;

public class PhoneBookEntry {

    private String name;
    private String phoneNumber;

    public PhoneBookEntry(String n, String phoneNo) {
        name = n;
        phoneNumber = phoneNo;
    }
    public PhoneBookEntry() {
        name = "";
        phoneNumber = "";
    }

    public void setName(String n) {
        name = n;
    }

    public String getName() {
        return name;
    }

    public void setPhoneNumber(String phoneNo) {
        phoneNumber = phoneNo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }
}
