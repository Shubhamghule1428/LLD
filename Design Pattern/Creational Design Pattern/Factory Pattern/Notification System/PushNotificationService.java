// Concrete Creator - Push Notification Service
public class PushNotificationService extends NotificationService {
    public PushNotificationService() {
        super("Push Notification Service");
    }
    
    @Override
    public Notification createNotification() {
        return new PushNotification();
    }
}
