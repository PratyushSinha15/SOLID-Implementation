package OCP.EX1.SOLUTION;

public class ExampleImplementation {
    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        service.sendNotification(NotificationType.EMAIL, "Hello World");
        service.sendNotification(NotificationType.SMS, "Hello World Via Sms");
        service.sendNotification(NotificationType.WHATSAPP, "Hello World Via Whatsapp");
    }
}
