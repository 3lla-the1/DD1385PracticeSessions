public class Dog extends Animal {
    public int timesFed = 0;

    @Override
    public void feed() {
        System.out.println("Feeding a cat");
        this.hungry = false;
        this.timesFed++;
    }

}
