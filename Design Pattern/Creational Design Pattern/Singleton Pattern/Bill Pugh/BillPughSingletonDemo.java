public class BillPughSingletonDemo {
    public static void main(String[] args) {
        System.out.println("Application starting...");
        System.out.println("ConfigurationManager not yet created\n");
        
        // Instance created only when first accessed
        ConfigurationManager config = ConfigurationManager.getInstance();
        
        config.displayConfiguration();
        
        // Get properties
        String appName = config.getProperty("app.name");
        int maxConnections = config.getIntProperty("max.connections", 50);
        
        System.out.println("\nApp Name: " + appName);
        System.out.println("Max Connections: " + maxConnections);
        
        // Set new properties
        config.setProperty("environment", "production");
        config.setProperty("debug.mode", "false");
        
        // Load additional config
        config.loadFromFile("config.properties");
        
        config.displayConfiguration();
        
        // Verify singleton
        ConfigurationManager config2 = ConfigurationManager.getInstance();
        System.out.println("\nconfig == config2: " + (config == config2));
    }
}

// Output
// Application starting...
// ConfigurationManager not yet created

// ConfigurationManager instance created
// Default configuration loaded

// === Current Configuration ===
// db.port = 3306
// db.host = localhost
// max.connections = 100
// app.name = MyApplication
// db.username = admin
// timeout = 30
// app.version = 1.0.0

// App Name: MyApplication
// Max Connections: 100
// Property set: environment = production
// Property set: debug.mode = false
// Loading configuration from: config.properties

// === Current Configuration ===
// environment = production
// debug.mode = false
// db.port = 3306
// loaded.from = config.properties
// db.host = localhost
// max.connections = 100
// app.name = MyApplication
// db.username = admin
// timeout = 30
// app.version = 1.0.0

// config == config2: true

// It demonstrates that the ConfigurationManager instance is created only when getInstance() is called for the first time, which is the essence of the Bill Pugh Singleton pattern. The inner static helper class (SingletonHelper) is not loaded until getInstance() is called, ensuring lazy initialization and thread safety without synchronization overhead.
// It's thread-safe because the instance is created in a static inner class, which is loaded by the JVM only when it is first accessed. This ensures that the instance is created in a thread-safe manner without the need for synchronization, as the class loading mechanism guarantees that only one thread can load the class at a time.