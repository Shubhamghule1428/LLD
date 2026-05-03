// Concrete Product - Cache Service
public class CacheService implements Service {
    @Override
    public void start() {
        System.out.println("Cache service started");
    }
    
    @Override
    public void stop() {
        System.out.println("Cache service stopped");
    }
    
    @Override
    public String getServiceName() {
        return "Cache Service";
    }
}
