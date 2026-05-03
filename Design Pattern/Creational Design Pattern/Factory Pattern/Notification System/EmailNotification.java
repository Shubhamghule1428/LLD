// Concrete Product 1 - Email Notification
import java.util.Map;

public class EmailNotification implements Notification {
    private String smtpServer;
    private int port;
    private String senderEmail;
    
    public EmailNotification() {
        this.smtpServer = "smtp.gmail.com";
        this.port = 587;
        this.senderEmail = "noreply@company.com";
        System.out.println("Email Notification service initialized");
    }
    
    @Override
    public void send(String recipient, String message) {
        if (validate(recipient)) {
            System.out.println("\n--- Sending Email ---");
            System.out.println("From: " + senderEmail);
            System.out.println("To: " + recipient);
            System.out.println("Subject: Notification");
            System.out.println("Body: " + message);
            System.out.println("SMTP Server: " + smtpServer + ":" + port);
            System.out.println("Email sent successfully!");
        }
    }
    
    @Override
    public boolean validate(String recipient) {
        boolean isValid = recipient.contains("@") && recipient.contains(".");
        if (!isValid) {
            System.out.println("Invalid email address: " + recipient);
        }
        return isValid;
    }
    
    @Override
    public String getNotificationType() {
        return "EMAIL";
    }
    
    @Override
    public void configure(Map<String, String> config) {
        if (config.containsKey("smtp")) {
            this.smtpServer = config.get("smtp");
        }
        if (config.containsKey("port")) {
            this.port = Integer.parseInt(config.get("port"));
        }
        System.out.println("Email configured: " + smtpServer + ":" + port);
    }
    
    public void attachFile(String filename) {
        System.out.println("Attachment added: " + filename);
    }
}
