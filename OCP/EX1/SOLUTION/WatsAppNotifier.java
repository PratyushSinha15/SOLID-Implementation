package OCP.EX1.SOLUTION;

public class WatsAppNotifier implements Notifier {

    @Override
    public void send(String message) {
        System.out.println("Wats has been sent with message:- " + message);
    }
}
