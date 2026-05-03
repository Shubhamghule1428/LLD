// Reflection-based Factory
import java.lang.reflect.Constructor;

public class ServiceFactory {
    // Create service using class name
    public static Service createService(String className) {
        try {
            Class<?> clazz = Class.forName(className);
            return (Service) clazz.getDeclaredConstructor().newInstance();
        } catch (ClassNotFoundException e) {
            throw new IllegalArgumentException("Class not found: " + className);
        } catch (Exception e) {
            throw new RuntimeException("Failed to create service: " + className, e);
        }
    }
    
    // Create service using Class object
    public static <T extends Service> T createService(Class<T> serviceClass) {
        try {
            return serviceClass.getDeclaredConstructor().newInstance();
        } catch (Exception e) {
            throw new RuntimeException("Failed to create service", e);
        }
    }
    
    // Create service with constructor parameters
    public static Service createService(String className, Object... args) {
        try {
            Class<?> clazz = Class.forName(className);
            
            // Find matching constructor
            Class<?>[] paramTypes = new Class[args.length];
            for (int i = 0; i < args.length; i++) {
                paramTypes[i] = args[i].getClass();
            }
            
            Constructor<?> constructor = clazz.getConstructor(paramTypes);
            return (Service) constructor.newInstance(args);
            
        } catch (Exception e) {
            throw new RuntimeException("Failed to create service with args", e);
        }
    }
}
