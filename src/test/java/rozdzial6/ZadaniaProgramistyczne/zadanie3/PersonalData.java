package rozdzial6.ZadaniaProgramistyczne.zadanie3;

public class PersonalData {

    private String name;
    private String address;
    private int age;
    private int phoneNumber;

    public PersonalData() {
        name = "";
        address = "";
        age = 0;
        phoneNumber = 0;
    }

    public PersonalData (String nam, String add, int a, int phone) {
        name = nam;
        address = add;
        age = a;
        phoneNumber = phone;
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setAddress (String add) {
        address = add;
    }

    public void setAge (int a) {
        age = a;
    }

    public void setPhoneNumber(int phone) {
        phoneNumber = phone;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public int getAge() {
        return age;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }
}
