package OCP.EX1.SOLUTION;

public class NotificationService {
    public void sendNotification(NotificationType type, String message) {
        type.getNotifier().send(message);
    }
}
