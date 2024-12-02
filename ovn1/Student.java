
public class Student implements BankAccountHolder {
    private String kthMail;     // Kommer åt mailen i bara denna klassen 
    public String name;         // Namnet kan alla komma åt 
    private int year;
    private BankAccount account; // itnerfacenamnet och inte klassnmanet 


    Student(String kthMail, String name, int year){
        this.kthMail = kthMail;
        this.name = name;
        this.year = year;
    }


    @Override
    public String toString(){
        final StringBuilder sB = new StringBuilder("Student: {");     // skapa strängar mer effektivt
        sB.append("KTH MAIL = ").append(this.kthMail);
        sB.append(", NAME = ").append(this.name);
        sB.append(", YEAR = ").append(this.year);
        sB.append("}");
        return  sB.toString();
    }


    @Override 
    public void addAccount(BankAcount account){
        this.account = account;

    }

    @Override 
    public void removeAccount(BankAccount account){
        this.account = null;

    }
    
    public static void main(String[] args) {
        BankAccountHolder s = new Student("tcame@kth.se", "Theo", 5);
        BankAccountHolder s2 = new Student("tcame@kth.se", "Theo2", 50);

        //en lista i java måste alla element vara av samma typ (funkar ej om vi har student och teacher)
        // Då kan vi använda baccholder för de är av samma interface!

        System.out.println(s);
        System.out.println(s2);
    }
}
