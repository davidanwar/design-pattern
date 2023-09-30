package course1.factory.notification;

public class NotificationFactory {
    public Notification getNotification(String notification) {
        if (notification == null || notification.isEmpty()) {
            return null;
        }

        switch (notification) {
            case "SMS":
                return new SMS();
            case "EMAIL":
                return new Email();
            case "PUSH":
                return new PushNotif();
            default:
                throw new IllegalArgumentException("Unknown Notification");
        }
    }
}
