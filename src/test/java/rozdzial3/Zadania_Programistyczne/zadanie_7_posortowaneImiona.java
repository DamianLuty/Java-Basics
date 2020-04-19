package rozdzial3.Zadania_Programistyczne;

import java.util.Scanner;

public class zadanie_7_posortowaneImiona {

    public static void main (String []args) {

        String name1;
        String name2;
        String name3;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj pierwsze imie: ");
        name1 = input.nextLine();
        System.out.println("Podaj drugie imie: ");
        name2 = input.nextLine();
        System.out.println("Podaj trzecie imie: ");
        name3 = input.nextLine();

        if (name1.compareToIgnoreCase(name2) < 0 && name1.compareToIgnoreCase(name3) < 0) {
            if (name2.compareToIgnoreCase(name3) < 0) {
                System.out.println(name1);
                System.out.println(name2);
                System.out.println(name3);
            } else {
                System.out.println(name1);
                System.out.println(name3);
                System.out.println(name2);
            }
        }
        if (name2.compareToIgnoreCase(name1) < 0 && name2.compareToIgnoreCase(name3) < 0) {
            if (name1.compareToIgnoreCase(name3) < 0) {
                System.out.println(name2 + "\n" + name1 + "\n" + name3);
            } else {
                System.out.println(name2 + "\n" + name3 + "\n" + name1);
            }
        }
        if (name3.compareToIgnoreCase(name1) < 0 && name3.compareToIgnoreCase(name2) < 0) {
            if (name1.compareToIgnoreCase(name2) < 0) {
                System.out.println(name3 + "\n" + name1 + "\n" + name2);
            } else {
                System.out.println(name3 + "\n" + name2 + "\n" + name1);
            }
        }
    }
}
