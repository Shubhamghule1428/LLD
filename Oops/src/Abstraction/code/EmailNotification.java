package Abstraction.code;

public class EmailNotification implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending email to: " + recipient);
    }
}