package rozdzial8.Zadania_Programistyczne.Zadanie2_BankAccountConstructor;

public class BankAccountDemo {

    public static void main(String[] args) {

        BankAccount bankAccount = new BankAccount(500);
        BankAccount bankAccount1 = new BankAccount(bankAccount);

        System.out.println(bankAccount1.getBalance());
    }
}
