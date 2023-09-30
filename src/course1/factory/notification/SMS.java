package course1.factory.notification;

public class SMS implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending SMS");
    }
}
