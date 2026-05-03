// Creator (Abstract)
public abstract class NotificationService {
    protected String serviceName;
    
    public NotificationService(String serviceName) {
        this.serviceName = serviceName;
    }
    
    // Factory Method
    public abstract Notification createNotification();
    
    // Template method
    public void notify(String recipient, String message) {
        System.out.println("\n============================================================");
        System.out.println("Service: " + serviceName);
        
        Notification notification = createNotification();
        notification.send(recipient, message);
        
        System.out.println("============================================================");
    }
    
    public void notifyMultiple(String[] recipients, String message) {
        Notification notification = createNotification();
        
        System.out.println("\n============================================================");
        System.out.println("Service: " + serviceName);
        System.out.println("Sending to " + recipients.length + " recipients...");
        
        for (String recipient : recipients) {
            notification.send(recipient, message);
        }
        
        System.out.println("============================================================");
    }
}
