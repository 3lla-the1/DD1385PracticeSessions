public interface BankAccount {
    double getBalance();
    String generateAccountNumber();
    void deposit(double amount);
    void withdraw(double amount);
    void setAccountHolder(BankAccountHolder accountHolder);
    
}
