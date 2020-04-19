package rozdzial6.ZadaniaProgramistyczne.zadanie14;

public class Patient {

    private String fullName;
    private String fullAddress;
    private int phoneNumber;
    private String contactPersonFullName;
    private int contactPersonPhoneNumber;

    public Patient() {
        fullName = "";
        fullAddress ="";
        phoneNumber = 0;
        contactPersonFullName = "";
        contactPersonPhoneNumber = 0;
    }

    public Patient (String fName, String fAdd, int phone, String cpFullName, int cpPhone) {
        fullName = fName;
        fullAddress = fAdd;
        phoneNumber = phone;
        contactPersonFullName = cpFullName;
        contactPersonPhoneNumber = cpPhone;
    }

    public void setFullName(String fname) {
        fullName = fname;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullAddress(String add) {
        fullAddress = add;
    }

    public String getFullAddress() {
        return fullAddress;
    }

    public void setPhoneNumber(int phone) {
        phoneNumber = phone;
    }

    public int getPhoneNumber() {
        return phoneNumber;
    }

    public void setContactPersonName (String cpname) {
        contactPersonFullName = cpname;
    }

    public String getContactPersonName() {
        return contactPersonFullName;
    }

    public void setContactPersonPhoneNumber (int cpPhone) {
        contactPersonPhoneNumber = cpPhone;
    }

    public int getContactPersonPhoneNumber() {
        return contactPersonPhoneNumber;
    }
}
