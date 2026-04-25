import java.util.Map;
import java.util.Properties;
import java.util.concurrent.ConcurrentHashMap;

public enum ApplicationContext {
    INSTANCE; // Single instance
    
    private Map<String, Object> beans;
    private Properties properties;
    
    // Constructor called only once
    ApplicationContext() {
        System.out.println("ApplicationContext initialized");
        this.beans = new ConcurrentHashMap<>();
        this.properties = new Properties();
        initialize();
    }
    
    private void initialize() {
        // Initialize default beans
        registerBean("dataSource", new DataSource());
        registerBean("userService", new UserService());
        
        // Load properties
        properties.setProperty("app.env", "development");
        properties.setProperty("server.port", "8080");
    }
    
    public void registerBean(String name, Object bean) {
        beans.put(name, bean);
        System.out.println("Bean registered: " + name);
    }
    
    public Object getBean(String name) {
        return beans.get(name);
    }
    
    @SuppressWarnings("unchecked")
    public <T> T getBean(String name, Class<T> type) {
        Object bean = beans.get(name);
        if (bean != null && type.isInstance(bean)) {
            return (T) bean;
        }
        return null;
    }
    
    public String getProperty(String key) {
        return properties.getProperty(key);
    }
    
    public void setProperty(String key, String value) {
        properties.setProperty(key, value);
    }
    
    public void displayContext() {
        System.out.println("\n=== Application Context ===");
        System.out.println("Registered Beans: " + beans.keySet());
        System.out.println("Properties: " + properties);
    }
}

class DataSource {
    public void connect() {
        System.out.println("DataSource connected");
    }
}

class UserService {
    public void createUser(String username) {
        System.out.println("User created: " + username);
    }
}
