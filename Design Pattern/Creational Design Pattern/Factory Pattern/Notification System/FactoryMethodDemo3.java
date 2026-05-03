// Client Code - Notification System Demo
import java.util.HashMap;
import java.util.Map;

public class FactoryMethodDemo3 {
    public static void main(String[] args) {
        System.out.println("=== Notification System ===\n");
        
        // Email notification
        NotificationService emailService = new EmailNotificationService();
        emailService.notify("user@example.com", "Your order has been shipped!");
        
        // SMS notification
        NotificationService smsService = new SMSNotificationService();
        smsService.notify("+1234567890", "Your OTP is: 123456");
        
        // Push notification
        NotificationService pushService = new PushNotificationService();
        pushService.notify(
            "device_token_abc123xyz789",
            "You have a new message from John!"
        );
        
        // Bulk notification
        System.out.println("\n=== Bulk Email Notification ===");
        emailService.notifyMultiple(
            new String[]{"user1@example.com", "user2@example.com", "user3@example.com"},
            "System maintenance scheduled for tonight"
        );
        
        // Configuration example
        System.out.println("\n=== Custom Configuration ===");
        Notification email = new EmailNotification();
        Map<String, String> config = new HashMap<>();
        config.put("smtp", "smtp.custom.com");
        config.put("port", "465");
        email.configure(config);
    }
}

// output

/**
=== Notification System ===


============================================================
Service: Email Notification Service
Email Notification service initialized

--- Sending Email ---
From: noreply@company.com
To: user@example.com
Subject: Notification
Body: Your order has been shipped!
SMTP Server: smtp.gmail.com:587
Email sent successfully!
============================================================

============================================================
Service: SMS Notification Service
SMS Notification service initialized

--- Sending SMS ---
To: +1234567890
Message: Your OTP is: 123456
Provider: Twilio
Character count: 19
SMS sent successfully!
============================================================

============================================================
Service: Push Notification Service
Push Notification service initialized

--- Sending Push Notification ---
Device Token: device_token_abc123xyz789
Message: You have a new message from John!
App ID: com.company.app
Priority: High
Push notification sent successfully!
============================================================

=== Bulk Email Notification ===
Email Notification service initialized

============================================================
Service: Email Notification Service
Sending to 3 recipients...

--- Sending Email ---
From: noreply@company.com
To: user1@example.com
Subject: Notification
Body: System maintenance scheduled for tonight
SMTP Server: smtp.gmail.com:587
Email sent successfully!

--- Sending Email ---
From: noreply@company.com
To: user2@example.com
Subject: Notification
Body: System maintenance scheduled for tonight
SMTP Server: smtp.gmail.com:587
Email sent successfully!

--- Sending Email ---
From: noreply@company.com
To: user3@example.com
Subject: Notification
Body: System maintenance scheduled for tonight
SMTP Server: smtp.gmail.com:587
Email sent successfully!
============================================================

=== Custom Configuration ===
Email Notification service initialized
Email configured: smtp.custom.com:465
*/