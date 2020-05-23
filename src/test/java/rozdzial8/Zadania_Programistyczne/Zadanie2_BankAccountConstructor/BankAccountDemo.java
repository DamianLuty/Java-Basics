package rozdzial8.Zadania_Programistyczne.Zadanie2_BankAccountConstructor;

// This program shows how copy constructor shared by BankAccount class is working in practice

public class BankAccountDemo {

    public static void main(String[] args) {

        // creating BankAccount object
        BankAccount bankAccount = new BankAccount(500);

        // creating a copy of bankAccount object
        BankAccount bankAccount1 = new BankAccount(bankAccount);

        // displaying value of copied object
        System.out.println(bankAccount1.getBalance());
    }
}
