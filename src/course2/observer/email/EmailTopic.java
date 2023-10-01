package course2.observer.email;

import java.util.ArrayList;
import java.util.List;

public class EmailTopic implements Subject {

    private List<Observer> observers;
    private String message;

    public EmailTopic() {
        this.observers = new ArrayList<>();
    }

    @Override
    public void register(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void unregister(Observer observer) {
        observers.remove(observer);
    }

    @Override
    public void notifySubscriber() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    public void sendMessage(String message) {
        this.message = message;
        notifySubscriber();
    }

    public String getMessage() {
        return message;
    }
}
