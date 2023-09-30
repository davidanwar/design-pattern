package course1.observer;

public class BinaryObserve extends Observery {

    public BinaryObserve(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String " + Integer.toBinaryString(subject.getState()));
    }
}
