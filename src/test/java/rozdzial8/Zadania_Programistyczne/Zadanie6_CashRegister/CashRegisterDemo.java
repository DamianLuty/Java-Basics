package rozdzial8.Zadania_Programistyczne.Zadanie6_CashRegister;

import rozdzial6.ZadaniaProgramistyczne.zadanie4.RetailItem;

import java.util.Scanner;

public class CashRegisterDemo {

    public static void main(String []args) {

        int unit;

        RetailItem item1 = new RetailItem("Laptop", 5, 100);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę kupowanych sztuk: ");
        unit = input.nextInt();

        CashRegister cash1 = new CashRegister(unit, item1);

        System.out.println(cash1);
        }
    }
