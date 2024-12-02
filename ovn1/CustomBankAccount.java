import java.util.*;


public class CustomBankAccount implements BankAccount {
    private String accountNumber;
    private BankAccountHolder accountHolder;
    public double balance = 0; //default to 0

    CustomBankAccount(BankAccountHolder accountHolder, double balance){
        this.accountHolder = accountHolder;
        this.balance = balance;
        this.accountNumber = generateAccountNumber();
    }

    // 2 kunstruktorer (kan inte ha dem som ser utt på exakt samma sätt)
    CustomBankAccount(){
        this.balance = balance;
    }

    @Override
    public String generateAccountNumber(){
        Random random = new Random();
        StringBuilder accountNumber = new StringBuilder();

        for(int i=0; i<10; i++){
            accountNumber.append(random.nextInt(10));
        }
        return accountNumber.toString();

    }

    @Override
    public String toString(){
        final StringBuilder sB = new StringBuilder("Bank account: {");     // skapa strängar mer effektivt
        sB.append("account number = ").append(this.accountNumber);
        sB.append(", ACCOUNT HOLDER = ").append(this.accountHolder);
        sB.append(", BALANCE = ").append(this.balance);
        sB.append("}");
        return  sB.toString();
    }


    @Override
    public void withdraw(double amount){
        if (amount <= 0.0){
            throw new IllegalArgumentException("Only positive values allowed"); //inte felhantering utan crash hantering 
        } else if (amount > this.balance) {
            throw new IllegalArgumentException("Not enough money");
        }

        this.balance -= amount;
    }

    @Override
    public void deposit(double amount){
        if(amount <= 0.0){
            throw new IllegalArgumentException("Only positive values allowed"); //inte felhantering utan crash hantering 
        } 
        this.balance += amount;
        
    }
    
    @Override
    public double getBalance(double amount){
        return 0;
        
    }

    @Override
    public void setAccountHolder(BankAccountHolder accountHolder){
        this.accountHolder = accountHolder;
    }

    //man vill inte kunna ändra nåns nmman 

    public static void main(String[] args) {
        BankAccountHolder s = new Student("test", "Theo", 5);
        //s.addAccount(new Custom);
        //s.addAccount();
        //BankAccount accont = CustomBankAccount(s, 100);
        //System.out.println(account);
        // account.withdraw(10);
    
    }
}
