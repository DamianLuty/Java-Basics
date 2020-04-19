package rozdzial6.ZadaniaProgramistyczne.zadanie1;

public class Employee {

    private String name;
    private int idNumber;
    private String department;
    private String position;

    public Employee (String nam, int id, String dept, String pos){
        name = nam;
        idNumber = id;
        department = dept;
        position = pos;
    }

    public Employee (String nam, int id) {
        name = nam;
        idNumber = id;
        department = "";
        position = "";
    }

    public Employee () {
        name = "";
        idNumber = 0;
        department = "";
        position = "";
    }

    public void setName(String nam) {
        name = nam;
    }

    public void setIdNumber(int id){
        idNumber = id;
    }

    public void setDepartment(String dep) {
        department = dep;
    }

    public void setPosition (String pos) {
        position = pos;
    }

    public String getName() {
        return name;
    }

    public int getIdNumber() {
        return idNumber;
    }

    public String getDepartment() {
        return department;
    }

    public String getPosition() {
        return position;
    }
}
