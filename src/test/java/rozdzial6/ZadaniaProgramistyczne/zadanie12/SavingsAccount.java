package rozdzial6.ZadaniaProgramistyczne.zadanie12;

public class SavingsAccount {

    private double interestRate;
    private double accountBalance;

    public SavingsAccount(double balance) {
        accountBalance = balance;
    }

    public void setInterestRate(double rate) {
        interestRate = rate;
    }

    public void setAccountBalance(double balance) {
        accountBalance = balance;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public double getAccountBalance() {
        return accountBalance;
    }

    public double accountDeposit (double accountBalance, double deposit) {
        return accountBalance + deposit;
    }

    public double accountWithdrawal (double accountBalance, double withdraw) {
        return accountBalance - withdraw;
    }

    public double rateBalance (double accountBalance, double interestRate) {
        return ((interestRate / 12) * accountBalance);
    }
}
