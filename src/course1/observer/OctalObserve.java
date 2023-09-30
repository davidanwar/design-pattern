package course1.observer;

public class OctalObserve extends Observery {
    public OctalObserve(Subject subject) {
        this.subject = subject;
        this.subject.subscribeToList(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String " + Integer.toOctalString(subject.getState()));
    }
}
