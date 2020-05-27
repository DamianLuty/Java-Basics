package rozdzial8.Zadania_Programistyczne.Zadanie5_MonthClass;

public class MonthDemo {

    public static void main(String[] args) {

        // creating new objects using different constructors
        Month month1 = new Month(1);
        Month month2 = new Month(2);
        Month month3 = new Month("Sierpien");
        Month month4 = new Month(8);
        Month month5 = new Month();

        // Displaying getMonthNumber method to return monthNumber for object month3
        System.out.println(month3.getMonthNumber());

        // Displaying result of equals method for month4 and month3 object
        System.out.println(month4.equals(month3));

        // Using setMonthNumber method for object month5 where default value was "1".
        month5.setMonthNumber(5);
        System.out.println(month5);

        // Displaying result of graterThan method between month1 and month2 objects
        System.out.println(month1.graterThan(month2));

        // Displaying result of lessThan method between month1 and month2 objects
        System.out.println(month1.lessThan(month2));

    }
}