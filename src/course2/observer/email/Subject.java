package course2.observer.email;

public interface Subject {
    void register(Observer observer);
    void unregister(Observer observer);
    void notifySubscriber();
}
