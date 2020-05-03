package rozdzial7.Zadania_Programistyczne.Zadanie_3_AccountSearch;

import java.util.ArrayList;
import java.util.Scanner;

public class AccountSearchDemo {

    public static void main(String[] args) {

        int accountNo;
        int result;

        ArrayList<Integer> accounts = new ArrayList<>();
        accounts.add(5658845);
        accounts.add(4520125);
        accounts.add(7895122);
        accounts.add(8777541);
        accounts.add(8451277);
        accounts.add(1302850);
        accounts.add(8080152);
        accounts.add(4562555);
        accounts.add(5552012);
        accounts.add(7825877);
        accounts.add(1005231);
        accounts.add(6545231);
        accounts.add(3852085);
        accounts.add(7576651);
        accounts.add(4581002);

        AccountSearch accountSearch = new AccountSearch(accounts);

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj numer konta obciążeniowego: ");
        accountNo = input.nextInt();

        result = accountSearch.accSearch(accounts, accountNo);

        if(result == -1) {
            System.out.println("Podana wartość jest niepoprawna.");
        } else {
            System.out.println("Podana wartość jest poprawna.");

        }
    }
}
