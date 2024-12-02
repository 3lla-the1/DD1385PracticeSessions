public class test {
    public static void main(String[] args) {
        Coffee simpleCoffee = new SimpleCoffee();
        System.out.println("Cost: " + simpleCoffee.cost() + ", Description: " + simpleCoffee.description()); 

        Coffee milkCoffe = new MilkDecorator(simpleCoffee);
        System.out.println("Cost: " + milkCoffe.cost() + ", Description: " + milkCoffe.description()); 

        Coffee sugarCoffee = new SugarDecorator(milkCoffe);
        System.out.println("Cost: " + sugarCoffee.cost() + ", Description: " + sugarCoffee.description()); 
        
        Coffee extrarsugarCoffee = new SugarDecorator(sugarCoffee);
        // System.out.println("Cost: " + extrarsugarCoffee.cost() + ", Description: " + extrarsugarCoffee.description()); 
        


    }
}
