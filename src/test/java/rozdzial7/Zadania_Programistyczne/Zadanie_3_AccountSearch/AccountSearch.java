package rozdzial7.Zadania_Programistyczne.Zadanie_3_AccountSearch;

import java.util.ArrayList;

public class AccountSearch {

    private int account;
    private ArrayList<Integer> accounts;

    public AccountSearch(ArrayList<Integer> acc) {
        accounts = acc;
        account = 0;
    }

    public void setAccount(int acc) {
        account = acc;
    }

    public int getAccount(int x) {
        return account;
    }

    public int accSearch(ArrayList<Integer> acc, int account) {

        int index = 0;
        int element = -1;
        boolean found = false;

        while (!found && index < accounts.size()) {
            if(accounts.get(index) == account) {
                found = true;
                element = index;
            }
            index++;
        }
        return element;
    }

}
