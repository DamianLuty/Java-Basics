package rozdzial4.Zadania_Programistyczne;

public class zadanie_11 {

    public static void main (String []args) {

        double farhenheit;
        double f = 9.0/5.0;
        System.out.println("Celsjusz" + "\t" + "Fahrenheit");
        System.out.println("-----------------------");
        for (double x = 0; x <= 20; x++) {
            farhenheit = x * f + 32;
            System.out.println("  " + x + "   " + "\t \t" + farhenheit);
        }
    }
}
