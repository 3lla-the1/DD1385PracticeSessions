public class ActualObserver implements Observer{
    private String name;
    private int state;

    ActualObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(int newState) {
        this.state = newState;
        System.out.println(name + " received update: " + this.state);
    }


}
