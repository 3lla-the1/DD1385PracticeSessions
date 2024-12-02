package Animal;
public class Dog extends Animal {
    public int timesFed = 0;
    Dog(){}

    @Override
    public void feed() {
        System.out.println("feeding cat");
        this.hungry = false;
        this.timesFed++;
    }
    
}
