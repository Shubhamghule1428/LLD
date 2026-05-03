// Concrete Product - Email Service
public class EmailService implements Service {
    @Override
    public void start() {
        System.out.println("Email service started");
    }
    
    @Override
    public void stop() {
        System.out.println("Email service stopped");
    }
    
    @Override
    public String getServiceName() {
        return "Email Service";
    }
}
