package OCP.EX1;

public class problemCode {
    enum NotificationType {
        EMAIL,
        SMS,
        WHATSAPP
    }

    static class NotificationService {
        public void sendNotification(NotificationType type, String message) {
            if (type == NotificationType.EMAIL) {
                System.out.println("Sending EMAIL: " + message);
            } else if (type == NotificationType.SMS) {
                System.out.println("Sending SMS: " + message);
            } else if (type == NotificationType.WHATSAPP) {
                System.out.println("Sending WhatsApp: " + message);
            }
        }
    }

    public static void main(String[] args) {
        NotificationService service = new NotificationService();
        // Email bhejna
        service.sendNotification(NotificationType.EMAIL, "Welcome to our platform!");
        // SMS bhejna
        service.sendNotification(NotificationType.SMS, "Your OTP is 1234");
        // WhatsApp bhejna
        service.sendNotification(NotificationType.WHATSAPP, "Your order has been shipped 🚚");
    }

}
