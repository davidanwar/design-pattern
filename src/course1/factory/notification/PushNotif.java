package course1.factory.notification;

public class PushNotif implements Notification {

    @Override
    public void notifyUser() {
        System.out.println("Sending Push Notification");
    }
}
