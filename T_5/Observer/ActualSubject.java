import java.util.ArrayList;
import java.util.List;

public class ActualSubject implements Subject {
    private List<Observer> observers = new ArrayList<>();
    private int state;

    @Override
    public void addObserver(Observer observer){
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifyObserver(){
        for (Observer o : observers) {
            o.update(state);
        }
    }

    @Override
    public void setState(int newState) {
        this.state = newState;
        this.notifyObserver();
    }

    
}
