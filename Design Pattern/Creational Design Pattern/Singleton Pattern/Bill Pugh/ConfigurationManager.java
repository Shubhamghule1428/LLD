import java.util.HashMap;
import java.util.Map;

public class ConfigurationManager {
    private Map<String, String> config;

    private ConfigurationManager() {
        System.out.println("ConfigurationManager instance created");
        this.config = new HashMap<>();
        loadDefaultConfiguration();
    }

    // Inner static helper class - loaded only when getInstance() is called
    private static class SingletonHelper {
        // Static initialization is thread-safe by JVM
        private static final ConfigurationManager INSTANCE = new ConfigurationManager();
    }

    public static ConfigurationManager getInstance() {
        return SingletonHelper.INSTANCE;
    }

    private void loadDefaultConfiguration() {
        config.put("app.name", "MyApplication");
        config.put("app.version", "1.0.0");
        config.put("db.host", "localhost");
        config.put("db.port", "3306");
        config.put("db.username", "admin");
        config.put("max.connections", "100");
        config.put("timeout", "30");
        System.out.println("Default configuration loaded");
    }

    public String getProperty(String key) {
        return config.get(key);
    }

    public void setProperty(String key, String value) {
        config.put(key, value);
        System.out.println("Property set: " + key + " = " + value);
    }

    public int getIntProperty(String key, int defaultValue) {
        String value = config.get(key);
        if (value != null) {
            try {
                return Integer.parseInt(value);
            } catch (NumberFormatException e) {
                return defaultValue;
            }
        }
        return defaultValue;
    }

    public void displayConfiguration() {
        System.out.println("\n=== Current Configuration ===");
        config.forEach((key, value) -> System.out.println(key + " = " + value));
    }

    public void loadFromFile(String filename) {
        System.out.println("Loading configuration from: " + filename);
        // Simulate loading from file
        config.put("loaded.from", filename);
    }
}
