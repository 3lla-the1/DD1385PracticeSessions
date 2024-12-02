public abstract class Animal {
    public boolean hungry = true;

    public boolean isHungry() {
        return hungry;
    }

    public abstract void feed();
}