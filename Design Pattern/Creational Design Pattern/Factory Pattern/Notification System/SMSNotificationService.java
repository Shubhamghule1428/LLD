// Concrete Creator - SMS Notification Service
public class SMSNotificationService extends NotificationService {
    public SMSNotificationService() {
        super("SMS Notification Service");
    }
    
    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
}
