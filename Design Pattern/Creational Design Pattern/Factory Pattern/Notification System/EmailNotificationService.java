// Concrete Creator - Email Notification Service
public class EmailNotificationService extends NotificationService {
    public EmailNotificationService() {
        super("Email Notification Service");
    }
    
    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
}
