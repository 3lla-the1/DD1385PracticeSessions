import java.util.*;

public class CustomBankAccount implements BankAccount {
    private String accountNumber;
    private BankAccountHolder accountHolder;
    public double balance = 0;

    // Konstruktor(String name, double balance)
    // Konstruktor(String lastname, int year)

    CustomBankAccount(BankAccountHolder accountHolder, double balance) {
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    CustomBankAccount(double balance) {
        this.balance = balance;
    }

    @Override
    public String generateAccountNumber() {
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();
        for (int i = 0; i < 10; i++) {
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();
    }

    @Override
    public String toString() {
        final StringBuilder sB = new StringBuilder("Bank Account: {");
        sB.append("ACCOUNT NUMBER = ").append(this.accountNumber);
        sB.append(", ACCOUNT HOLDER = ").append(this.accountHolder);
        sB.append(", BALANCE = ").append(this.balance);
        sB.append("}");
        return sB.toString();
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Only positive values allowed");
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Not enough money!");
        }
        this.balance -= amount;
    }

    @Override
    public void deposit(double amount) {
        if (amount <= 0.0) {
            throw new IllegalArgumentException("Only positive values allowed");
        }
        this.balance += amount;
    }
    
    @Override
    public double getBalance() {
        return this.balance;
    }

    @Override
    public void setAccountHolder(BankAccountHolder accountHolder) {
        this.accountHolder = accountHolder;
    }

    public static void main(String[] args) {
        BankAccountHolder s = new Student("tcame@kth.se", "Théo", 5);
        s.addAccount(new CustomBankAccount(0));
        System.out.println(s);


        // BankAccount account = new CustomBankAccount(s, 100);
        // System.out.println(account);
        // account.deposit(200);
        // System.out.println(account);



    }

}
