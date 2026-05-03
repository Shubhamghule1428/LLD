// Concrete Product 2 - SMS Notification
import java.util.Map;

public class SMSNotification implements Notification {
    private String apiKey;
    private String provider;
    
    public SMSNotification() {
        this.apiKey = "SMS_API_KEY_12345";
        this.provider = "Twilio";
        System.out.println("SMS Notification service initialized");
    }
    
    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("\n--- Sending SMS ---");
            System.out.println("To: " + recipient);
            System.out.println("Message: " + message);
            System.out.println("Provider: " + provider);
            System.out.println("Character count: " + message.length());
            
            // Truncate if too long
            if (message.length() > 160) {
                System.out.println("Message truncated to 160 characters");
            }
            
            System.out.println("SMS sent successfully!");
        }
    }
    
    @Override
    public boolean validate(String recipient) {
        // Check if it's a valid phone number
        boolean isValid = recipient.matches("\\+?[0-9]{10,15}");
        if (!isValid) {
            System.out.println("Invalid phone number: " + recipient);
        }
        return isValid;
    }
    
    @Override
    public String getNotificationType() {
        return "SMS";
    }
    
    @Override
    public void configure(Map<String, String> config) {
        if (config.containsKey("provider")) {
            this.provider = config.get("provider");
        }
        if (config.containsKey("apiKey")) {
            this.apiKey = config.get("apiKey");
        }
        System.out.println("SMS configured with provider: " + provider);
    }
    
    public void scheduleDelivery(String dateTime) {
        System.out.println("SMS scheduled for: " + dateTime);
    }
}
