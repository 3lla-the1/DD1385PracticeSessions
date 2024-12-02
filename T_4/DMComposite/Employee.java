public class Employee extends Component{
    private String name;
    private String position;

    Employee(String name, String position){
        this.name = name;
        this.position = position;
    }


    @Override
    public void displayInfo() {
        System.out.println("Name: " + name + ", Position: " + position);
    }

}
