package rozdzial4.Zadania_Programistyczne;


import java.util.Scanner;

public class zadanie_16 {

    public static void main (String []args) {

        double sum = 0.0;
        int x = 1;
        String decision;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj swoj miesieczny budzet: ");
        double budget = input.nextDouble();

        do
        {
            Scanner  input2 = new Scanner(System.in);
            System.out.println("Podaj " + x++ + " wydatek: ");
            double item = input2.nextDouble();
            Scanner input3 = new Scanner(System.in);
            System.out.println("Czy chcesz dodac kolejny wydatek? (wpisz 'tak' lub 'nie')");
            decision = input3.nextLine();
            sum = sum + item;
        }
        while (decision.equalsIgnoreCase("tak"));
        double remain = budget - sum;
        System.out.println("Budzet: " + budget);
        System.out.println("Wydatki: " + sum);
        System.out.println("Pozostało: " + remain);
    }
}
