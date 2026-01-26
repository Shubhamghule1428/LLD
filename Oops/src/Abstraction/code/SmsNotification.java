package Abstraction.code;

public class SmsNotification implements NotificationService {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending SMS to: " + recipient);
    }
}