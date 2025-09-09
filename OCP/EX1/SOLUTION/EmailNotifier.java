package OCP.EX1.SOLUTION;

public class EmailNotifier implements Notifier {
    public void send(String message) {
        System.out.println("Email has been sent with message:- " + message);
    }
}
