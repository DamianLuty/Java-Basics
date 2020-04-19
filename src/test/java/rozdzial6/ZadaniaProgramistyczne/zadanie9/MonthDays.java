package rozdzial6.ZadaniaProgramistyczne.zadanie9;

public class MonthDays {

    private int month;
    private int year;
    private int days;
    private int leapYear;

    public MonthDays(int m, int y) {
        month = m;
        year = y;
    }

    public void setYear (int y) {
        year = y;
    }

    public void setMonth (int m) {
        month = m;
    }

    public int getYear() {
        return year;
    }

    public int getMonth() {
        return month;
    }

    //metoday leapYear sprawdza miesiąc oraz czy rok jest badz nie jest przestepny
    // i zwraca odpowiednią ilośc dni w danym miesiącu
    public int leapYear(int month, int year) {
        if ((month == 1) || (month == 3) || (month == 5) || (month == 7) || (month == 8) || (month == 10) || (month == 12))
            days = 31;
        if ((month == 4) || (month == 6) || (month == 9) || (month == 11))
            days = 30;
        if (month == 2) {
            if((year % 400 == 0) && (year % 100 == 0)) {
                days = 29;
            } else if ((year % 100 != 0) && (year % 4 == 0)) {
                days = 29;
            } else {
                days = 28;
            }
        }
        return days;
    }
}
