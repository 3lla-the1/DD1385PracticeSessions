import java.util.ArrayList;
import java.util.List;

public class Department extends Component {
    private String name;
    private List<Component> employees = new ArrayList<>();


    public Department(String name) {
        this.name = name;
    }

    public void addEmployee(Component employee) {
        employees.add(employee);
    }

    public void removeEmployee(Component employee) {
        employees.remove(employee);
    }


    @Override
    public void displayInfo() {
        System.out.println("Department:" + name);
        System.out.println("Employees: ");

        for (Component employee : employees) {
            employee.displayInfo();
        }
        System.out.println();
    }
}
