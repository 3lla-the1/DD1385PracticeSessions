package Animal;
public class Cat extends Animal {
    
    // Vi kan igentligen skita i konstruktorn, den defaultar! SÅ DEN KOMPILLERAS!
    Cat(){}

    @Override
    public void feed() {
        System.out.println("feeding cat");
        this.hungry = false;
    }
    
}
