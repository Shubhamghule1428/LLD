// Client Code - Reflection-Based Factory Demo
public class ReflectionFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Reflection-Based Factory ===\n");
        
        // Create using fully qualified class name
        Service emailService = ServiceFactory.createService("EmailService");
        
        // Create using Class object
        Service cacheService = ServiceFactory.createService(CacheService.class);
        Service dbService = ServiceFactory.createService(DatabaseService.class);
        
        // Use services
        emailService.start();
        System.out.println("Running: " + emailService.getServiceName());
        emailService.stop();
        
        System.out.println();
        cacheService.start();
        dbService.start();
        
        System.out.println("\n--- Services Running ---");
        Service[] services = {emailService, cacheService, dbService};
        for (Service service : services) {
            System.out.println("- " + service.getServiceName());
        }
    }
}
