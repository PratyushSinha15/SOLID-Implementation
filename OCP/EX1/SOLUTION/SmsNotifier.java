package OCP.EX1.SOLUTION;

public class SmsNotifier implements Notifier {
    @Override
    public void send(String message) {
        System.out.println("SMS has been sent with message:- " + message);
    }
}
