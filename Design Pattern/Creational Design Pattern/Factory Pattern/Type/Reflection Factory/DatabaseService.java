// Concrete Product - Database Service
public class DatabaseService implements Service {
    @Override
    public void start() {
        System.out.println("Database service started");
    }
    
    @Override
    public void stop() {
        System.out.println("Database service stopped");
    }
    
    @Override
    public String getServiceName() {
        return "Database Service";
    }
}
