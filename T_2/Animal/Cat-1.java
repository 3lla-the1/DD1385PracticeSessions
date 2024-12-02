public class Cat extends Animal{


    @Override
    public void feed() {
        System.out.println("Feeding a cat");
        this.hungry = false;
    }
    
}
