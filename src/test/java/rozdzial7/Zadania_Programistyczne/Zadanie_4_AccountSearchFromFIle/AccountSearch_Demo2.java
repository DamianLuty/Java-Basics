package rozdzial7.Zadania_Programistyczne.Zadanie_4_AccountSearchFromFIle;

import rozdzial7.Zadania_Programistyczne.Zadanie_3_AccountSearch.AccountSearch;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class AccountSearch_Demo2 {

    public static void main(String[] args) throws FileNotFoundException {

            int accountNo;
            int result;

            ArrayList<Integer> accounts = new ArrayList<>();
            AccountSearch accountSearch = new AccountSearch(accounts);

            File accountFile = new File
                    ("D:/Owoce Programowania/notepad - source files/chapter7 exercise 4 - accounts.txt");
            Scanner inputFile = new Scanner(accountFile);

            while (inputFile.hasNext()) {
                String account = inputFile.nextLine();
                accounts.add(Integer.parseInt(account));
            }
            inputFile.close();

            Scanner input = new Scanner(System.in);
            System.out.println("Podaj numer konta obciążeniowego: ");
            accountNo = input.nextInt();

            result = accountSearch.accSearch(accounts, accountNo);

            if (result == -1) {
                System.out.println("Podana wartość jest niepoprawna.");
            } else {
                System.out.println("Podana wartość jest poprawna.");
            }
        }
    }