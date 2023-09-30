package course1.observer;

import java.util.ArrayList;
import java.util.List;

public class Subject {
    private List<Observery> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    public void subscribeToList(Observery observery) {
        observers.add(observery);
    }

    private void notifyAllObservers() {
        for (Observery observery : observers) {
            observery.update();
        }
    }
}
