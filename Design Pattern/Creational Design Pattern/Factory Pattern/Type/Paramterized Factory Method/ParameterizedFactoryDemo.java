// Client Code - Parameterized Factory Method Demo
public class ParameterizedFactoryDemo {
    public static void main(String[] args) {
        System.out.println("=== Parameterized Factory Method ===\n");
        
        // Create different loggers with parameters
        Logger consoleLogger = LoggerFactory.createLogger(
            LoggerFactory.LoggerType.CONSOLE, 
            "INFO"
        );
        
        Logger fileLogger = LoggerFactory.createLogger(
            LoggerFactory.LoggerType.FILE, 
            "DEBUG", 
            "application.log"
        );
        
        Logger dbLogger = LoggerFactory.createLogger(
            LoggerFactory.LoggerType.DATABASE, 
            "ERROR", 
            "system_logs"
        );
        
        // Use loggers
        consoleLogger.log("Application started");
        fileLogger.log("User logged in");
        dbLogger.log("Database connection failed");
        
        // Using convenience methods
        System.out.println("\n--- Using Convenience Methods ---");
        Logger defaultConsole = LoggerFactory.createConsoleLogger();
        defaultConsole.log("Default console message");
        
        Logger customFile = LoggerFactory.createFileLogger("custom.log");
        customFile.log("Custom file message");
    }
}
