package rozdzial8.Zadania_Programistyczne.Zadanie5_MonthClass;

/*
    This Class is used to create an object with Month, depending on users preferences, month can be used as number
    and a String in Constructor, also it shares methods like: greaterThan, lessThan and equals to compare
    two different objects.
 */

public class Month {

    // Enum defined with all Months
    public enum Months {
        DUMMY, STYCZEN, LUTY, MARZEC, KWIECIEN, MAJ, CZERWIEC, LIPIEC, SIERPIEN, WRZESIEN,
        PAZDZIERNIK, LISTOPAD, GRUDZIEN}

    private int monthNumber;
    private String monthName;

    /**
     * default constructor that sets monthNumber by default value = 1.
     */
    public Month() {
        monthNumber = 1;
    }

    /**
     * This constructor initiates monthNumber
     * @param month month number.
     */
    public Month(int month) {
        this.monthNumber = month;
        if (month < 1 || month > 12) {
            monthNumber = 1;
        }
    }

    /**
    This constructor initiate monthNumber based on monthName
    @param monthName name of the month.
     */
    public Month(String monthName) {

        for(int x = 1; x <= Months.values().length - 1; x++) {
            Months monthN = Months.values()[x];
            if(monthName.equalsIgnoreCase(String.valueOf(monthN))) {
                monthNumber = x;
                break;
            }
        }
    }

    /**
     * Method setMonthNumber sets monthNumber to monthNumber field.
     * This method will assigned values from 1 to 12.
     * Any other number that goes beyond the above range will be set by default value = 1.
     * @param monthNumber
     */
    public void setMonthNumber(int monthNumber) {
        this.monthNumber = monthNumber;

        if(monthNumber < 1 || monthNumber > 12) {
            this.monthNumber = 1;
        }
    }

    public int getMonthNumber() {
        return monthNumber;
    }

    public String getMonthName() {

        for(int x = 1; x <= Months.values().length; x++) {
            if(monthNumber == x) {
                monthName = Months.values()[x].toString();
            }
        }
        return monthName;
    }

    /**
     * method toString converts enum to String
     @return string
     */
    public String toString() {
        String str = getMonthName();
        return str;
    }

    /**
     * method equals compare month with Month object.
     * @param month month object
     * @return status
     */
    public boolean equals(Month month) {
        boolean status;

        if(getMonthName().equalsIgnoreCase(month.getMonthName())) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Method graterThan compares two objects and returns if object 1 is grater than object 2.
     * @param month month object.
     * @return status
     */
    public boolean graterThan(Month month) {
        boolean status;
        if (getMonthNumber() > month.getMonthNumber()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }

    /**
     * Method lessThan compares to objects and provide if object 1 is less than object 2.
     * @param month month object
     * @return status
     */
    public boolean lessThan(Month month) {
        boolean status;
        if(getMonthNumber() < month.getMonthNumber()) {
            status = true;
        } else {
            status = false;
        }
        return status;
    }
}

