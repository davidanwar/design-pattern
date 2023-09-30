package course1.factory.notification;

public class Email implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending Email");
    }
}
