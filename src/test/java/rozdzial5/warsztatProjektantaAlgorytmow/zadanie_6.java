package rozdzial5.warsztatProjektantaAlgorytmow;

public class zadanie_6 {

    public static void main (String []args)
    {
        char initial = 'T';
        int age = 25;
        double income = 50000.00;

        display(age, income, initial);

    }
    public static void display(int arg1, double arg2, char arg3)
    {
        System.out.println("Wartość to " + arg1 + ", " + arg2 + " i " + arg3 + ".");
    }
}
