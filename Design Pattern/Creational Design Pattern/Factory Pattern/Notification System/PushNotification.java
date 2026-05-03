// Concrete Product 3 - Push Notification
import java.util.Map;

public class PushNotification implements Notification {
    private String fcmKey;
    private String appId;
    
    public PushNotification() {
        this.fcmKey = "FCM_SERVER_KEY";
        this.appId = "com.company.app";
        System.out.println("Push Notification service initialized");
    }
    
    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("\n--- Sending Push Notification ---");
            System.out.println("Device Token: " + recipient);
            System.out.println("Message: " + message);
            System.out.println("App ID: " + appId);
            System.out.println("Priority: High");
            System.out.println("Push notification sent successfully!");
        }
    }
    
    @Override
    public boolean validate(String recipient) {
        // Device token validation
        boolean isValid = recipient.length() > 20;
        if (!isValid) {
            System.out.println("Invalid device token");
        }
        return isValid;
    }
    
    @Override
    public String getNotificationType() {
        return "PUSH";
    }
    
    @Override
    public void configure(Map<String, String> config) {
        if (config.containsKey("fcmKey")) {
            this.fcmKey = config.get("fcmKey");
        }
        if (config.containsKey("appId")) {
            this.appId = config.get("appId");
        }
        System.out.println("Push notification configured for app: " + appId);
    }
    
    public void setBadgeCount(int count) {
        System.out.println("Badge count set to: " + count);
    }
    
    public void setSound(String soundFile) {
        System.out.println("Notification sound: " + soundFile);
    }
}
