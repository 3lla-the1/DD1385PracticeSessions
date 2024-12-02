public class test {
    public static void main(String[] args) {
        Employee Theo = new Employee("Theo", "Asse");
        Employee Theo2 = new Employee("Theo2", "Student");

        Department sci = new Department("sci");
        Department eecs = new Department("eecs");

        sci.addEmployee(Theo);
        eecs.addEmployee(Theo2);

        Department KTH = new Department("KTH");
        KTH.addEmployee(sci);
        KTH.addEmployee(eecs);

        KTH.displayInfo();




        
    }
}
