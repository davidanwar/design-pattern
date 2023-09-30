package course1.observer;

public class HexaObserve extends Observery {

    public HexaObserve(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Hexa String " + Integer.toHexString(subject.getState()));
    }
}
