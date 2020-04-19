package rozdzial6.ZadaniaProgramistyczne.zadanie13;

import rozdzial6.ZadaniaProgramistyczne.zadanie12.SavingsAccount;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SavingAccountsDemo2 {

    public static void main(String[] args) throws FileNotFoundException {

        double accountBalance;
        double allDeposits = 0;
        double allWithdrawals = 0;
        double rate;
        double currentAccountBalance;
        double interestRate;

        //tworzenie nowej instancji klasy SavingAccount
        SavingsAccount savingsAccount = new SavingsAccount(500.0);

        //Tworzenie instancji do wczytywania danych z pliku deposits
        File deposits = new File("D:/Deposits.txt");
        Scanner read = new Scanner(deposits);

        //Tworzenie instancji do wczytywania danych z pliku withdrawals
        File withdrawals = new File("D:/Withdrawals.txt");
        Scanner read2 = new Scanner(withdrawals);

        //Wczytywanie wszystkich danych z pliku deposits i obliczanie aktualnego stanu konta
        while (read.hasNext())
        {
            String deposit = read.nextLine();
            double depositToDouble = Double.parseDouble(deposit);

            accountBalance = savingsAccount.getAccountBalance();
            accountBalance = savingsAccount.accountDeposit(savingsAccount.getAccountBalance(), depositToDouble);
            savingsAccount.setAccountBalance(accountBalance);

            //sumowanie wszystkich wpłat
            allDeposits += depositToDouble;
        }
        read.close();

        //Wczytywanie wszystkich danych z pliku withdrawals i obliczanie aktualnego stanu konta
        while (read2.hasNext())
        {
            String withdrawal = read2.nextLine();
            double withdrawalToDouble = Double.parseDouble(withdrawal);

            accountBalance = savingsAccount.getAccountBalance();
            accountBalance = savingsAccount.accountWithdrawal(savingsAccount.getAccountBalance(), withdrawalToDouble);
            savingsAccount.setAccountBalance(accountBalance);

            //sumowanie wszystkich wypłat
            allWithdrawals += withdrawalToDouble;
        }
        read2.close();

        //Wprowadzenie i przeliczanie na procenty stopy procentowej podanej przez uzytkownika
        Scanner input = new Scanner(System.in);
        System.out.println("Podaj roczną stopę oprocentowania oprocentowanie: ");
        interestRate = input.nextDouble() / 100;

        rate = savingsAccount.rateBalance(savingsAccount.getAccountBalance(), interestRate);

        //obliczanie aktualnego stanu konta
        currentAccountBalance = savingsAccount.getAccountBalance() + rate;

        System.out.println("Aktualny stan konta: " + currentAccountBalance);
        System.out.println("Odsetki: " + rate);
        System.out.println("Suma wszystkich wpłat: " + allDeposits);
        System.out.println("Suma wszystkich wypłat: " + allWithdrawals);
    }
}
