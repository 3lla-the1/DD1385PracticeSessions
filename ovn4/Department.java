import java.util.ArrayList;
import java.util.List;

package ovn4;

public class Department extends Component{
    String name;
    private List<Components> employees = new ArrayList<>();
    
    @Override
    public void displayInfo(){
        
        
        System.out.println("depatment" + name);
        System.out.println("employees:");

        for (Component employee : employees){
            employee.displayInfo();


        }
        System.out.println();
    }

    public void addEmployee(){
        employees.add(employee);
    }

    public void removeEmployee(){
        employees.remove(employee);
        
    }
    

   

}
