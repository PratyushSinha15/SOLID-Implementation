package OCP.EX1.SOLUTION;

public enum NotificationType {
    EMAIL(new EmailNotifier()),
    SMS(new SmsNotifier()),
    WHATSAPP(new WatsAppNotifier());

    private final Notifier notifier;

    NotificationType(Notifier notifier) {
        this.notifier = notifier;
    }

    public Notifier getNotifier() {
        return notifier;
    }
}
