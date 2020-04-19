package rozdzial6.ZadaniaProgramistyczne.zadanie12;

import java.util.Scanner;

public class SavingsAccountDemo {

    public static void main(String[] args) {
        
        double accountBalance;
        double newAccountBalance = 0;
        double yearRate;
        double yearRatePercentage;
        int months;
        double deposit, allDeposits = 0;
        double withdraw, allWithdraws = 0;
        double rate;
        double rateBalance = 0;

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj początkowy stan konta: ");
        accountBalance = input.nextDouble();

        System.out.println("Podaj roczną stopę procentową: ");
        yearRate = input.nextDouble();
        yearRatePercentage = yearRate / 100;

        System.out.println("Podaj liczbę miesięcy od założenia konta: ");
        months = input.nextInt();
        
        SavingsAccount savingsAccount = new SavingsAccount(accountBalance);
        
        for (int x = 1; x <= months; x++) {
            System.out.println("Podaj kwotę zdeponowaną w miesiącu " + x + ": ");
            deposit = input.nextDouble();
            newAccountBalance = savingsAccount.accountDeposit(accountBalance, deposit);
            allDeposits += deposit;

            System.out.println("Podaj kwotę jaką wypłaciłes w miesiącu " + x + ": ");
            withdraw = input.nextDouble();
            newAccountBalance = savingsAccount.accountWithdrawal(newAccountBalance, withdraw);
            allWithdraws += withdraw;

            rate = savingsAccount.rateBalance(newAccountBalance, yearRatePercentage);
            rateBalance += rate;

            newAccountBalance += rate;
        }
        System.out.println("Aktualny stan konta: " + newAccountBalance);
        System.out.println("Suma zdeponowanych środków w podanym okresie czasu: " + allDeposits);
        System.out.println("Suma wypłaconych pieniędzy w podanym okresie czasu: " + allWithdraws);
        System.out.println("Suma odsetek: " + rateBalance);
    }
}
