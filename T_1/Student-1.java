public class Student implements BankAccountHolder {
    private String kthMail;
    private String name;
    private int year;
    private BankAccount account;

    Student(String kthMail, String name, int year) {
        this.kthMail = kthMail;
        this.name = name;
        this.year = year;
    }

    @Override
    public String toString() {
        final StringBuilder sB = new StringBuilder("Student: {");
        sB.append("KTH MAIL = ").append(this.kthMail);
        sB.append(", NAME = ").append(this.name);
        sB.append(", YEAR = ").append(this.year);
        sB.append("}");
        return sB.toString();
    }


    @Override
    public void addAccount(BankAccount account) {
        System.out.println("Account added!");
        this.account = account;
    }

    @Override
    public void removeAccount(BankAccount account) {
        this.account = null;
    }


    public static void main(String[] args) {
        BankAccountHolder s = new Student("tcame@kth.se", "Théo", 5);
        BankAccountHolder s2 = new Student("tcame2@kth.se", "Théo2", 10);
        
        System.out.println(s);
        System.out.println(s2);

    }


}
