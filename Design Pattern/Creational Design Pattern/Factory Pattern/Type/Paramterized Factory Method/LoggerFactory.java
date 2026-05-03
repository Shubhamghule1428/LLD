// Parameterized Factory
public class LoggerFactory {
    // Enum for logger types
    public enum LoggerType {
        CONSOLE,
        FILE,
        DATABASE
    }
    
    // Parameterized factory method
    public static Logger createLogger(LoggerType type, String level, String... params) {
        switch (type) {
            case CONSOLE:
                return new ConsoleLogger(level);
                
            case FILE:
                String filename = params.length > 0 ? params[0] : "app.log";
                return new FileLogger(level, filename);
                
            case DATABASE:
                String tableName = params.length > 0 ? params[0] : "logs";
                return new DatabaseLogger(level, tableName);
                
            default:
                throw new IllegalArgumentException("Unknown logger type");
        }
    }
    
    // Convenience methods for common scenarios
    public static Logger createConsoleLogger() {
        return createLogger(LoggerType.CONSOLE, "INFO");
    }
    
    public static Logger createFileLogger(String filename) {
        return createLogger(LoggerType.FILE, "DEBUG", filename);
    }
    
    public static Logger createDatabaseLogger() {
        return createLogger(LoggerType.DATABASE, "ERROR");
    }
}
